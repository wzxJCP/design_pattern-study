# 设计模式（Design pattern）

## 1、设计模式介绍

在 1994 年，由 Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides 四人合著出版了一本名为Design Patterns - Elements of Reusable Object-Oriented Software（中文译名：设计模式 - 可复用的面向对象软件元素）的书，该书首次提到了软件开发中设计模式的概念。

**设计模式的优点**

- 提供了一种共享的设计词汇和概念，使开发人员能够更好地沟通和理解彼此的设计意图；
- 提供了经过验证的解决方案，可以提高软件的可维护性、可复用性和灵活性；
- 促进了代码的重用，避免了重复的设计和实现；
- 通过遵循设计模式，可以减少系统中的错误和问题，提高代码质量；
- 提高代码的可读性和可理解性；
- 代表了代码的最佳实践，被有经验的开发人员所使用；
- 设计模式是很多被反复使用并知晓的，主要是对代码和经验的总结；
- 对接口编程而不是对实现编程；
- 优先使用对象组合而不是继承关系；
- 促进模块化 设计 模式鼓励模块化设计，使得各个模块之间职责分明，耦合度低；
- 支持增量开发和演化；
- 提高团队协作效率，提供了一套通用的设计规范，使得团队成员可以更高效地协作。

下面用一个图片来整体描述一下设计模式之间的关系：

![](D:\2021\23设计模式\design_pattern-study\img\设计模式.png)

### 1.1 设计模式七大原则

#### （1）开闭原则（Open Close Principle）

 **(Open/Closed Principle, OCP)** （openclose_01）

* 对扩展开放，对修改关闭；
* 编写软件，比如类，模块，方法；
* 使用抽象进行构建，使用实现扩展细节；
* 面向抽象编程；
* 提高软件系统的可复用性和可维护性；
* 软件实体（如类、模块、函数等）应当对扩展开放，对修改关闭。这意味着在不影响现有代码的情况下，通过增加新的类来实现新功能或行为。
* 学生和高中生都依赖于人类接口，如果还有高中生、研究生等等都是通过增加新的类并继承人类接口来实现新功能或行为。

#### （2）依赖倒置原则（Dependence Inversion Principle）

 **(Dependency Inversion Principle, DIP)** （dependencyinversion_02）

* 依赖倒转原则是开闭原则的基础，针对接口进行编程；
* 依赖抽象，而不是具体的实现；
* 可以减少类之间的耦合行，提高系统稳定性，提高代码可读性和可维护性；
* 降低修改程序所造成的风险；
* 高层模块不应该依赖于低层模块，二者都应该依赖于抽象；抽象不应该依赖于细节，细节应该依赖于抽象。这有助于降低系统的耦合度，提高灵活性。
* 抽象类程序员类实现人类接口类，Java程序员和测试程序员都继承于抽象类程序员类。

#### （3）单一职责原则（Single Responsibility Principle，SRP）

 **(Single Responsibility Principle, SRP)** （singleresponsibility_03）

* 一个类，接口，方法，只负责一项职责；
* 降低程序的复杂度，提高程序可维护性，降低了变更所带来的风险；
* 每个类应该只有一个改变的理由，即每个类应该只负责一项功能。这样可以确保类的职责清晰，易于理解和维护。
* 抽象类程序员类实现人类接口类，Java程序员继承于抽象类程序员类。`JavaProgrammer` 类通过持有 `Order` 类的引用，表达了它对外卖订单功能的使用需求。这种方式遵循了单一职责原则，即一个类应该只有一个改变的理由。在这里，`JavaProgrammer` 负责描述程序员的工作、吃饭和睡觉等行为，而具体的订餐逻辑则由 `Order` 类负责，从而实现了职责分离，使得代码更加清晰和易于维护。

#### （4）接口隔离原则（Interface Segregation Principle）

 **(Interface Segregation Principle, ISP)** （interfacesegregation_04）

* 用多个接口，而不是使用单一的接口；
* 尽量细化接口，接口中的方法尽量少；
* 符合低耦合的设计思想，提高了可扩展性和可维护性；
* 客户端不应该被迫依赖于它不使用的方法。换句话说，不应该将太多的方法放在一个接口中，而是应该提供更加具体化的接口。
* 吃东西接口、睡觉接口、游泳接口 3个接口 都继承人类接口；学生类实现这3个接口。

#### （5）迪米特原则（Demeter Principle）

**(Law of Demeter, LoD)** （demeter_05）

* 一个对象应该对其他对象保持最少的了解，又被成为最少知道原则；
* 为了降低类与类之间的耦合关系；
* 强调只和朋友交流，不和陌生人说话；
* 朋友指的是成员变量或方法中输入或输出的参数；
* 一个对象应该尽可能少地与其他对象发生相互作用。这意味着对象之间应该保持较低的耦合度，以减少系统的复杂性。
* Boss类实现管理者接口，管理者接口继承人类类，抽象工程师类实现人类类，Java工程师类和Python工程师类继承抽象工程师类，项目经理类实现管理者接口；测试类，老板召集项目经理开会分配任务→项目经理根据程序员分配对应的任务→最后程序员写代码完成任务。

