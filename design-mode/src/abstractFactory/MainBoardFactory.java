package abstractFactory;

/**
 * 主板工厂
 * 用来创建具体的主板类型
 */
public class MainBoardFactory {

    /**
     * 根据传入的参数来创建对应的主板对象
     * type: 1 返回华硕主板
     * type: 2 返回思否主板
     * @param type
     * @return
     */
    public static MainBoard getMainBoard(int type){
        switch (type){
            case 1:
                return new MainBoardASUS("华硕", 1123);
            case 2:
                return new MainBoardSIFOU("思否", 1234);
            default:
                return null;
        }
    }

}
