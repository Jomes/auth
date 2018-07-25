#include <jni.h>
#include <string>
#include "md5.h"


extern "C"
JNIEXPORT jstring JNICALL
Java_auth_wx_com_loginauth_MainActivity_login(JNIEnv *env, jobject instance, jstring username_,
                                              jstring password_) {
  const char *username = env->GetStringUTFChars(username_, 0);
  const char *password = env->GetStringUTFChars(password_, 0);

  std::string md5_str=MD5(password).toStr();

  // TODO
  //std::string hello = "{token:sfewm131m34m1m1o4o1m,time:150122030}";

  env->ReleaseStringUTFChars(username_, username);
  env->ReleaseStringUTFChars(password_, password);

  return env->NewStringUTF(md5_str.c_str());
}