#### （6）里氏替换原则（Liskov Substitution Principle）

 **(Liskov Substitution Principle, LSP)** （liskovsubstitution_06）

* 里氏替换原则是继承复用的基石，对开闭原则的补充；
* 子类可以扩展父类的功能，但是不能修改父类原有的功能；
* 子类可以实现父类的抽象方法，但是不能覆盖原有父类的方法；
* 子类中可以增加自己特有的方法；
* 对子类的继承关系进行约束，开闭原则的补充；
* 可以增加程序的健壮性；
* 子类型必须能够替换掉它们的基类型。也就是说，子类对象应该能够在不改变程序正确性的前提下，替换任何基类对象。
* 基类 Human：定义了所有人的共同属性和方法子类 Student：继承自 Human，并添加了学生特有的属性和方法，如 fun1 和 fun2、fun3方法。子类 Teacher：继承自 Human，并添加了教师特有的属性和方法，如 fun1方法。测试代码：创建了 Student 和 Teacher 对象，并验证了里氏替换原则。通过将 Student 和 Teacher 对象赋值给 Human 类型的变量，确保子类对象可以安全地替换基类对象，而不影响程序的正确性。这样，我们就通过具体的代码示例展示了里氏替换原则的应用。

#### （7）合成复用原则（Composite Reuse Principle）

 **(Composite Reuse Principle, CRP)** （compositionaggregation_07）

* 尽量使用对象组合，聚合的方式，而不是使用继承关系达到软件复用的目的；
* 遵循开闭原则；
* 可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少；
* 尽量使用对象组合，而不是继承来达到复用的目的。继承虽然可以实现代码复用，但是会增加类之间的耦合度，而组合则可以更灵活地实现复用。
* 老师类、学生类、家长类、通知类、电话通知类、微信通知类；老师→通知学生→通知家长→开会。在这个场景中，可以利用合成复用原则来设计类之间的关系，以实现灵活的通知机制。在这个设计中，通过使用组合而不是继承，我们使得通知方式更加灵活，可以随时更换不同的通知方式。同时，这样的设计也更加符合现实世界中的逻辑关系，提高了代码的可读性和可维护性。

## 2、23种设计模式

### 设计模式的类型：

#### 2.1.0 简单工厂模式

（simplefactory_0）

除GOF23种外的设计模式：还有简单工 厂模式，由一个工厂决定创建哪一种产品类型的实例。

###  2.1 创建型模式

这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活

#### 2.1.1 工厂方法模式（Factory Pattern）

（factorymethod_1）

定义一个接口或一个抽象的工厂类，让它实现类(工厂)来决定创建哪一个实例对象；根据每个工厂不同的方法，来产生不同的所需要的对象；工厂方法模式生产的都是相同系列的对象，比如Java课程，Python课程。

#### 2.1.2 抽象工厂模式（Abstract Factory Pattern）

（abstractfactory_2）

抽象工厂模式提供了创建一系列相关或互相依赖对象的接口；类似公司下的产品，生产，生产汽车，将汽车分为各个零部件进行生产，车架，车门，底盘。

#### 2.1.3 建造者(生成器)模式（Builder Pattern）

（builder_3）

将复杂的对象的创建和属性赋值所分离；建造的过程和细节我们不需要知道，只需要通过构建者去进行操作即可。

#### 2.1.4 原型模式（Prototype Pattern）

（prototype_4）

用于创建重复的对象，能够保证创建对象的性能；原型设计模式是创建对象的最佳方式。

#### 2.1.5 单例模式（Singleton Pattern）

（singleton_5）

在程序中想要保持一个实力对象的，就是用单例设计模式；减少内存开销。

##### 懒汉式

（lazy_1）

在需要使用对象的时候，才会创建。

##### 双重检查

（doublechecked_2）

通过两个if判断，加上同步锁进行实现。   

双重检查锁定是一种常用的线程安全的懒汉式单例模式实现，它在多线程环境下既能保证线程安全，又能减少不必要的同步开销。

##### 静态内部类

（staticinnerclass_3）

在单例类中，通过私有的静态内部类，创建单例对象。

##### 饿汉式

（hungry_4）

在调用时，就会创建单例对象，通过静态代码块或静态变量直接初始化。

##### 枚举

（enumsingleton_5）

枚举的方式实现单例模式，是最佳的实现方式；它可以有效防止对单例模式的破坏。

##### 方法一：序列化和反序列的方式破坏单例模式

通过流将单例对象，序列化到文件中，然后再反序列化读取出来；最终通过反序列化的方式创建出一个对象；发现两个对象的内存地址完全不一致，从而破坏了单例设计模式结构。

