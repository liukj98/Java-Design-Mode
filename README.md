# Java-Design-Mode
Java 设计模式

在学习设计模式之前，你需要掌握一些前置知识：
1. 类的加载全过程（ClassLoader）
2. Java 中的权限修饰符、static、final、synchronized、volatile 等关键字

## 设计模式

> **每一种设计模式都是为了解决特定领域的问题而出现的，不要为了学设计模式而去学设计模式，我们更应该关注的是每一种设计模式背后的思想**
>
> 常见的设计模式有 23 种，大体分为三种类型：创建型、结构型、行为型

### 创建型

#### 单例模式

1. 饿汉式
2. 懒汉式
3. 加锁
4. 双重加锁
5. 双重加锁+指令重排

```java
package singleton;

/**
 * 前置知识：「类加载」
 * 方式一：饿汉式（立即加载）创建单例模式
 */
class Singleton {
    // 1、将构造方法设为私有，不允许类外直接通过 new 的方式来创建对象
    private Singleton(){}

    // 2、定义一个私有属性，以保证外部不可直接通过类进行直接访问；设置为 static，以保证该属性只有一个实例
    private static Singleton single = new Singleton();

    // 3、定义一个静态方法，供外部访问。返回唯一的属性 single
    public static Singleton getSingle(){
        return single;
    }

    /**
     * 分析：
     * 1、在类加载的时候就会创建对象，并占用内存空间，所以这种单例模式也称为「饿汉式」，因为在未使用该类时就已经创建了对象了
     * 2、在实际项目开发过程中可能有上百个这样的类，但是并不会都使用到，
     *      所以部分这样的类由于没有使用到但却在类加载的过程中创建了对象，占用了内存空间而导致资源的浪费
     */
}

/**
 * 方式二：懒汉式（延迟加载）创建单例模式
 * 1、只在使用到该类时创建对象，相比饿汉时能够减少资源的浪费
 * 2、但是这种方式有一个问题：不能解决多线程并发访问可能发生冲突的现象
 */
class Singleton{
    private Singleton() {}

    private static Singleton single;

    public static Singleton getSingle(){
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }
}

/**
 * 方式三：加锁
 * 1、在返回对象的方法上加一个锁，以保证当一个线程调用该方法时其它线程不能调用该方法，从而避免多线程并发的问题
 * 2、但是还有一个问题：如果加锁的方法里有一千行代码甚至更多，效率就会变得很低。
 *      因为其它线程要等获取该方法锁的线程将该方法执行完后才能继续抢占该方法
 *      而由于该方法代码量很多，所以执行该方法可能很慢，进而导致其它线程等待时间延长
 */
class Singleton{
    private Singleton() {}

    private static Singleton single;

    public synchronized static Singleton getSingle(){
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }
}


/**
 * 方式四：双重加锁
 * 1、只在需要加锁的地方加锁，最大程度地保证代码的执行效率
 */
class Singleton{
    private Singleton() {}

    private static Singleton single;

    public static Singleton getSingle(){
        if (single == null) {
            synchronized (Singleton.class){
                if (single == null){
                    single = new Singleton();
                }
            }
        }
        return single;
    }
}
```

#### 简单工厂模式

特殊的一种，严格来说不算是设计模式的一种。但是，它的使用场景非常广泛
![img.png](https://cdn.jsdelivr.net/gh/liukj98/image-hosting@master/Java学习图片资源/img.7l9ulshtjk80.png)

有点像 Spring IOC 的意思，对象的创建并不交由用户，而是由工厂进行统一的管理

```java
package simpleFactory;

// 定义一个 Barbecue 的接口
interface Barbecue{
    void sellBeef();
}

// 定义一个店铺实现上述接口
class Shop1 implements Barbecue{
    @Override
    public void sellBeef() {
        System.out.println("shop1 卖肉串");
    }
}

// 定义一个店铺实现上述接口
class Shop2 implements Barbecue{
    @Override
    public void sellBeef() {
        System.out.println("shop2 卖肉串");
    }
}

// 定义一个工厂统一管理所有店铺
public class SimpleFactory {
    public Barbecue getBarbecue(String type){
        switch (type){
            case "小明":
                return new Shop1();
            case "小红":
                return new Shop2();
            default:
                return null;
        }
    }
}


package simpleFactory;
import org.junit.Test;
public class TestSimpleFactory {
    @Test
    public void test(){
        SimpleFactory simpleFactory = new SimpleFactory();
       	Barbecue barbecue = simpleFactory.getBarbecue("小红");
        barbecue.sellBeef();
    }
}


```




#### 工厂方法模式

#### 抽象工厂模式

#### 建造者模式

#### 原型模式



### 结构型

#### 适配器

#### 装饰者

#### 代理模式（静态、动态）

#### 外观模式

#### 桥接模式

#### 组合模式

#### 享元模式



### 行为型

#### 策略模式

#### 模版（方法）模式

#### 代理模式（静态、动态）

#### 观察者

#### 责任链

#### 迭代器模式

#### 命令模式

#### 备忘录模式

#### 状态模式

#### 访问者模式

#### 中介者模式

#### 解析器模式