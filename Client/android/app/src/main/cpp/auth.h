//
// Created by Jomelu on 2018/7/25.
//

#ifndef LOGINAUTH_AUTH_H
#define LOGINAUTH_AUTH_H

#include <string>
using std::string;


class auth {

public:
    //获取token
    string getToken();
    //验证是否返回参数是否被串改
    bool verify(string token);
};


#endif //LOGINAUTH_AUTH_H
