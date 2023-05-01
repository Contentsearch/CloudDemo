# 环境准备

## 初始化数据库
```sql
CREATE TABLE `d_account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `amount` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

```

## 启动参数
```shell

-Dnacos-server= your nacos address
-Dnacos-namespace= your nacos namespace
-Dnacos-group=  your nacos namespace
```

# 接口

## 微服务接口

```xml
<dependency>
    <groupId>com.github.iphase2</groupId>
    <artifactId>account-api</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
