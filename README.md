# 🔧 Sistema de Gestão de Oficina

Aplicação Full Stack desenvolvida como projeto acadêmico no **SENAI** para o gerenciamento operacional de uma oficina mecânica. O sistema permite realizar o controle completo (CRUD) de **Clientes**, **Veículos**, **Mecânicos**, **Peças** e **Ordens de Serviço**, integrando uma API RESTful em Java Spring Boot com banco de dados relacional MySQL e interface web responsiva.

---

## 🚀 Tecnologias Utilizadas

### Back-end
* **Java** & **Spring Boot**
* **Spring Web** 
* **Spring Data JPA** 
* **Jakarta Bean Validation** 
* **Lombok** 
* **Springdoc OpenAPI / Swagger UI** 
* **MySQL** 

### Front-end
* **HTML5** 
* **CSS3** 
* **JavaScript (ES6+)** 

---

## 🏗️ Arquitetura do Projeto

O projeto segue o padrão de **Arquitetura em Camadas**, garantindo separação de responsabilidades e facilidade de manutenção:

```text
src/
├── main/
│   ├── java/com/senai/oficina/
│   │   ├── Controller/      # Endpoints REST (@RestController) e respostas HTTP
│   │   ├── Service/         # Regras de negócio e validação de relacionamentos
│   │   ├── Repository/      # Interfaces de acesso ao banco (JpaRepository)
│   │   ├── Entity/          # Modelos JPA mapeados para as tabelas do MySQL
│   │   └── OficinaApplication.java
│   └── resources/
│       ├── static/          # Front-end integrado (index.html, style.css, script.js)
│       └── application.properties
docs/
└── oficina.sql              # Script de criação e modelagem do banco de dados
