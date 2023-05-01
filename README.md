# 简介
> 做这个Demo主要是为了能快速的构建微服务测试框架，通过在下载项目后即可在本地集成各种微服务组件完成相关测试

### Reference Documentation

创建此项目用于在学习或测试中，能一键部署微服务多模块系统，
* 本服务包含3个中心，模拟了微服务的中台架构如下：


```shell
├──account        账户中心
├────accountApi   账户中心Feign接口
├────accountBiz   账户中心业务处理和数据库交互
├──order          订单中心
└────orderApi     订单中心Feign接口
└────orderBiz     订单中心业务处理和数据库交互
└──storage        库存中心
└────storageApi   库存中心Feign接口
└────storageBiz   库存中心业务处理和数据库交互

request.http  接口测试文件
```
# 环境准备
## 启动参数

```shell

-Dnacos-server= your nacos address
-Dnacos-namespace= your nacos namespace
-Dnacos-group=  your nacos namespace
```
# 功能
每个服务有写了一些接口实现，在订单中心 order 完成了下单接口，测试此接口需要
启动 account 和 storage ，并调用他们完成业务操作
