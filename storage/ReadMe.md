# 环境准备

## 初始化数据库

```sql
CREATE TABLE `d_storage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品名',
  `remark` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品描述',
  `num` decimal(20,2) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
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
    <artifactId>storage-api</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```