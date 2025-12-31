package com.vinicius.git_spring_testes.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

//JPA - @Entity - Transforma a classe em uma tabela | transformar em identidade JPA ( tabela do banco )
@Entity

//JPA | @Table - escolhe o nome da tabela
@Table(name = "users")

//LOMBOK | @Getter/@Setter - criam os Setters e Getters da  classe
@Getter
@Setter

//LOMBOK | @NoArgsConstructor - Cria construtor vazio da classe
@NoArgsConstructor

//LOMBOK | @AllArgsConstructor  - Cria construtor com os atributos dados
@AllArgsConstructor

//LOMBOK | @Builder - Adicionar o metodo builder() a classe para melhor organizameento
@Builder

public class User {
    // JPA | @Id - faz o atributo vira PK ( primary key )
    @Id

    // JPA | @GeneratedValue(strategy  = GeneratioType.IDENTITY - cria um auto_increment no h2
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
