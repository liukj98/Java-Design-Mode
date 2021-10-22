package singleton;

import org.junit.Test;

public class TestSingleton {

    @Test
    public void testSingleton(){
        Singleton s1 = Singleton.getSingle();
        Singleton s2 = Singleton.getSingle();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

    @Test
    public void testSingleton02(){
        Singleton02 s1 = Singleton02.getSingle();
        Singleton02 s2 = Singleton02.getSingle();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
