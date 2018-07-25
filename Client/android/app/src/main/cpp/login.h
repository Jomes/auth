//
// Created by Jomelu on 2018/7/25.
//

#ifndef LOGINAUTH_LOGIN_H
#define LOGINAUTH_LOGIN_H

#include <string>
#include <cstring>

///* Define of btye.*/
//typedef unsigned char byte;
///* Define of byte. */
//typedef unsigned int bit32;
const int  LOGIN_FAIL = -1;

class login {

    int login(const char *user_name, const char *password);

    int logout();

};


#endif //LOGINAUTH_LOGIN_H
