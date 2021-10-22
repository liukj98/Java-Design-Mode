package abstractFactory;

/**
 * MainBoard 接口，设定 MainBoard 的规则：负责安装 CPU
 */
public interface MainBoard {
    // 负责安装 CPU
    void installCPU();
}


/**
 * 华硕主板：
 * 具体 MainBoard 种类，实现了 MainBoard 接口
 */
class MainBoardASUS implements MainBoard{

    private String name; // 名字
    private int pinHoles; // 主板上CPU针孔数

    public MainBoardASUS(String name, int pinHoles) {
        this.name = name;
        this.pinHoles = pinHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("这是" + this.name + "主板，CPU针孔数：" + this.pinHoles);
    }
}

/**
 * 思否主板：
 * 具体 MainBoard 种类，实现了 MainBoard 接口
 */
class MainBoardSIFOU implements MainBoard{

    private String name; // 名字
    private int pinHoles; // 主板上CPU针孔数

    public MainBoardSIFOU(String name, int pinHoles) {
        this.name = name;
        this.pinHoles = pinHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("这是" + this.name + "主板，CPU针孔数：" + this.pinHoles);
    }
}

