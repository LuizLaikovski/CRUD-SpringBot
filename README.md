### Meu primeiro CRUD usando SpringBoot

Um CRUD simples para começar a entender o funcionamento do framework. Ele foi feito usando H2 Database, Lombok, JPA e Spring Web.

## 🛠️ Tecnologias e Dependências

O projeto foi desenvolvido com as seguintes tecnologias:

### Core & Framework
* **Java 21**: Versão da linguagem.
* **Spring Boot 4.0.6**: Framework principal.

### Dependências (Maven)
* **Spring Data JPA**: Abstração para persistência de dados e integração com o banco.
* **Spring Web**: Para criação de endpoints REST e processamento de requisições web.
* **Lombok**: Para reduzir verbosidade do código (annotations para getters, setters, construtores, etc).
* **H2 Database**: Banco de dados relacional em memória, ideal para desenvolvimento e testes rápidos.
* **H2 Console**: Interface web para visualização e gerenciamento do banco H2 (acessível via `/h2-console`).

### Testes
* **Spring Boot Starter Test**: Conjunto de bibliotecas para testes unitários e de integração (Junit, Mockito, AssertJ, etc).