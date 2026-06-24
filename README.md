# 💈 Sistema de Barbearia - Spring Boot

⚠️⚠️ README feito inteiramente por IA e aprimorado com base em testes reais ⚠️⚠️

Projeto desenvolvido utilizando Java + Spring Boot para simular o funcionamento de um sistema de gerenciamento de uma barbearia.

O sistema permite que barbeiros gerenciem agendamentos, cortes disponíveis e cortes personalizados, facilitando o controle de serviços oferecidos pela barbearia.

Este projeto foi desenvolvido como parte de estudos em desenvolvimento backend com Spring Boot.

## 📌 Funcionalidades

O sistema atualmente possui as seguintes funcionalidades:

🔐 **Sistema de Login (Barbeiro)**
O sistema possui um login exclusivo para barbeiros que permite acessar as funcionalidades administrativas.

> **⚠️ Credenciais padrão do barbeiro:**
> Usuário: `admin`
> Senha: `123`
> 
> *Observação: O login para clientes/usuários ainda não foi implementado, mas está planejado para futuras versões.*

📅 **Agendamento de Cortes**

Os barbeiros podem visualizar e gerenciar agendamentos de cortes, permitindo organizar melhor o atendimento aos clientes.
* Criar agendamentos
* Visualizar horários marcados
* Organizar agenda de atendimentos

✂️ **Cadastro de Cortes Personalizados**

O sistema permite que o barbeiro adicione novos tipos de cortes ao sistema.
* Corte degradê
* Corte social
* Corte na tesoura
* Cortes personalizados criados pelo barbeiro

📋 **Menu de Cortes Disponíveis**

Existe um menu onde é possível visualizar todos os cortes disponíveis na barbearia.
* Visualizar serviços disponíveis
* Escolher o corte desejado
* Facilitar o processo de agendamento

## 🛠 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot / Spring MVC**
* **Spring Data JPA**
* **HTML / CSS**
* **Maven**
* **Banco de dados:** MySQL (Windows) / MariaDB (Linux)

## 📂 Estrutura do Projeto

A aplicação segue uma estrutura comum de projetos Spring Boot:

```text
src
 └── main
     ├── java/com/sistema/app
     │   └── controllers
     │   └── models
     │   └── repository
     │   └── SistemaBarbeariaApplication.java
     └── resources
         └── static
         └── templates
         └── application.properties
```

## 🚀 Como Executar o Projeto
Pré-requisitos Gerais
* Ter o Java 21 (JDK) instalado.

* Clonar o repositório:
git clone https://github.com/britukk/Project-Barbearia-SENAI.git

* Entrar na pasta:
cd Project-Barbearia-SENAI

🪟  **Rodando no Windows (MySQL)**

No Windows, o projeto utiliza o conector padrão do MySQL configurado no pom.xml.

Certifique-se de que o MySQL Server está rodando.

Acesse o seu MySQL e crie o banco de dados:

SQL
CREATE DATABASE barbearia;
Verifique no arquivo src/main/resources/application.properties se as credenciais correspondem ao seu banco (usuário e senha).

Na raiz do projeto, execute:

Bash
mvnw spring-boot:run
Acesse no navegador: http://localhost:8080

🐧  **Rodando no Linux (Ubuntu / Debian / Kali)**

Distribuições baseadas em Debian utilizam o MariaDB por padrão. Para rodar sem conflitos de driver ou permissões, siga os passos abaixo:

Inicie o serviço do banco de dados:

Bash
sudo systemctl start mysql
Acesse o banco de dados via terminal:

Bash
sudo mysql -u root -p
Crie o banco, um usuário dedicado e dê as permissões:

SQL
CREATE DATABASE barbearia;
CREATE USER 'app_barbearia'@'localhost' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON barbearia.* TO 'app_barbearia'@'localhost';
FLUSH PRIVILEGES;
Modificação Importante (Conflito de Driver):
Como o Linux usa MariaDB, você pode enfrentar o erro Unknown column 'RESERVED' in 'WHERE'. Para resolver, altere seu application.properties para:

Properties
spring.datasource.url=jdbc:mariadb://localhost:3306/barbearia
spring.datasource.username=app_barbearia
spring.datasource.password=123456
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
E no arquivo pom.xml, substitua a dependência do mysql-connector-j pelo mariadb-java-client.

Rode a aplicação limpando o cache:

Bash
mvn clean spring-boot:run
## 🚨 Resolução de Problemas Comuns (Troubleshooting)
Erro: Command 'mvn' not found

Causa: O Apache Maven não está instalado globalmente.

Solução: Utilize o script do próprio repositório rodando ./mvnw spring-boot:run ou instale o Maven no sistema (sudo apt install maven).

Erro: release version 21 not supported

Causa: O seu sistema está usando uma versão do Java anterior à versão 21 exigida pelo projeto.

Solução: Instale e configure o JDK 21 na sua máquina (sudo apt install openjdk-21-jdk no Linux).

Erro: Access denied for user 'root'@'localhost'

Causa: O banco de dados está recusando a conexão. Isso ocorre porque a senha no application.properties está errada/vazia, ou porque o sistema operacional (Linux) bloqueia o acesso via rede para o usuário root.

Solução: Crie um usuário dedicado no banco de dados (ex: app_barbearia) com senha, conceda os privilégios na tabela barbearia e atualize o arquivo application.properties com essas novas credenciais.

## 🔮 Melhorias Futuras
* 🔐 Sistema de login para clientes

* 📱 Interface mais moderna

* 📊 Painel administrativo para barbeiros

* 📅 Melhor controle de horários disponíveis

* 💳 Possível integração com sistema de pagamentos

* 📧 Notificações de agendamento

## 🎓 Objetivo do Projeto
Este projeto foi criado com o objetivo de:

* Praticar Spring Boot

* Aprender arquitetura MVC

* Trabalhar com CRUD

* Implementar sistema de login

* Simular um sistema real de gerenciamento de barbearia

## 👨‍💻 Autores
Projeto desenvolvido por João Pedro de Brito, Gustavo Alves dos Reis e principalmente por Luis Guilherme Carvalho Valadares para fins de estudo e aprendizado em desenvolvimento backend com Spring Boot.

Links:

João Pedro (britukk)
https://github.com/britukk

Gustavo (LaBomb4)
https://github.com/LaBomb4

Luis Guilherme (xXLuisinnXx)
https://github.com/xXLuisinnXx