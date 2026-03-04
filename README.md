# 💈 Sistema de Barbearia - Spring Boot

⚠️⚠️README feito inteiramente por IA⚠️⚠️

Projeto desenvolvido utilizando Java + Spring Boot para simular o funcionamento de um sistema de gerenciamento de uma barbearia.

O sistema permite que barbeiros gerenciem agendamentos, cortes disponíveis e cortes personalizados, facilitando o controle de serviços oferecidos pela barbearia.

Este projeto foi desenvolvido como parte de estudos em desenvolvimento backend com Spring Boot.

📌 Funcionalidades

O sistema atualmente possui as seguintes funcionalidades:

🔐 Sistema de Login (Barbeiro)

O sistema possui um login exclusivo para barbeiros que permite acessar as funcionalidades administrativas.

⚠️ Credenciais padrão do barbeiro:

Usuário: admin
Senha: 123

Observação: O login para clientes/usuários ainda não foi implementado, mas está planejado para futuras versões.

📅 Agendamento de Cortes

Os barbeiros podem visualizar e gerenciar agendamentos de cortes, permitindo organizar melhor o atendimento aos clientes.

Funcionalidades relacionadas:

Criar agendamentos

Visualizar horários marcados

Organizar agenda de atendimentos

✂️ Cadastro de Cortes Personalizados

O sistema permite que o barbeiro adicione novos tipos de cortes ao sistema.

Exemplos:

Corte degradê

Corte social

Corte na tesoura

Cortes personalizados criados pelo barbeiro

📋 Menu de Cortes Disponíveis

Existe um menu onde é possível visualizar todos os cortes disponíveis na barbearia.

Essa funcionalidade permite:

Visualizar serviços disponíveis

Escolher o corte desejado

Facilitar o processo de agendamento

🛠 Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

Java

Spring Boot

Spring MVC

Spring Data JPA

HTML / CSS

Maven

Banco de dados H2 / JPA

O Spring Boot é um framework Java muito utilizado para criação de aplicações web e APIs de forma rápida e organizada.

📂 Estrutura do Projeto

A aplicação segue uma estrutura comum de projetos Spring Boot:

src
 └─ main
     ├─ java
     │   └─ controllers
     │   └─ services
     │   └─ repositories
     │   └─ models
     └─ resources
         └─ templates
         └─ static
         └─ application.properties

Essa organização separa responsabilidades da aplicação, facilitando manutenção e escalabilidade.

🚀 Como Executar o Projeto

1️⃣ Clonar o repositório
git clone https://github.com/britukk/Project-Barbearia-SENAI.git

2️⃣ Entrar na pasta do projeto
cd Project-Barbearia-SENAI

3️⃣ Executar o projeto

OBS: o nome do database é "barbearia"

Se estiver usando Maven:

mvn spring-boot:run

Ou execute a classe principal do projeto pela sua IDE (IntelliJ / Eclipse / VSCode).

4️⃣ Acessar no navegador
http://localhost:8080
🔮 Melhorias Futuras

Algumas melhorias planejadas para o projeto:

🔐 Sistema de login para clientes

📱 Interface mais moderna

📊 Painel administrativo para barbeiros

📅 Melhor controle de horários disponíveis

💳 Possível integração com sistema de pagamentos

📧 Notificações de agendamento

🎓 Objetivo do Projeto

Este projeto foi criado com o objetivo de:

Praticar Spring Boot

Aprender arquitetura MVC

Trabalhar com CRUD

Implementar sistema de login

Simular um sistema real de gerenciamento de barbearia

👨‍💻 Autor

Projeto desenvolvido por João Pedro de Brito, Gustavo Alves dos Reis e principalmente por Luis Guilherme Carvalho Valadares para fins de estudo e aprendizado em desenvolvimento backend com Spring Boot.
Links:
https://github.com/britukk
https://github.com/LaBomb4
https://github.com/xXLuisinnXx
