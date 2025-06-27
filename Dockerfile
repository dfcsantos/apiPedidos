#Instalando uma imagem do JDK 21
FROM openjdk:21

#Criando uma pasta para onde o docker irá copiar os arquivos
WORKDIR /app

#Copiando os arquivos do projeto para dentro desta pasta
COPY . /app

#Comando para realizar o deploy do projeto
RUN ./mvnw clean package -DskipTests	

#Expondo a porta 8081 para acesso externo
EXPOSE 8081

#comando para iniciar a aplicação
CMD ["java", "-jar", "target/apiPedidos-0.0.1-SNAPSHOT.jar"]
