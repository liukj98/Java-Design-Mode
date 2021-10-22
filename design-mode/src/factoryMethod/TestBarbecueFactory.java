package factoryMethod;

import org.junit.Test;

public class TestBarbecueFactory {

    @Test
    public void test() {
        //
        BarbecueFactory shop1 = new BarbecueFactoryShop1();
        Barbecue barbecue = shop1.getBarbecue();
        barbecue.sellBeef();
    }

    @Test
    public void test02() {
        BarbecueFactory shop2 = new BarbecueFactoryShop2();
        Barbecue barbecue = shop2.getBarbecue();
        barbecue.sellBeef();
    }
}
