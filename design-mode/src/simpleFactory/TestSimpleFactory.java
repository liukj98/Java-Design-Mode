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

