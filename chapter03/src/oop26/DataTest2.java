package oop26;

/**
 * Object类的equals方法
 *
 * 1.equals方法的作用是判断两个对象是否相等
 *       equals方法底层比较是用的==，而 == 的运算规则是比较两个变量中保存的值是否相等
 *       假如在这个日期类中，想要比较两个日期是否相等，就得重写equals方法
 * 2.equals方法在在进行比较的时候，比较的是两个java对象的内存地址，
 *   但是我们想比较对象的内容，所以要重写equals方法。
 *   需要的结果是：只要对象的内容相等就返回true
 *
 */
public class DataTest2 {
    public static void main(String[] args) {
        Data d1 = new Data(2008,2,2);
        Data d2 = new Data(2008,2,2);

        System.out.println(d1.equals(d2));
    }
}
