package oop27;

/**
 * 只要人名一样，住址一样就认为是同一个人
 */
public class Test {
    public static void main(String[] args) {
        Address addr1 = new Address("重庆","南岸");
        User user1 = new User("张三",addr1);

        Address addr2 = new Address("重庆","南岸");
        User user2 = new User("张三",addr2);

        System.out.println(user1.equals(user2));
    }
}
