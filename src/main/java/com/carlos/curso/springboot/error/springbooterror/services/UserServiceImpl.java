package com.carlos.curso.springboot.error.springbooterror.services;

import com.carlos.curso.springboot.error.springbooterror.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private List<User> users;

  public UserServiceImpl() {
    this.users = Arrays.asList(
      new User(1L, "Pepe", "Gonzalez"),
      new User(2L, "Andres", "Mena"),
      new User(3L, "María", "Perez"),
      new User(4L, "Josefa", "Ramirez"),
      new User(5L, "Ale", "Gutierrez")
    );
  }

  @Override
  public List<User> findAll() {
    return users;
  }

  @Override
  public Optional<User> findById(Long id) {
    return users.stream()
      .filter(p -> p.getId().equals(id))
      .findFirst();
  }
}