在单例类中，写一个方法名称必须为readResolve；因为在反序列化创建对象时，是通过反射创建的；反射会调用我们自己的readResolve，方法如果重写了，就代表返回自己的单例对象；如果没有重写，会通过反射的方式创建一个新的对象，从而破坏了单例设计模式。

```java
    // 为了支持序列化和反序列化，防止反序列化时创建新的实例
    // 使用 readResolve 方法确保反序列化时返回的是同一个实例
    protected Object readResolve() {
        return getInstance();
    }
```

##### 方法二：通过反射的方式破坏单例模式

通过字节码对象，创建构造器对象；通过构造器对象，初始化单例对象；由于单例对象的构造方法是私有化的调用构造器中的方法，赋予权限，创建单例对象。

### 2.2 结构型模式

这些模式关注对象之间的组合和关系，旨在解决如何构建灵活且可复用的类和对象结构。

#### 2.2.1 外观模式（Facade Pattern）

（faced_1）

提供了一个统一的接口，用来访问子系统中的一群接口；定义了一个高层接口，让子系统使用更加容易。隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。

#### 2.2.2 适配器模式（Adapter Pattern）

（adapter_2）

适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁，将一个类的接口转换成客户希望的另外一个接口；
适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作；
这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。

#### 2.2.3 桥接模式（Bridge Pattern）

桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。

#### 2.2.4 组合模式（Composite Pattern）

组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。

#### 2.2.5 代理模式（Proxy Pattern）

为对象提供一种代理，以控制这个对象的访问操作
代理对象和目标对象之间起到中介的作用
保护目标对象和增强目标对象
代理模式能将代理对象与真实被调用的目标对象分离
一定程度上降低了系统的耦合度，扩展性好

#### 2.2.6 装饰器模式（Decorator Pattern）

在原有对象不做改变的基础上，将对象的功能附加上
提供了比继承更有弹性的替代方案(扩展原有对象功能)
扩展一个类的功能或给一个类添加附加职责(业务逻辑)
动态的给一个对象添加功能，这些功能可以再动态的撤销
继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果

#### 2.2.7 享元模式（Flyweight Pattern）

提供了减少对象数量从而改善应用所需的对象结构的方式
运用共享技术有效地支持大量细粒度的对象
总结：减少创建对象的数量，从而减少内存的占用，提升性能

###  2.3 行为型模式

这些模式关注对象之间的通信和交互，旨在解决对象之间的责任分配和算法的封装。

#### 2.3.1 模板方法模式（Template Pattern）

定义了一个算法的架构，并允许子类为一个或多个步骤的实现
模板方法在子类不改变算法结构的情况下，重新定义算法的某些步骤
实现一个算法的不变的部分，并将可变的空间留给子类来完成
子类中公共的行为抽取出来并封装到一个公共父类中，避免代码重复

#### 2.3.2 迭代器模式（Iterator Pattern）

提供方法，顺序访问集合对象中的各个元素，而又不暴露对象的内部表示
为遍历不同的集合结构提供统一的接口，分离了集合对象的遍历行为

#### 2.3.3 策略模式（Strategy Pattern）

定义了算法，分别封装起来，它们之间可以相互替换，让算法的变化不会影响到使用算法的用户
如果有大量的if...else...else if...可以通过策略模式进行替换
避免使用多重条件转语句，if...else if...else
提高算法的保密性和安全性

#### 2.3.4 解释器模式（Interpreter Pattern）

通过给定的语言，定义它的语法和行为，并定义解释器，这个解释器使用来解释语言中的句子
为了解释一种语言，而为语言创建的解释器
某个类型问题触发频次足够高，比如处理日志和不同日志格式

#### 2.3.5 观察者模式（Observer Pattern）

当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）
​         比如，当一个对象被修改时，则会自动通知依赖它的对象。
​         让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者(观察者)都会收到通知并更新

#### 2.3.6 备忘录模式（Memento Pattern）

​         在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
​         所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
​         很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。

#### 2.3.7 命令模式（Command Pattern）

​         将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。解决了应用程序中对象的职责以及它们之间的通信方式
​         在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
​         请求调用者和行为实现者需要解耦，使得调用者和行为实现者不直接交互

#### 2.3.8 中介者模式（Mediator Pattern）

​         中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
​         用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
​         对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。

#### 2.3.9 责任链模式（Chain of Responsibility Pattern）

​         为请求创建了一个接收者对象的链。对请求的发送者和接收者进行解耦。
​         在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
​         避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
​         职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。

#### 2.3.10 访问者模式（Visitor Pattern）

​         使用一个访问者类，它改变了元素类的执行算法。
​         通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。
​         根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
​         主要将数据结构与数据操作分离。稳定的数据结构和易变的操作耦合问题。

#### 2.3.11 状态模式（State Pattern）

​         在状态模式（State Pattern）中，类的行为是基于它的状态改变的。
​         允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
​         对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。



## 99+ P25~P58 ；34

YYDS：https://www.bilibili.com/video/BV1iK4y1F7hY