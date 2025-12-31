package com.vinicius.git_spring_testes.service;

import com.vinicius.git_spring_testes.entity.UserEntity;
import com.vinicius.git_spring_testes.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// SpringFramwork | @Service - faz essa classe fazer parte da regra de negocio da aplicacao - deve ser gerenciada pelo spring
@Service

// LOMBOK | @RequiredArgsConstructor - gera o construtor com dependecias obrigatorias ( final )/ O spring  usar esse construtora para injecoes de dependencia
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public UserEntity create(UserEntity user){
        return repository.save(user);
    }

    public List<UserEntity> findAll(){
        return repository.findAll();
    }
}
