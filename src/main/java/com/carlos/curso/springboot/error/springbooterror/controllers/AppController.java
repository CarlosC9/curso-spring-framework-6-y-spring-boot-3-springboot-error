package com.carlos.curso.springboot.error.springbooterror.controllers;

import com.carlos.curso.springboot.error.springbooterror.models.domain.User;
import com.carlos.curso.springboot.error.springbooterror.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

  private UserService userService;

  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public String index() {
//    int value = 100 / 0;
    int value = Integer.parseInt("20x");
    return "ok 200";
  }

  @GetMapping("/show/{id}")
  public User show(
    @PathVariable Long id
  ) {
    User user = this.userService.findById(id);
    System.out.println(user.getLastName());
    return user;
  }


}
