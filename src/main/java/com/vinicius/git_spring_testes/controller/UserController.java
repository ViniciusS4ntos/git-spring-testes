package com.vinicius.git_spring_testes.controller;

import com.vinicius.git_spring_testes.entity.UserEntity;
import com.vinicius.git_spring_testes.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// SpringFramework | @RestController - Essa classe é um Controller REST, responsável por receber requisições HTTP e retornar respostas (geralmente JSON)
@RestController

// SpringFramework || @RequestMapping -
@RequestMapping("/users")

// LOMBOK  | @ RequiredArgsConstructor - gera o construtor com dependecias obrigatorias ( final )/ O spring  usar esse construtora para injecoes de dependencia
@RequiredArgsConstructor
public class UserController {

    private final UserService  service;

    // SpringFramework | @PostMapping - indica que o método cria um novo recurso na API.
    @PostMapping
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity user){
        return ResponseEntity.ok(service.create(user));
    }

    // SpringFramework | @GetMapping - indica que o método lista ou busca dados. Ele responde a requisições HTTP GET.
    @GetMapping
    public ResponseEntity<List<UserEntity>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }


}
