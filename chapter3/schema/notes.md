# Spring Boot快速入门
    Spring Boot通过提供丰富的启动类，封装各类工程所需的依赖及基础配置，使开发专注于业务，减少手动配置
    Spring Boot1.3.3需要运行在 java 7.0+及 Spring4.1.5+版本中，官方推荐JDK1.8，使用maven或者gradle构建
## 安装配置
* maven
* gradle
* Spring Boot CLI
## 配置文件
[application.propertise](../src/main/resources/application.properties)
## 运维支持
    pom中添加依赖spring-boot-starter-actuator即可
    management.health.* 即可实现相关配置