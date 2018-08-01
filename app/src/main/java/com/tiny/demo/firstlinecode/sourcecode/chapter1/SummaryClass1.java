package com.tiny.demo.firstlinecode.sourcecode.chapter1;

import com.tiny.demo.firstlinecode.sourcecode.chapter1.imageloader.imageloader2.ImageCache2;

/**
 * Desc:    用来总结的类。
 * Created by tiny on 2017/10/2.
 * Version:
 */

public class SummaryClass1 {
    /**
     * 第一章 走向灵活软件之路——面向对象的六大原则
     * ①优化代码的第一步——单一职责原则
     * ②让程序更稳定、更灵活——开闭原则
     * ③构建拓展性更好的系统——里氏替换原则
     * ④让项目拥有变化的能力——依赖倒置原则
     * ⑤系统有更高的灵活性——接口隔离原则
     * ⑥更好的可拓展性——迪米特原则
     */

    /**
     * 1、单一职责原则相关——优化代码的第一步
     * {@link com.tiny.demo.firstlinecode.sourcecode.chapter1.imageloader.imageloader2.ImageLoader2}
     * {@link ImageCache2}
     * 单一职责原则的英文名称是Single Responsibility Principle，缩写是SRP。
     * SRP的定义是：就一个类而言，应该仅有一个引起它变化的原因。
     * 从ImageLoader1的例子中我们能够体会到，单一职责原则所表达出的用意就是"单一"二字。
     * 如何划分一个类，一个函数的职责，每个人都有自己的看法，这需要根据个人经验、具体的业务逻辑而定。
     * 但是，它也有一些基本的指导原则，例如，两个完全不一样的功能就不应该放在一个类中。
     * 一个类中应该是一组相关性很高的函数、数据的封装。工程师可以不断地审视自己的代码，
     * 根据具体的业务、功能对类进行相应的拆分，这是程序员优化代码迈出的第一步。
     */

    /**
     * 2、开闭原则相关——让程序更稳定、更灵活。
     * 开闭原则的英文全称是Open Close Principle，缩写是OCP，它是java世界里最基础的设计原则，
     * 它指导我们如何建立一个稳定的，灵活的系统。开闭原则的定义是：软件中的对象（类，模块、函数等）应该对于拓展是开放的，
     * 但是，对于修改是封闭的。在软件的生命周期内，因为变化、升级和维护等原因需要对软件原有代码进行修改时，可能会将错误
     * 引入原本已经经过测试的旧代码中，破坏原有系统。因此，当软件需要变化时，我们应该尽量通过拓展的方式来实现变化，而不是
     * 通过修改以实现的代码来实现。
     * 勃兰特 梅耶在1988年出版的《面向对象软件构造》一书中提出这一原则——开闭原则。这一想法认为，程序一旦开发完成，程序中
     * 一个类的实现只是应该因错误而被修改，新的或者改变的特性应该通过新建不同的类实现，新建的类可以通过继承的方式来重用
     * 原来的代码。显然，梅耶的定义提倡实现继承，以存在的实现类对于修改时封闭的，但是心得实现类可以通过复写父类的接口
     * 应对变化。
     */

    /**
     * 3、里氏替换原则——构建扩展性更好的系统
     * 里氏替换原则英文全称是Liskov Substitution Principle，缩写是LSP。
     * LSP的第一种定义是：如果对每一个类型为S的对象O1，都有类型为T的对象O2，使得以T定义的所有程序P在所有的对象O1
     * 都代换成O2时，程序P的行为没有发生变化，那么类型S是类型T的子类型。
     * 里氏替换原则的第二种定义：所有引用基类的地方必须能透明地使用其子类的对象。
     * 里氏替换原则的核心原理是抽象，抽象又依赖于继承这个特性，在OOP中，继承的优缺点都相当明显。优点有以下几点：
     * ①代码重用，减少创建类的成本，每个子类都拥有父类的方法和属性；
     * ②子类与父类基本相似，但又与父类有所区别；
     * ③提高代码的可拓展性。
     * 继承的缺点：
     * ①继承是侵入性的，只要继承就必须拥有父类的所有属性和方法；
     * ②可能造成子类代码冗余、灵活性降低，因为子类必须拥有父类的属性和方法。
     */

    /**
     * 4、依赖倒置原则——让项目拥有变化的能力
     * 依赖倒置原则英文全称是Dependence Inversion Principle，缩写是DIP。依赖倒置原则指代了一种特定的解耦形式，
     * 使得高层次的模块不依赖于低层次的模块的实现细节的目的，依赖模块被颠倒了。
     * 依赖导致原则有以下几个关键点：
     * ①高层模块不应该依赖低层模块，两者都应该依赖其抽象；
     * ②抽象不应该依赖细节；
     * ③细节应该依赖抽象。
     *
     * 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的。
     * 这又是一个将理论抽象化的示例，其实一句话就可以概括：面向接口编程，或者说是面向抽象编程，这里的抽象指的是接口
     * 或者抽象类。面向接口编程是面向对象精髓之一，也就是上面两节强调的抽象。
     * 依赖抽象，而不依赖具体实现。
     *
     * 参照下面的ImageLoader，我们建立了ImageCache抽象，并且让ImageLoader依赖于具体抽象而不是具体细节。
     * 当需求发生变化时，小民只需要实现ImageCache类或者继承其他已有的ImageCache子类完成相应的缓存功能，
     * 然后将具体的实现注入到ImageLoader即可实现缓存功能的替换，这就保证了缓存系统的高可拓展性，有了拥抱变化的能力，
     * 这就是依赖倒置原则。
     * 要想让系统更为灵活，抽象似乎成了我们唯一的手段。
     * {@link com.tiny.demo.firstlinecode.sourcecode.chapter1.imageloader.imageloader3.version2.ImageLoader31}
     *
     */

    /**
     * 5、接口隔离原则——系统有更高的灵活性
     * 接口隔离原则英文全称是Interface Segregation Principles，缩写是ISP。ISP的定义是：客户端不应该依赖它不需要的
     * 接口。另一种定义是：类间的依赖关系应该建立在最小的接口上。
     */

    /**
     * 6、迪米特原则——更好的可拓展性
     * 迪米特原则英文全称为Law of Demeter，缩写是LOD，也成为最少知识原则(Least Knowledge Principle)。虽然名字不同，
     * 但描述的事同一个原则：一个对应该对其他对象有最少的了解。通俗的将，一个类应该对自己需要耦合或调用的类知道得最少，
     * 类的内部如何实现与调用者或者依赖者没有关系，调用者或者依赖者只需要知道它需要的方法即可，其他的可一概不用管。
     * 类与类之间的关系越密切，耦合度越大，当一个类发生改变时，对另一个雷的影响也越大。
     * 迪米特法则还有一个英文解释是Only talk to your immediate friend，翻译过来就是：只与直接的朋友通信。
     * 什么叫做直接的朋友呢？每个对象都必然会与其他对象有耦合关系，两个对象之间的耦合就称为朋友关系，这种朋友关系有很多，
     * 如组合、聚合、依赖等。
     */
}
