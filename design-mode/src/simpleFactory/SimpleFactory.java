package simpleFactory;

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

interface Barbecue{
    void sellBeef();
}

class Shop1 implements Barbecue{

    @Override
    public void sellBeef() {
        System.out.println("小明 卖肉串");
    }
}

class Shop2 implements Barbecue{

    @Override
    public void sellBeef() {
        System.out.println("小红 卖肉串");
    }
}


