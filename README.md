# 🚀 Projeto Web Services com Spring Boot, JPA e Hibernate

## 📑 Documentação da API (Swagger)

A API conta com documentação interativa gerada automaticamente com **Swagger (OpenAPI)**, permitindo explorar e testar todos os endpoints diretamente pelo navegador, sem necessidade de ferramentas externas como Postman ou Insomnia.

🔗 **Acesse o Swagger da aplicação em produção:** [Link para o Swagger](https://projeto-web-services-com-springboot-jpa.onrender.com/swagger-ui/index.html)

### Funcionalidades disponíveis no Swagger:

* Visualização completa dos endpoints REST.
* Teste de requisições HTTP (GET, POST, PUT, DELETE).
* Análise dos modelos de dados da aplicação.
* Facilita o entendimento da API para desenvolvedores e recrutadores.

---

## 📘 Sobre o Projeto

Este projeto consiste em uma **API REST desenvolvida em Java com Spring Boot**, utilizando **JPA/Hibernate** para persistência de dados. Foi construído como parte de um estudo prático baseado no curso *Java COMPLETO* do **Nélio Alves (DevSuperior)**, com adaptações para **deploy em nuvem no Render**, Dockerização e uso de banco de dados PostgreSQL.

O objetivo principal é demonstrar domínio de **boas práticas de desenvolvimento back-end**, arquitetura em camadas e integração com banco de dados relacional.

---

## 📌 Objetivos do Projeto

* Criar uma aplicação Spring Boot seguindo boas práticas.
* Implementar um **modelo de domínio bem definido**.
* Estruturar a aplicação em **camadas lógicas** (Resource, Service, Repository).
* Utilizar **JPA/Hibernate** para mapeamento objeto-relacional.
* Implementar operações **CRUD** completas.
* Realizar **tratamento adequado de exceções**.
* Trabalhar com **múltiplos profiles** (test/dev).
* Realizar **deploy em ambiente de nuvem** utilizando o Render.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Framework:** Spring Boot (Web, Data JPA)
* **ORM:** Hibernate
* **Banco de Dados:** H2 (Testes) / PostgreSQL (Produção)
* **Gerenciador de Dependências:** Maven
* **DevOps:** Docker & Render
* **Documentação:** Swagger / OpenAPI

---

## 🧱 Arquitetura do Projeto

O projeto segue o padrão de **arquitetura em camadas**, promovendo separação de responsabilidades e maior manutenibilidade:

1. **Resource (Controller):** Expõe os endpoints REST.
2. **Service:** Contém a lógica de negócio.
3. **Repository:** Acesso aos dados via Spring Data JPA.
4. **Entities:** Classes de domínio mapeadas com JPA.

---

## 📊 Modelo de Domínio

### Principais entidades do sistema:

* User
* Order
* Product
* Category
* OrderItem
* Payment

### Relacionamentos implementados:

* **One-to-Many / Many-to-One** (Usuário e Pedidos)
* **Many-to-Many** (Produtos e Categorias com `JoinTable`)
* **One-to-One** (Pedido e Pagamento)
<img width="930" height="444" alt="image" src="https://github.com/user-attachments/assets/9f4b3986-d1bc-4b98-b878-577a1c11428b" />

---

## ⚙️ Configuração de Perfis

### application.properties

Define o perfil ativo e configurações globais.

```properties
spring.profiles.active=dev
spring.jpa.open-in-view=true

```

### application-test.properties (H2)

Utilizado para testes em memória:

* Console H2 habilitado.
* Banco em memória.
* SQL exibido no log.

### application-dev.properties (PostgreSQL)

Utilizado para desenvolvimento e produção no Render, com variáveis de ambiente para credenciais do banco.

---

## ▶️ Executando o Projeto Localmente

1. **Clone o repositório:**
```bash
git clone <url-do-repositorio>

```


2. **Acesse o diretório do projeto:**
```bash
cd projeto-web-services

```


3. **Execute a aplicação:**
```bash
./mvnw spring-boot:run

```



A aplicação estará disponível em: `http://localhost:8080`

---

## ☁️ Deploy no Render

O projeto foi preparado para deploy utilizando:

* **Dockerfile:** Para conteinerização.
* **PostgreSQL:** Gerenciado pelo Render.
* **Variáveis de Ambiente:** Para segurança das credenciais.
* **Porta Dinâmica:** Configurada para a porta fornecida pela plataforma.

### 🧪 Endpoint de Verificação

```http
GET /

```

**Resposta esperada:** `API rodando com sucesso 🚀`

---

## 👩‍💻 Autora

**Isabele Torres**

* Técnica em Eletroeletrônica
* Graduanda em Sistemas de Informação
* Back-end Developer | QA

## 📚 Referência

Projeto baseado no curso *Java COMPLETO – Programação Orientada a Objetos + Projetos*.

**Instrutor:** Nélio Alves (DevSuperior)

---
