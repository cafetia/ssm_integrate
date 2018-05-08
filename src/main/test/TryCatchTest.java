public class TryCatchTest {
    /**
     * 主要方法
     */
    public static void main(String[] args) {
        // 调用 测试方法
        String result = get();
        // 打印 测试方法返回的结果
        System.out.println(result);
}

    @SuppressWarnings({ "finally", "unused" })//此注解为抑制警告的作用
    public static String get(){
        int value = 0;
        try {
            System.out.println("try……");
            //等式1/0 ：分母为0 的明显错误          ——制造错误（用于抛异常）
            int result = 1 / value;
            return "111";

        } catch (Exception e) {
            System.out.println("catch……");
            return "444";//如果finally中没有return值，则使用catch里面的，如果有，则使用finally里面的。
        } finally {
            System.out.println("finally……");
           return "333";
        }
    }
}
