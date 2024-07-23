# Projeto de Backend de Login com Spring Security

Este projeto demonstra a implementação de um sistema de autenticação e autorização utilizando Spring Security em um backend Java. A classe `Usuario` é responsável por representar os usuários que serão autenticados pelo login.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 2.5.0
- Spring Security 5.5.0
- JPA (Java Persistence API)
- H2 Database (para fins de teste)
- Maven
- JWT

## Funcionalidades

- Registro de novos usuários
- Autenticação de usuários existentes
- Proteção de endpoints com base em roles
- Configuração de segurança customizada

## Estrutura do Projeto

  - `config`: Configurações de segurança
  - `controller`: Controladores REST
  - `model`: Entidades JPA
  - `repository`: Interfaces de repositórios JPA
  - `service`: Serviços de negócio

