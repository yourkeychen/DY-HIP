# DY-HIP
## 简介：
  基于RIM数据模型、HL7V3消息规范的开源HIS+ESB+BI的分布式互联网医疗信息平台项目。
## 技术方案：
* 1 数据库为ORACLE数据库。
  * 1.1 根据RIM数据模型创建表结构作为数据中心。
  * 1.2 提供物化视图做快速查询功能。
  * 1.3 ORACLEOLAP库做维度查询。
* 2 MyBatis的ORM。
* 2.1 支持图形化配置创建Dmain级别的持久化。
* 2.2 支持自动产生Dmain级别REST服务。
* 3 SpringBoot的微服务。
* 4 DubboX+Zookeeper的分布式架构。
* 5 ESB采用Camel+Dozer的集成数据转换。
* 5.1 支持图形方式快速创建Camel和Dozer配置文件。
* 6 ELK做日志采集。
* 6.1 提供页面做监控中心。
* 7 皕杰报表作为报表工具。
* 8 ACE admin做WEB客户端框架。
## 业务方案：
* 1 患者管理功能。
* 2 诊疗管理功能。
* 3 经济管理功能。
* 4 库存管理功能。
