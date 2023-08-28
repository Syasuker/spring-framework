
# 大纲

- Java Servlet
- Struts2
- IOC 反射技术 控制反转
- IC 注入
- JVM 虚拟机 CLass 字节码的编译加载

# Spring源码解读

想要对某一个框架精通，免不了对它的源码进行阅读和理解。

想要对某一个语言的设计进行学习，免不了对它编写的优秀框架进行分析。

在阅读源码这样的一个快乐又枯燥的过程中，我觉得对代码的见识、规范和深度上都有一定的收获。

但是呢，在读一个非常庞大的源码的时候(代码量多，设计复杂)，我们自己很难快速上手，往往还没真正领略到优秀代码的风情，就在层层的设计中消磨了自己的兴趣。所以在前人的带领下，自己再独自源码阅读还是比较好的选择(大佬自动忽略)

我的源码阅读是在 《Spring源码深度解析》 这本书和 [Java 技术驿站的死磕spring](http://cmsblogs.com/?cat=206) 的基础上进行的，而我自己也根据阅读得到的笔记和知识做了自己的解读出来。加上了自己的绘图，更加容易理解。

## Spring IoC 的解读 [Spring IoC的文档](https://esmusssein777.github.io/#/)

[(1)前言.md](https://github.com/esmusssein777/spring-framework/blob/master/源码阅读笔记/(1)前言.md)

[(2)Spring IOC的开始.md](https://github.com/esmusssein777/spring-framework/blob/master/%E6%BA%90%E7%A0%81%E9%98%85%E8%AF%BB%E7%AC%94%E8%AE%B0/(2)Spring%20IOC%E7%9A%84%E5%BC%80%E5%A7%8B.md)

[(3)IoC之Resource定位.md](https://github.com/esmusssein777/spring-framework/blob/master/源码阅读笔记/(3)IoC之Resource定位.md)

[(4)IoC之BeanDefinition的装载.md](https://github.com/esmusssein777/spring-framework/blob/master/源码阅读笔记/(4)IoC之BeanDefinition的装载.md)

[(5)IoC之BeanDefinition的解析和注册.md](https://github.com/esmusssein777/spring-framework/blob/master/源码阅读笔记/(5)IoC之BeanDefinition的解析和注册.md)

[(6)IoC之Bean的加载.md](https://github.com/esmusssein777/spring-framework/blob/master/源码阅读笔记/(6)IoC之Bean的加载.md)

[(7)IoC之Bean的创建.md](https://github.com/esmusssein777/spring-framework/blob/master/源码阅读笔记/(7)IoC之Bean的创建.md)



其实最后我阅读这些代码和写笔记的时间远超出我的预期，不过收获颇丰。希望都能耐心好好阅读。
定制化主题设置代码高亮，更容易阅读 https://esmusssein777.github.io/#/ 

### IoC的流程图

#### BeanDefinition的流程

![](https://github.com/esmusssein777/study/blob/master/md/picture/XML2BeanDefinition.png?raw=true)



#### Bean 的加载

![](https://github.com/esmusssein777/study/blob/master/md/picture/Name2Scope.png?raw=true)



#### Bean 的创建

![](https://github.com/esmusssein777/study/blob/master/md/picture/Bean.png?raw=true)



## 工具

UML图：代码的UML图用的是IDEA自带的 Diagram

流程图：[draw.io](https://www.draw.io/)
