package com.hy.entity;

import org.springframework.web.multipart.MultipartFile;

public class User {

  private Integer id;
  private String username;
  private String password;
  private String avatar;
  private MultipartFile file;

  public User() {
  }

  public User(Integer id, String username, String password, String avatar, MultipartFile file) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.avatar = avatar;
    this.file = file;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public MultipartFile getFile() {
    return file;
  }
  public void setFile(MultipartFile file) {
    this.file = file;
  }


}
