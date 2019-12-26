# Yaoo权限管理系统
## 基于SpringBoot、SpringCloud、Vue的一个权限管理系统
# 主要功能包括：
### ●系统登录：系统用户登录，系统登录认证（token方式）。
### ●用户管理：新建用户，修改用户，删除用户，查询用户。
### ●机构管理：新建机构，修改机构，删除机构，查询机构。
### ●角色管理：新建角色，修改角色，删除角色，查询角色。
### ●菜单管理：新建菜单，修改菜单，删除菜单，查询菜单。
### ●字典管理：新建字典，修改字典，删除字典，查询字典。
### ●配置管理：新建配置，修改配置，删除配置，查询配置。
### ●登录日志：记录用户的登录日志，查看系统登录日志记录。
### ●操作日志：记录用户的操作日志，查看系统操作日志记录。
### ●在线用户：根据用户的登录状态，查看统计当前在线的用户。
### ●数据监控：地址Druid信息，提供间接有效的SQL数据监控。
### ●聚合文档：定制Swagger文档，提供间接美观的API文档。
### ●备份还原：系统数据备份还原，一键恢复系统初始化数据。
### ●主题切换：支持主题切换，自定义主题颜色，实现一键换肤。
### ●服务治理：集成Consul注册中心，实现服务的注册和发现。
### ●服务监控：集成SpringBoot Admin，实现全方位的服务监控。
### ●服务消费：集成Ribbon、Fegin，实现服务调用和负载均衡。
### ●服务熔断：集成Hystrix、Turbine，实现服务的熔断和监控。
### ●服务网关：集成SpringCloud Zuul，实现统一API服务网关。
### ●链路追踪：集成Sleuth、ZipKin，实现服务分布式链路追踪。
### ●配置中心：集成Config和Bus，实现分布式配置中心。

# 前端架构

###  核心框架使用Vue.js，UI使用饿了么的开源框架ElementUI,前后端交互使用了axios，使用Mock模拟接口数据。

![](C:\Users\WIN10\Downloads\前段架构图.png)

# 后端架构

###  后端架构采用Springboot+SpringSecurity+SpringCloud+Mybatis的主体架构，选择Consul注册中心，Maven构建工具，Mysql数据库。

![](C:\Users\WIN10\Downloads\后端架构.png)