package com.carlos.curso.springboot.error.springbooterror.services;

import com.carlos.curso.springboot.error.springbooterror.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

  List<User> findAll();

  Optional<User> findById(Long id);

}
