//
// Created by Jomelu on 2018/7/25.
//

#include "login.h"
#include "md5.h"

login::login(const char *user_name, const char *password) {

  if(user_name =="" || password == "" ) {
    return ;
  }
  string pwdMd5=MD5(password).toStr();




}
