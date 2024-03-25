package oop25;

public class Hero implements Character{

    private String name;
    private int health;
    private int attack;
    private int defense;

    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public void setHealth(int health) {

    }

    @Override
    public void Attack(Character character) {
        System.out.println(this.getName()+"对"+character.getName()+"发动了攻击");
        System.out.println(character.getName()+"的生命值还有"+(character.getHealth()-(this.getAttack()-character.getDefense())));
        character.setHealth((this.getAttack()-character.getDefense()));

    }

    @Override
    public void defense(Character character) {

    }
}
