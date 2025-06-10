# 🌀 First Spring App

Bem-vindo ao **First Spring App**, um projeto base desenvolvido com **Spring Boot**, com foco em arquitetura limpa, modularização de camadas e boas práticas para criação de APIs RESTful.

---

## 📌 Descrição

Este projeto é um exemplo prático de como estruturar uma aplicação Spring Boot com separação clara entre camadas de **configuração**, **controladores**, **serviços** e **domínio**.

Ele inclui:
- Um endpoint simples de "Hello World"
- Injeção de dependência com `@Service` e `@Autowired`
- Arquivo de configuração `application.properties`
- Estrutura modular com pacotes bem organizados

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 21
- ✅ Spring Boot
- ✅ Maven
- ✅ JUnit (para testes)
- ✅ REST API
- ✅ MVC Pattern

---

## 📂 Estrutura de Pastas

first-spring-app/
│

├── src/

│ ├── main/

│ │ ├── java/

│ │ │ └── com.recupera.first_spring_app/

│ │ │ ├── configuration/ # Beans e configurações gerais

│ │ │ ├── controller/ # Controllers REST

│ │ │ ├── domain/ # Modelos de dados / Entidades

│ │ │ └── services/ # Lógica de negócio

│ │ └── resources/

│ │ ├── static/ # Arquivos estáticos

│ │ ├── templates/ # Templates HTML (caso use Thymeleaf)

│ │ └── application.properties # Configurações da aplicação

│

├── test/ # Testes unitários

├── mvnw, mvnw.cmd # Wrappers Maven

├── pom.xml # Gerenciador de dependências Maven

└── README.md # Este arquivo

---

## ⚙️ Como Rodar Localmente

### Pré-requisitos
- Java 21 instalado
- Maven instalado ou usar o `mvnw` (wrapper)

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/first-spring-app.git
cd first-spring-app

# Compile o projeto
./mvnw clean install

# Rode a aplicação
./mvnw spring-boot:run
```
### A aplicação estará disponível em:
📍 http://localhost:8080

### 📫 Endpoints Disponíveis

| Método | Rota     | Descrição                        |
| ------ | -------- | -------------------------------- |
| GET    | `/hello` | Retorna uma mensagem simples     |
| POST   | `/hello` | Recebe JSON com `name` e `email` |


### 📥 Exemplo de requisição POST
URL: http://localhost:8080/hello
Método: POST

### Headers:
```bash
Content-Type: application/json
```

### Body (raw - JSON):
```bash
{
  "name": "João Silva",
  "email": "joao@email.com"
}
```

### Resposta esperada:
```bash
Hello World Post (nome dado)
```

### 🧪 Rodando os Testes

./mvnw test

### 📄 Licença
Este projeto está licenciado sob a MIT License.

### ✨ Autora
Desenvolvido por **Danielle Nery** 🚀  
📸 Instagram: [@daniellynerya]([https://instagram.com/daniellynerya](https://www.instagram.com/daniellynerya?igsh=MTN1aXdrdGwxOWwxbg==))

📧 E-mail: daniellynerya@gmail.com
