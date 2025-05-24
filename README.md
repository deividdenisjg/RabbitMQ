## 📖 Sobre

Este projeto é uma pequena demonstração de um produtor e um consumidor utilizando o RabbitMQ para troca de mensagens em diferrentes aplicações utilizando o framework Spring AMQP 
do ecossistema Spring Boot. As mensagens são enviadas por um produtor para o RabbitMQ onde um consumidor lê a mensagem e salva em um banco de dados MongoDB. Essa idéia foi uma forma
de demonstrar algumas das tecnologias mais atuais funcionando em um ecossistema simples.

As APIs, RabbitMQ e MongoDB rodam em diferentes container Docker se comunicando e trocando infomações.

## 🚀 Tecnologias Utilizadas

Este projeto foi desenvolvido com as seguintes tecnologias:

- Java 17  
- Spring Boot  
- MongoDB
- Maven  
- Docker
- Swagger
- Postman (testar a API)

## 🧑‍💻 Como Rodar o projeto

- Clone o projeto: https://github.com/deividdenisjg/RabbitMQ.git;
  
- Instalar o Docker;
  
- Executar o Docker-Compose:
    docker-compose up -d --builder
  OBS.: Caso ocorrá algum erro na excução do docker-compose entre na pasta do PRODUCER e gere o pacote:
    mvn clean package
  Faça o mesmo com o CONSUMER caso precise.
  
- Abrir o Swagger e enviar uma mensagem:
    http://localhost:8080/swagger-ui/index.html#
  
- Acessar o MongoDB e pesquisa o retorno do consumidor:
    docker exec -it mondodb mongosh
  
- Selecionar a tabela no MongoDB:
    use messagedb
  
- Pesquisar as mensagens inseridas:
    db.messages.find()

## Imagens

- Envio de mensagem utilizando o Swagger
![image](https://github.com/user-attachments/assets/c0f18c9b-c5d6-4974-b381-e460599063b1)

- Containers rodando no Docker
![image](https://github.com/user-attachments/assets/265e6380-db57-4b74-9f6b-093e091b5d79)

- Consumer lendo as mensagens do RabbitMQ
![image](https://github.com/user-attachments/assets/302ee610-3c32-430c-ab88-4a7ca8469d30)

- Valores inseridos no MongoDB               
![image](https://github.com/user-attachments/assets/4843a071-ef6d-45ab-8faa-c041336c0edf)

  



