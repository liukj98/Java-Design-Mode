package abstractFactory;

/**
 * CPU 工厂
 * 用来创建具体的 CPU 类型
 */
public class CPUFactory {
    /**
     * 根据传入的参数来创建对应的 CPU 对象
     * type：1 返回 AmdCPU
     * type：2 返回 InterCPU
     * @param type
     * @return CPU
     */
    public static CPU getCPU(int type){
        switch (type){
            case 1:
                return new CPUAmd("amd", 11123);
            case 2:
                return new CPUInter("inter", 1134);
            default:
                return null;
        }
    }
}
