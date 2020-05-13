# IOC(Inverse of Control)容器
    使用DI(dependency injection)依赖注入更容易理解
    Spring使用容器统一管理依赖，完成类的初始化和依赖注入
## 实现方式
* 构造函数注入
* 属性注入
* 接口注入  
[IOC](../src/main/java/com/smart/ioc)
## 反射 
## ClassLoader 
    寻找类的字节码文件并在JVM中构造类的表示对象的组件
* JVM运行时会产生3个classLoader(依次继承):根装载器，ExtClassLoader和AppClassLoader
    * 根加载器：不是ClassLoader子类，C++编写，负责装载JRE核心类库
    * ExtClassLoader负责装载JRE扩展目录ext中的JAR类包
    * AppClassLoader，装载Classpath路径下的类包
* JVM装载类使用全盘负责委托机制
    * 全盘负责：ClassLoader装载一个类时，除非显式使用另一个ClassLoader,否则该类所依赖及引用的类也由这个CLassLoader载入
    * 委托机制：现委托父装载器寻找目标类，找不到才从自己类路径中查找并装载目标类
## 资源抽象接口
* 资源抽象接口 Resource
    * 如果资源配置文件在项目发布时打到jar包里,不能使用Resource#getFile()方法,会有FileNotFoundException异常,可以使用Resource#getInputStream()
* 资源加载接口 ResourceLoader
## BeanFactory和ApplicationContext
    BeanFactory面向框架,ApplicationContext面向开发者

