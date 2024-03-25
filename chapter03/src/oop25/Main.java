package oop25;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("剑士",30,3,2);
        MonsterImpl monster1 = new MonsterImpl("骷髅王",20,4,1);

        hero1.Attack(monster1);
        hero1.Attack(monster1);
        hero1.Attack(monster1);
        hero1.Attack(monster1);
        hero1.Attack(monster1);
        hero1.Attack(monster1);

        monster1.Attack(hero1);
    }
}
