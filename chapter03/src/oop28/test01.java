package oop28;

/**
 * hashCode：返回一个对象的哈希值，通常作为在哈希表中查找该对象的键值
 * Object类的默认实现是根据对象的内存地址生成一个哈希码（即将对象的内存地址转换为整数作为哈希值）
 * hashCode是为了HashMap、Hashtable、HashSet等集合类进行优化而设置的，以便更快地查找和存储对象
 */
public class test01 {
    public static void main(String[] args) {
        test01 t = new test01();
        int i = t.hashCode();
        System.out.println(i);//1163157884

        test01 t2 = new test01();
        int i1 = t2.hashCode();
        System.out.println(i1);//1956725890
    }
}
