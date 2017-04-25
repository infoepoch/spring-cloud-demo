Spring Cloud 基础案例
====================
### 使用模块
* Spring Boot parent 版本 
```xml
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.3.8.RELEASE</version>
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
				<version>Brixton.RELEASE</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
```

### 项目说明

### 启动顺序说明
* 1.eureka-server 注册服务
* 2.api-gateway 网管，zuul
* 3.service-A 基础服务A
* 4.service-B 基础服务B

---
## 参考地址
[打造Spring Cloud构建微服务架构的最全资料](http://git.oschina.net/didispace/SpringCloud-Learning)
[Spring Boot教程](http://git.oschina.net/didispace/SpringBoot-Learning)
[Spring Cloud官方](https://projects.spring.io/spring-cloud/)