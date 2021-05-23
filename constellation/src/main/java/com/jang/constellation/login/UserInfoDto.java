package com.jang.constellation.login;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserInfoDto {
  private String name;
  private String id;
  private String email;
  private String password;

  private String auth;
}