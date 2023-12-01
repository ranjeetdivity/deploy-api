# deploy-api - Mysql CURD API using Spring Boot, MySQL, JPA, Hibernate Rest
Spring Boot project for Deploy API


## Requirements

### Install Mysql using Docker

```bash
docker pull mysql:latest
docker run --detach  --name mysqldb -e MYSQL_ROOT_PASSWORD=admin123 --publish 3306:3306  -d mysql:latest

docker exec -it mysqldb bash -l
mysql -uroot -p
password : admin123
```

###Create project from https://start.spring.io

Add dependency :

Spring Boot DevTools DEVELOPER TOOLS,
Spring Data JPA SQL,
Spring Web WEB,
MySQL Driver SQL,
Spring Security SECURITY,

## Steps to Setup

**1. Clone the application**

```bash

git clone 

```

**2. Create Mysql database**

```bash

create database deployapidb;

CREATE TABLE Deployment ( id INT NOT NULL AUTO_INCREMENT PRIMARY KEY , eaiNumber varchar(50), componentName varchar(255) NOT NULL, appVersion varchar(128) , env varchar(10), codeBranch varchar (128), deployedBy varchar(255), deploymentTime DATETIME NOT NULL, deploymentType varchar(15), deploymentCount int,  deploymentFrequency varchar(15), javaVersion varchar(15), buildTool varchar(15), pcfSpace varchar(50), createDateTime DateTime  NOT NULL DEFAULT now(), updateDateTime DateTime  NOT NULL DEFAULT now());

INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.78","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.77","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.76","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.75","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.74","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.72","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.71","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.70","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3536435", "chut-movement-correction-service-L1", "1.0.8-SAPSHOT","L2", "feature-B-B1808194", null, now(), "BRANCH", 1, "Weekly", "17.0.9", "Gradle", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-hu-task-aggregator-processor", "3.10.78","L2", "feature-newTables", "Yashwanth Manchikatla", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");

INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.78","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.77","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.76","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.75","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.74","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.72","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.71","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-query-L2", "3.10.70","L2", "feature-B-1713792-FOSS-ENABLEMENT", "Normandy Rivver", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3536435", "chut-movement-correction-service-L1", "1.0.8-SAPSHOT","L2", "feature-B-B1808194", null, now(), "BRANCH", 1, "Weekly", "17.0.9", "Gradle", "development");
INSERT INTO DeploymentDetail (eaiNumber, componentName,  appVersion, env, codeBranch, deployedBy, deploymentTime, deploymentType, deploymentCount, deploymentFrequency, javaVersion, buildTool, pcfSpace) VALUES ("3537813", "cs-hu-task-aggregator-processor", "3.10.78","L2", "feature-newTables", "Yashwanth Manchikatla", now(), "BRANCH", 1, "Weekly", "1.8.0_391", "Maven", "development");


```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`


+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

you can run the app without packaging it using -

```bash

mvn spring-boot:run

```

The app will start running at <http://localhost:8080>.

## Rest APIs

GET API : 

```bash
/rest/api/seo/v1/allDeploymentDetails : Fetch all the deployment details present in database

curl --location --request GET 'http://localhost:8080/rest/api/seo/v1/allDeploymentDetails?pageNo=2&pageSize=10&sortBy=id&sortDir=ASC' \
--header 'Content-Type: application/json' \
--data-raw ''
```

Post API:

   ```bash
   /insertDeploymentDetail : Inserts a new deployment record in mysql DB
   
curl --location --request POST 'http://localhost:8080/rest/api/seo/v1/insertDeploymentDetail' \
--header 'Content-Type: application/json' \
--data-raw '{
    "eaiNumber" : "3537815",
    "componentName" : "cs-query-Prod",
    "appVersion" : "5.0.0",
    "environment" : "Prod",
    "codeBranch" : "master",
    "deployedBy" : "Srinivasan Krishanan",
    "deploymentTime" : "2023-11-27T12:52:20",
    "deploymentType" : "BRANCH",
    "deploymentCount" : "1",
    "frequency" : "Weekly",
    "javaVersion" : "11.00.58",
    "buildTool" : "Gradle",
    "pcfSpace" : "release"
  }'
   ```