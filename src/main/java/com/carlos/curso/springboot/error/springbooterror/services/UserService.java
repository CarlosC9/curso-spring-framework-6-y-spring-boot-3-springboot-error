package com.carlos.curso.springboot.error.springbooterror.services;

import com.carlos.curso.springboot.error.springbooterror.models.domain.User;

import java.util.List;

public interface UserService {

  List<User> findAll();

  User findById(Long id);

}
