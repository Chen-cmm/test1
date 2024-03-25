package oop17;
/**
主人喂养宠物的案例，适用多态机制，达到OCP原则
 */
public class Test {
    public static void main(String[] args) {
        Master m = new Master();
        Cat c = new Cat();
        Dog d = new Dog();

        m.feed(c);
        m.feed(d);

    }
}
