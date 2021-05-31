<p align="center">
  <img align="center" alt="Logo UOL" src="https://compasso.com.br/wp-content/uploads/2020/07/LogoCompasso-Negativo.png" />
</p>

<h3 align="center">
  DESAFIO BACKEND COMPASSO UOL RABBITMQ
</h3>


### Contexto do Desafio

Desenvolver um `sistema de mensageria` que contemple a utilização da tecnologia `RabbitMQ`

<h4>Tecnologias</h4>
<ul>
  <li> Java 11
  <li> Spring Boot 
  <li> RabbitMQ
  <li> Gradle
  <li> Lombok
  <li> H2 Database
  <li> MongoDB
  <li> Swagger
  <li> JUnit
  <li> Jpa
</ul>

### Requisitos

Para rodar estas aplicações, você deve ter instalado em seu computador:

<ul> 
   <li><a href="https://www.azul.com/downloads/?package=jdk" target="_blank">Java 11 (LTS)</a>
   <li><a href="https://gradle.org/next-steps/?version=7.0.2&format=bin" target="_blank">Gradle 7.0.2</a>  
   <li><a href="https://docs.docker.com/get-started/" target="_blank">Docker</a>
</ul> 

### Executando o projeto

1. Clone ou baixe o projeto do repositório para o seu `Computador`.

2. Navegue até a raíz do seu diretório onde salvou ou clonou o projeto na pasta `consumer`, abra o `terminal e execute o comando:`
<ul> 
   <li> sudo gradle build
</ul>

3. Navegue até a raíz do seu diretório onde salvou ou clonou o projeto na pasta `producer`, abra o `terminal e execute o comando:`
<ul> 
   <li> sudo gradle build
</ul>

4. Navegue até a raíz do seu diretório onde salvou ou clonou o projeto, abra o `terminal e execute em sequencia os comandos:`
<ul> 
   <li> sudo docker-compose build
   <li> sudo docker-compose up
</ul>

5. Após a execução dos processos anteriores, estarão disponíveis para acesso em seu browser os seguintes `Endpoints` para teste:
<ul> 
  <li>
   <a href="http://localhost:9090" target="_blank">Consumer (http://localhost:9090)</a>
  <li>
   <a href="http://localhost:8080" target="_blank">Producer (http://localhost:8080)</a>
  <li>
   <a href="http://localhost:9191" target="_blank">RabbitMQ (http://localhost:9191)</a>
  <li>
   <a href="http://localhost:8081" target="_blank">Mongo Express (http://localhost:8081)</a>
</ul> 

### Executando os testes unitários

1. Navegue até a raíz do seu diretório onde salvou ou clonou o projeto, abra o `terminal e execute ` o comando `sudo gradle clean test`. Este comando executará todos os casos de teste.

### Diagrama da aplicação

Este diagrama contempla o fluxo real que as aplicações se propõem. A aplicação `producer` tem por finalidade a produção de dados que acontece via endpoint de sua api-rest.Quando os dados são produzidos,são enviados para a fila `"queue"` no tópico `product` do `RabbitMQ` e armazenados em um banco relacional `H2DB`. Por sua vez, a aplicação `consumer` fica `ouvindo os eventos` deste `tópico` e, quando chega uma `nova mensagem` ela é `processada` e removida da fila, salvando em um banco não relacional `MongoDB` e disponibilizando-os por meio de sua api-rest.

<hr>
<p align="center">
  <img align="center" src="https://raw.githubusercontent.com/RodrigoAntonioCruz/assets/main/diagrama-1.0.png" />
</p>
<hr>
