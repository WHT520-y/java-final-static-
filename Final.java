
/**
 * final 和  static 一般搭配使用，效率更高，因为这样不会导致类的加载，底层编译器做了优化
 */
public class FinalDetial02 {
    public static void main(String[] args) {
        System.out.println(DDD.num);
        System.out.println(FFF.num);
    }
}

class DDD {
    public static final int num = 10000;

    static {
        System.out.println("DDD类加载了！！！");
    }
}

class FFF{
    public static int num = 20000;

    static {
        System.out.println("FFF类加载了！！！");
    }
}
