package oop20;

public class Test {
    public static void main(String[] args) {
        CreditAccount cre = new CreditAccount("acc",4124,1);
        System.out.println(cre.getCredit());
        System.out.println(cre.getActno());
        System.out.println(cre.getBalance());
    }
}
