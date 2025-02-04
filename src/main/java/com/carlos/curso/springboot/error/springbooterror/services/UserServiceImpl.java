package com.carlos.curso.springboot.error.springbooterror.services;

import com.carlos.curso.springboot.error.springbooterror.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private List<User> users;

  @Autowired
  @Qualifier("getUsers")
  public void setUsers(List<User> users) {
    this.users = users;
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
