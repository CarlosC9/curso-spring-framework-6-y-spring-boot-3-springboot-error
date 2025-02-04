package com.carlos.curso.springboot.error.springbooterror;

import com.carlos.curso.springboot.error.springbooterror.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

  @Bean
  public List<User> getUsers() {
    return Arrays.asList(
      new User(1L, "Pepe", "Gonzalez"),
      new User(2L, "Andres", "Mena"),
      new User(3L, "María", "Perez"),
      new User(4L, "Josefa", "Ramirez"),
      new User(5L, "Ale", "Gutierrez")
    );
  }

}
