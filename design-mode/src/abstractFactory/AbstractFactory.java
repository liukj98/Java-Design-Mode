package abstractFactory;

/**
 * 抽象工厂：
 * 设定可以生产 主板 和 CPU 规则
 */
public interface AbstractFactory {
    MainBoard getMainBoard();
    CPU getCPU();
}

/**
 * 抽象工厂的具体实现：
 * 生产主板与其对应的 CPU 对象（主板与 CPU 是相互依赖的）
 */
class PlanA implements AbstractFactory{

    @Override
    public MainBoard getMainBoard() {
        return MainBoardFactory.getMainBoard(1);
    }

    @Override
    public CPU getCPU() {
        return CPUFactory.getCPU(1);
    }
}

class PlanB implements AbstractFactory{

    @Override
    public MainBoard getMainBoard() {
        return MainBoardFactory.getMainBoard(2);
    }

    @Override
    public CPU getCPU() {
        return CPUFactory.getCPU(2);
    }
}