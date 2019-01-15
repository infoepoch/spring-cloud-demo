Spring Cloud 基础案例
====================
案例集成了Eureka、Zuul、OpenFeign、Zipkin、Hystrix等SpringCloud组件和基本使用方法。

### Dependencies
* spring boot parent

```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.0.5.RELEASE</version>
	<relativePath/> <!-- lookup parent from repository -->
</parent>
```
* spring cloud 

```xml
<dependencyManagement>
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-dependencies</artifactId>
			<version>Finchley.SR2</version>
			<type>pom</type>
			<scope>import</scope>
			</dependency>
	</dependencies>
</dependencyManagement>
```

### 运行项目

```
mvn package
java -jar eureka-server/target/eureka-server-2.0.0.jar
java -jar api-gateway/target/api-gateway-2.0.0.jar
java -jar open-feign/target/open-feign-2.0.0.jar
java -jar service-A/target/service-A-2.0.0.jar
```

#### Eureka Server
[http://localhost:1111/](http://localhost:1111/)

![eureka server](https://ws1.sinaimg.cn/large/005OU41Ngy1fz661w7qt6j327w17eahi.jpg)

#### Zuul
[http://localhost:5555/api-a?a=1&b=2](http://localhost:5555/api-a?a=1&b=2)

#### openfeign
[http://localhost:2300/?a=1&b=2](http://localhost:2300/?a=1&b=2)

#### [Zipkin](https://zipkin.io/pages/quickstart.html)链路追踪

```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

[http://localhost:9411](http://localhost:9411)

![zipkin](https://ws1.sinaimg.cn/large/005OU41Ngy1fz721mxiscj327y13safp.jpg)

#### Hystrix

[http://127.0.0.1:5555/hystrix](http://127.0.0.1:5555/hystrix)

配置 http://127.0.0.1:5555/hystrix.stream

![Hystrix](https://ws1.sinaimg.cn/large/005OU41Ngy1fz73271po0j327w0fi0wo.jpg)

 
### 功能介绍
- 1.服务注册和发现
- 2.api-gateway 认证，负载，熔断。具体参考 项目中的配置文件
- 3.service 服务，基本的运算

---
## 参考地址
- [打造Spring Cloud构建微服务架构的最全资料](http://git.oschina.net/didispace/SpringCloud-Learning)
- [Spring Boot教程](http://git.oschina.net/didispace/SpringBoot-Learning)
- [Spring Cloud官方](https://projects.spring.io/spring-cloud/)
- [hystrix dashboard Unable to connect to Command Metric Stream解决办法](https://www.cnblogs.com/mark7/p/8920288.html)