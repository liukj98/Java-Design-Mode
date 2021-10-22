package abstractFactory;

import org.junit.Test;

public class TestComputerEngineer {

    @Test
    public void test(){
        // 创建一个组装工程师
        ComputerEngineer computerEngineer = new ComputerEngineer();
        // 创建一种类型的主板
        MainBoardSIFOU sifou  = new MainBoardSIFOU("思否", 1112);
        // 创建一种类型的CPU
        CPUAmd amd = new CPUAmd("amd", 1234);

        computerEngineer.composeComputer(sifou, amd);
    }

    @Test
    public void test02(){
        // 创建一个组装工程师
        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.composeComputer02(1,2);
    }

    @Test
    public void test03(){
        // 创建一个组装工程师
        ComputerEngineer computerEngineer = new ComputerEngineer();
//        PlanA planA = new PlanA();// 方案一
        PlanB planB = new PlanB();// 方案二
        computerEngineer.composeComputer03(planB);
    }
}
