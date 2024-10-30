# 设计模式Design pattern

## 1、设计模式介绍

* 代表了代码的最佳实践，被有经验的开发人员所使用；
* 设计模式是很多被反复使用并知晓的，主要是对代码和经验的总结；
* 使用设计模式是为了重用代码，让代码更容易被他人理解，保证代码的可靠性；
* 对接口编程而不是对实现编程；
* 优先使用对象组合而不是继承关系。

### 1.1 设计模式七大原则

#### （1）开闭原则

 **(Open/Closed Principle, OCP)** （openclose_01）

* 对扩展开放，对修改关闭；
* 编写软件，比如类，模块，方法；
* 使用抽象进行构建，使用实现扩展细节；
* 面向抽象编程；
* 提高软件系统的可复用性和可维护性；
* 软件实体（如类、模块、函数等）应当对扩展开放，对修改关闭。这意味着在不影响现有代码的情况下，通过增加新的类来实现新功能或行为。
* 学生和高中生都依赖于人类接口，如果还有高中生、研究生等等都是通过增加新的类并继承人类接口来实现新功能或行为。

#### （2）依赖倒置原则

 **(Dependency Inversion Principle, DIP)** （dependencyinversion02）

* 依赖倒转原则是开闭原则的基础，针对接口进行编程；
* 依赖抽象，而不是具体的实现；
* 可以减少类之间的耦合行，提高系统稳定性，提高代码可读性和可维护性；
* 降低修改程序所造成的风险；
* 高层模块不应该依赖于低层模块，二者都应该依赖于抽象；抽象不应该依赖于细节，细节应该依赖于抽象。这有助于降低系统的耦合度，提高灵活性。
* 抽象类程序员类实现人类接口类，Java程序员和测试程序员都继承于抽象类程序员类。

#### （3）单一职责原则

 **(Single Responsibility Principle, SRP)** （singleresponsibility_03）

* 一个类，接口，方法，只负责一项职责；
* 降低程序的复杂度，提高程序可维护性，降低了变更所带来的风险；
* 每个类应该只有一个改变的理由，即每个类应该只负责一项功能。这样可以确保类的职责清晰，易于理解和维护。
* 抽象类程序员类实现人类接口类，Java程序员继承于抽象类程序员类。`JavaProgrammer` 类通过持有 `Order` 类的引用，表达了它对外卖订单功能的使用需求。这种方式遵循了单一职责原则，即一个类应该只有一个改变的理由。在这里，`JavaProgrammer` 负责描述程序员的工作、吃饭和睡觉等行为，而具体的订餐逻辑则由 `Order` 类负责，从而实现了职责分离，使得代码更加清晰和易于维护。

#### （4）接口隔离原则

 **(Interface Segregation Principle, ISP)**

* 用多个接口，而不是使用单一的接口；
* 尽量细化接口，接口中的方法尽量少；
* 符合低耦合的设计思想，提高了可扩展性和可维护性；
* 客户端不应该被迫依赖于它不使用的方法。换句话说，不应该将太多的方法放在一个接口中，而是应该提供更加具体化的接口。

#### （5）迪米特原则

**(Law of Demeter, LoD)**

* 一个对象应该对其他对象保持最少的了解，又被成为最少知道原则；
* 为了降低类与类之间的耦合关系；
* 强调只和朋友交流，不和陌生人说话；
* 朋友指的是成员变量或方法中输入或输出的参数；
* 一个对象应该尽可能少地与其他对象发生相互作用。这意味着对象之间应该保持较低的耦合度，以减少系统的复杂性。

#### （6）里氏替换原则

 **(Liskov Substitution Principle, LSP)**

* 里氏替换原则是继承复用的基石，对开闭原则的补充；
* 子类可以扩展父类的功能，但是不能修改父类原有的功能；
* 子类可以实现父类的抽象方法，但是不能覆盖原有父类的方法；
* 子类中可以增加自己特有的方法；
* 对子类的继承关系进行约束，开闭原则的补充；
* 可以增加程序的健壮性；
* 子类型必须能够替换掉它们的基类型。也就是说，子类对象应该能够在不改变程序正确性的前提下，替换任何基类对象。

#### （7）合成复用原则

 **(Composite Reuse Principle, CRP)**

* 尽量使用对象组合，聚合的方式，而不是使用继承关系达到软件复用的目的；
* 可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少；
* 尽量使用对象组合，而不是继承来达到复用的目的。继承虽然可以实现代码复用，但是会增加类之间的耦合度，而组合则可以更灵活地实现复用。



## 2、23种设计模式





## 99+ P5~P58