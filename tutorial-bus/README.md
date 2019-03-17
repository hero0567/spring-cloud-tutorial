# spring-cloud-bus-tutorial
# 说明
这里使用kafka作为MQ
# 启动步骤
- [安装kafka](http://kafka.apache.org/quickstart)
- 启动 RegistryApp
- 启动 ConfigCenterApp
- 启动 Service0App
- 启动 Service1App
# 调试步骤
- 调用接口: 浏览器访问service0的tips接口(http://localhost:10001/tips) 
- 修改 tutorial-bus-configcenter\src\main\resources\config\service0.yml 的tips的值
- 调用配置中心的刷新配置接口,已提供单元测试: tutorial-bus-configcenter\src\test\java\ConfigCenterTest.java 
- 调用接口: 浏览器访问 http://localhost:10001/tips  正常情况下,可以看到tips的值改变.
