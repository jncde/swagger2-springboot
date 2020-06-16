package com.example.swagger2springboot;

public class Contact {


  private String id;
  private String name;

  public String getName () {
    return name;
  }

  public void setName (String name) {
    this.name = name;
  }

  public String getPhone () {
    return phone;
  }

  public void setPhone (String phone) {
    this.phone = phone;
  }

  private String phone;

  public String getId () {
    return id;
  }

  public void setId (String id) {
    this.id = id;
  }
}
