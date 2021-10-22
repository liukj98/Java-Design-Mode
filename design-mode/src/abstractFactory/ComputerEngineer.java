package abstractFactory;

/**
 * 组装工程师
 * 负责组装主板和CPU
 */
public class ComputerEngineer {
    /**
     * 阶段一：
     * 组装电脑，需要的组件有：主板和 CPU
     * @param mainBoard 对应的主板 需要用户创建对象
     * @param cpu 对应的 CPU 需要用户创建对象
     */
    public void composeComputer(MainBoard mainBoard, CPU cpu){
        mainBoard.installCPU();
        cpu.centralCompute();
    }

    /**
     * 阶段二：
     * 组装电脑，传入主板和 CPU 对应的参数，对应的对象不需要用户手动创建
     * @param mainBoardType
     * @param cpuType
     */
    public void composeComputer02(int mainBoardType, int cpuType){
        MainBoard mainBoard = MainBoardFactory.getMainBoard(mainBoardType);
        CPU cpu = CPUFactory.getCPU(cpuType);
        mainBoard.installCPU();
        cpu.centralCompute();
    }

    /**
     * 阶段三:
     * 传入主板和 CPU 的组合，以保证主板和 CPU 匹配，
     * @param plan
     */
    public void composeComputer03(AbstractFactory plan){
        MainBoard mainBoard = plan.getMainBoard();
        CPU cpu = plan.getCPU();
        mainBoard.installCPU();
        cpu.centralCompute();
    }
}
