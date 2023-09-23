
<p align="center">
	<a target="_blank" href="https://spring.io/projects/spring-boot">
		<img src="https://img.shields.io/badge/spring%20boot-2.6.13-green" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/maven-3.8.2-blue.svg" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/openjdk-1.8.0_181-yellow.svg" />
	</a>
</p>

----------

# fish-init初始化多模块项目

## 介绍

方便快速搭建简单的多模块后端

fish-framework:公共业务处理

fish-backend:管理端的接口实现

fish-frontend:用户端的接口实现

fish-sql:用于sql的创建和sql语句的存储

fish-init:pom进行统一版本控制

## 我使用的一些主要版本号

- jdk openjdk 1.8.0_181
- maven 3.8.2
- mysql 8.0.32
- git 2.37.3
- springboot 2.6.13
- mybatis plus 3.5.2
- knife4j 3.0.3

## 其它说明

- 这里用到了spring自带的cache缓存，存储用户信息，想要用其它缓存可以在CacheConfig配置文件自行配置
- 接口文档链接：`http://localhost:9999/backend/doc.html#/home` and `http://localhost:8888/frontend/doc.html#/home`

