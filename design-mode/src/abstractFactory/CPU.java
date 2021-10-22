package abstractFactory;

/**
 * CPU 接口，设定 CPU 的规则：负责核心计算
 */
public interface CPU {
    // 负责核心计算
    void centralCompute();
}

/**
 * Inter CPU：
 * 具体 CPU 种类，实现了CPU 接口
 */
class CPUInter implements CPU{

    private String name; // 名字
    private int pins; // 管脚

    public CPUInter(String name, int pins) {
        this.name = name;
        this.pins = pins;
    }

    @Override
    public void centralCompute() {
        System.out.println("这是" + this.name + "CPU,管脚有：" + this.pins);
    }
}

/**
 * AMD CPU
 * 具体 CPU 种类，实现了CPU 接口
 */
class CPUAmd implements CPU{

    private String name; // 名字
    private int pins; // 管脚

    public CPUAmd(String name, int pins) {
        this.name = name;
        this.pins = pins;
    }

    @Override
    public void centralCompute() {
        System.out.println("这是" + this.name + "CPU,管教有：" + this.pins);
    }
}