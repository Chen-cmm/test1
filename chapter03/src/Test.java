public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBand("凯迪拉克");
        car1.setColor("黑武士");
        car1.setPrice(210000);
        System.out.println("品牌是："+car1.getBand());
        System.out.println("价格是：" + car1.getPrice());
        System.out.println("颜色是：" + car1.getColor());
    }
}
