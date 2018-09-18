Spring Cloud 基础案例
====================
本案例演示啦，Spring Cloud zuul、hystrix-dashboard 基本使用方法。

### 使用模块
* Spring Boot parent 版本 
```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.0.5.RELEASE</version>
	<relativePath/> <!-- lookup parent from repository -->
</parent>
```
* Spring Cloud 版本 

```xml
<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>Finchley.SR1</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
</dependencyManagement>
```

### 项目说明
项目通过 Maven 构建
![eureka-server](https://raw.githubusercontent.com/infoepoch/spring-cloud-demo/v2/doc/img/zipkin.png)

链路追踪结果
![zipkin-server](https://raw.githubusercontent.com/infoepoch/spring-cloud-demo/v2/doc/img/zipkin.png)

![zipkin-trace](https://raw.githubusercontent.com/infoepoch/spring-cloud-demo/v2/doc/img/zipkin-trace.png)

### 启动顺序说明
* 1.eureka-server 注册服务，访问：http://127.0.0.1:1111/
* 2.api-gateway 网管，zuul，访问地址：http://127.0.0.1:5555/api-all/add?a=1&b=2&accessToken=123
* 3.service-A 基础服务A，访问地址：http://127.0.0.1:5555/api-a/add?a=1&b=2&accessToken=123
* 4.service-B 基础服务B，访问地址：http://127.0.0.1:5555/api-b/add?a=1&b=2&accessToken=123
* 5.hystrix 网页查看，访问地址：http://127.0.0.1:5555/hystrix。需要配置为 http://127.0.0.1:5555/hystrix.stream

 
### 功能介绍
- 1.服务注册和发现
- 2.api-gateway 认证，负载，熔断。具体参考 项目中的配置文件
- 3.service 服务，基本的运算

---
## 参考地址
- [打造Spring Cloud构建微服务架构的最全资料](http://git.oschina.net/didispace/SpringCloud-Learning)
- [Spring Boot教程](http://git.oschina.net/didispace/SpringBoot-Learning)
- [Spring Cloud官方](https://projects.spring.io/spring-cloud/)
