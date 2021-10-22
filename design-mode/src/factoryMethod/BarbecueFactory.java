package factoryMethod;

// 总工厂
public abstract class BarbecueFactory {

    // 抽象方法，由子工厂继承实现，在该方法内进行对象的创建
    protected abstract Barbecue chooseBarbecue();

    // 提供给用户使用，隐藏了创建的具体对象，具体的对象由子工厂来创建
    public Barbecue getBarbecue(){
        return chooseBarbecue();
    }
}

// 子工厂1
class BarbecueFactoryShop1 extends BarbecueFactory{

    @Override
    protected Barbecue chooseBarbecue() {
        // 创建一个对象
        return new Shop1();
    }
}

// 子工厂2
class BarbecueFactoryShop2 extends BarbecueFactory{

    @Override
    protected Barbecue chooseBarbecue() {
        // 创建一个对象
        return new Shop2();
    }
}

interface Barbecue{
    void sellBeef();
}

class Shop1 implements Barbecue{

    @Override
    public void sellBeef() {
        System.out.println("shop1 卖肉串");
    }
}

class Shop2 implements Barbecue{

    @Override
    public void sellBeef() {
        System.out.println("shop2 卖肉串");
    }
}