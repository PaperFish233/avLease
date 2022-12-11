## **SSM框架音像租赁系统**

**2022年12月11日 已归档**

本系统功能模块设计如图所示：

![](https://i.imgtg.com/2022/12/11/DmpOb.png)



### 数据库设计

用户（user）表：

| 属性     | 列名       | 数据类型 | 长度 | 约束 |
|----------|------------|----------|------|------|
| 用户编号 | Uno        | int      |      | 主键 |
| 用户账号 | Uaccount      | varchar     | 100   |      |
| 用户昵称 | Uname      | varchar     | 100   |      |
| 用户密码 | Upassword  | varchar  | 100   |      |
| 用户权限 | Uauthority | int      |      |      |

音像（tap）表：

| 属性     | 列名   | 数据类型 | 长度 | 约束 |
| -------- | ------ | -------- | ---- | ---- |
| 音像编号 | Tno    | int      |      | 主键 |
| 音像名称 | Tname  | varchar  | 100  |      |
| 类别编号 | TTno   | int      |      |      |
| 音像状态 | Tstate | varchar  | 100  |      |

 音像类型（type）表：

| 属性     | 列名    | 数据类型 | 长度 | 约束 |
| -------- | ------- | -------- | ---- | ---- |
| 类型编号 | TTTno   | int      |      | 主键 |
| 类型名称 | TTTname | varchar  | 100  |      |

订单（lease）表：

| 属性     | 列名   | 数据类型 | 长度 | 约束 |
| -------- | ------ | -------- | ---- | ---- |
| 订单编号 | Lno    | int      |      | 主键 |
| 用户账号 | Lname  | varchar  | 100  |      |
| 音像名称 | Ltap   | varchar  | 100  |      |
| 租赁时间 | Ltime  | varchar  | 100  |      |
| 订单状态 | Lstate | int      |      |      |

公告（message）表：

| 属性     | 列名     | 数据类型 | 长度 | 约束 |
| -------- | -------- | -------- | ---- | ---- |
| 公告编号 | Mno      | int      |      | 主键 |
| 发布人   | Mname    | varchar  | 100  |      |
| 公告内容 | Mcontent | varchar  | 100  |      |
| 发布时间 | Mtime    | varchar  | 100  |      |

留言板（announcement）表：

| 属性     | 列名     | 数据类型 | 长度 | 约束 |
| -------- | -------- | -------- | ---- | ---- |
| 留言编号 | Ano      | int      |      | 主键 |
| 发布人   | Aname    | varchar  | 100  |      |
| 留言内容 | Acontent | Varchar  | 100  |      |
| 发布时间 | Atime    | varchar  | 100  |      |



### 系统框架

Spring、SpringMVC 和Mybatis，Spring是一个开源框架，用来解耦，方便实现MVC；Spring MVC 分离了控制器、模型对象、过滤器以及处理程序对象的角色，这种分离让它们更容易进行定制；MyBatis 是一个基于 Java 的持久层框架，包括SQLMaps和Data Access Objects（DAO），对数据库进行操作。本系统由Eclipse平台和MySQL数据库进行开发。音像租赁系统框架结构图，如图所示：

![](https://i.imgtg.com/2022/12/11/DmJ7l.png)

pojo包：

| 文件名            | 说明               |
| ----------------- | ------------------ |
| Announcement.java | 公告信息实体类     |
| Lease.java        | 订单信息实体类     |
| Message.java      | 留言板信息实体类   |
| Tap.java          | 音像信息实体类     |
| Type.java         | 音像类别信息实体类 |
| User.java         | 用户信息实体类     |

dao包：

| 文件名                  | 说明                        |
| ----------------------- | --------------------------- |
| AnnouncementMapper.java | 公告信息实现类接口          |
| AnnouncementMapper.xml  | 公告管理方法对应SQL语句     |
| LeaseMapper.java        | 订单信息实现类接口          |
| LeaseMapper.xml         | 订单管理方法对应SQL语句     |
| MessageMapper.java      | 留言板信息实现类接口        |
| MessageMapper.xml       | 留言板管理方法对应SQL语句   |
| TapMapper.java          | 音像信息实现类接口          |
| TapMapper.xml           | 音像管理方法对应SQL语句     |
| TypeMapper.java         | 音像类别信息实现类接口      |
| TypeMapper.xml          | 音像类别管理方法对应SQL语句 |
| UserMapper.java         | 用户信息实现类接口          |
| UserMapper.xml          | 用户管理方法对应SQL语句     |

dao.impl包：

| 文件名               | 说明                 |
| -------------------- | -------------------- |
| AnnouncementDao.java | 公告管理实现方法     |
| LeaseDao.java        | 订单管理实现方法     |
| MessageDao.java      | 留言板管理实现方法   |
| TapDao.java          | 音像管理实现方法     |
| TypeDao.java         | 音像类别管理实现方法 |
| UserDao.java         | 用户管理实现方法     |

 service包：

| 文件名                   | 说明                   |
| ------------------------ | ---------------------- |
| AnnouncementService.java | 公告管理业务类接口     |
| LeaseService.java        | 订单管理业务类接口     |
| MessageService.java      | 留言板管理业务类接口   |
| TapService.java          | 音像管理业务类接口     |
| TypeService.java         | 音像类别管理业务类接口 |
| UserService.java         | 用户管理业务类接口     |

 service.impl包：

| 文件名                       | 说明                 |
| ---------------------------- | -------------------- |
| AnnouncementServiceImpl.java | 公告管理实现方法     |
| LeaseServiceImpl.java        | 订单管理实现方法     |
| MessageServiceImpl.java      | 留言板管理实现方法   |
| TapServiceImpl.java          | 音像管理实现方法     |
| TypeServiceImpl.java         | 音像类别管理实现方法 |
| UserServiceImpl.java         | 用户管理实现方法     |

controller包：

| 文件名                      | 说明                 |
| --------------------------- | -------------------- |
| AnnouncementController.java | 公告管理控制器类     |
| LeaseController.java        | 订单管理控制器类     |
| MessageController.java      | 留言板管理控制器类   |
| TapController.java          | 音像管理控制器类     |
| TypeController.java         | 音像类别管理控制器类 |
| UserController.java         | 用户管理控制器类     |



### 运行实例

![](https://i.imgtg.com/2022/12/11/DmPLg.png)

![](https://i.imgtg.com/2022/12/11/DmRuB.png)

![](https://i.imgtg.com/2022/12/11/Dm4zs.png)

![](https://i.imgtg.com/2022/12/11/DmDPK.png)

![](https://i.imgtg.com/2022/12/11/DmH9a.png)