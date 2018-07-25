/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wx.auth;

import com.wx.auth.filter.Filter;
import com.wx.auth.filter.LoginFilter;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class AuthServer {
  private static final Logger logger = Logger.getLogger(AuthServer.class.getName());

  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 8080;
    server = ServerBuilder.forPort(port)
        .addService(new GreeterImpl())
        .build()
        .start();
    logger.info(" Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        AuthServer.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    final AuthServer server = new AuthServer();
    server.start();
    server.blockUntilShutdown();
  }

  static class GreeterImpl extends AuthServiceGrpc.AuthServiceImplBase {

    @Override
    public void login(LoginRequest request, StreamObserver<UserInfo> responseObserver) {
      Filter filter = new LoginFilter();
      if(filter.isLegalRequest(request)) {
        logger.info(" Legal request ....." );
        CommomReply commomReply = CommomReply.newBuilder().setType(-1).build();
        UserInfo userInfo = UserInfo.newBuilder().setCommon(commomReply).build();
        responseObserver.onNext(userInfo);
        responseObserver.onCompleted();
        return;
      }
      //DB 操作 TODO
      //返回 userinfo TODO
    }

    @Override
    public void register(RegRequest request, StreamObserver<UserInfo> responseObserver) {
      super.register(request, responseObserver);
    }
  }
}
