package com.carlos.curso.springboot.error.springbooterror.models.domain;

public class User {

  private String name;
  private String lastName;
  private Long id;

  private Role role;

  public User() {
  }

  public User(Long id, String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getRoleName() {
    return role.getName();
  }
}
