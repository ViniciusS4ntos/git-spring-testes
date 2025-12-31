package com.vinicius.git_spring_testes.repository;

import com.vinicius.git_spring_testes.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    /*

    Fazer UserRepository herda de JpaRepository<entidade, Tipo de  id>
    faz com q teremos meotods adicionados como:

    save()
    findAll()
    findById()
    deleteById()

    para ajudar


    * */
}
