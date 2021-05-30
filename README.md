<p align="center">
  <img align="center" alt="Logo UOL" src="https://compasso.com.br/wp-content/uploads/2020/07/LogoCompasso-Negativo.png" />
</p>

<h2 align="center">
  DESAFIO BACKEND COMPASSO UOL
</h2>


### Contexto do Desafio

Desenvolver um `sistema`  que contemple a utilização da tecnologia de mesageria `RabbitMQ`

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

### Executando o projeto

1. Clone ou baixe o projeto do repositório para o seu `Computador`.

2. Navegue até a raíz do seu diretório onde salvou ou clonou o projeto, abra o `terminal e execute ` os comandos: 
  `sudo docker-compose build`, em seguida `sudo docker-compose up -d`.

3. Estará disponível para acesso em seu browser os seguintes `Endpoints` para teste:

  <li>
   <a href="http://localhost:9090" target="_blank">Consumer</a>

  <li>
   <a href="http://localhost:8080" target="_blank">Producer</a>

  <li>
   <a href="http://localhost:9191" target="_blank">RabbitMQ</a>

  <li>
   <a href="http://localhost:8081" target="_blank">Mongo Express</a>

### Executando os Testes

1. Navegue até a raíz do seu diretório onde salvou ou clonou o projeto, abra o `terminal e execute ` o comando `sudo gradle clean test`. Este comando executará todos os casos de teste, resultando em:


### Diagrama da aplicação

Este diagrama contempla o fluxo real que as aplicações se propõem. A aplicação producer tem por finalidade a produção de dados, que acontece via endpoint de sua api-rest.Quando os dados são produzidos, eles são armazenados em um banco relacional H2DB e enviados para a fila "queue" no tópico product do RabbitMQ. Por sua vez, a aplicação consumer fica ouvindo este tópico e, quando chega uma nova mensagem ela é processada e removida da fila, salvando em um banco não relacional MongoDB e disponibilizando-os por meio de sua api-rest.

<hr>
<p align="center">
  <img align="center" src="https://raw.githubusercontent.com/RodrigoAntonioCruz/assets/main/Blank%20Diagram.png" />
</p>
<hr>
