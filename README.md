# Web Exp Backend

Web 应用开发 - 实验 & 大作业后端【[API 文档](./API.md)】

### 功能设计

拟设计一个多用户的 B/S 架构待办事项系统，用户可添加代办（Todo）和便签（Note），数据均具有增删改查功能。

### 后端技术栈

基于 Java 17 开发，使用 Spring Web 框架，使用 MyBatis Plus 数据库框架，使用 MySQL 8.0 数据库。

登录基于 Json Web Token，头像功能由后端直接分发静态资源。

### 配置与部署

**修改配置文件**

配置文件： `src\main\resourcessrc\main\resources\application.properties`

配置示例如下：

```properties
server.port=5000
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.url=jdbc:mysql://192.168.6.3:3306/web_exp_backend?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
upload.path=E:\\Pictures\\spring-upld\\
```

需要注意的是，`upload.path` 必须以斜杠结尾，否则会导致路径拼接错误。

**初始化数据库**

运行建库脚本： `src\main\resourcessrc\main\resources\schema.sql`

**运行项目**

经过以上配置后，即可运行该项目。项目默认将会运行在 5000 端口。