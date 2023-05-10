# 集成Seata1.5.2版本
## 环境准备
-   [点击下载 服务端和客户端版本保持一致，我们使用1.5.2](https://github.com/seata/seata/releases)
### 建表
全局事务会话信息由3块内容构成，全局事务-->分支事务-->全局锁，对应表global_table、branch_table、lock_table
服务端需要的表和客户端需要的表
## 启动参数
```shell
-Dnacos-server=nacos-local.com.cn
-Dnacos-namespace=948be217bc4
-Dnacos-group=DEFAULT_GROUP
-Dnacos-username=dev
-Dnacos-pwd=Zrb0naUj
```

# 项目结构
order   -  事务发起者，添加注解 `@GlobalTransactional`;  
account -  事务参与者  
storage -  事务参与者
服务调用使用 `open-feign`