package oop25;

public class MonsterImpl implements Monster{

    private String name;
    private int health;
    private int attack;
    private int defense;

    private int threshold;
    public MonsterImpl(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.threshold = health/2;
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
        this.health-=health;
    }

    @Override
    public void Attack(Character character) {
        if (this.getHealth()<=this.threshold){
            this.attack*=2;
        }
        System.out.println(this.getName()+"对"+character.getName()+"发动了攻击");
        System.out.println(character.getName()+"的生命值还有"+(character.getHealth()-(this.getAttack()-character.getDefense())));
        character.setHealth(this.getAttack()-character.getDefense());

    }

    @Override
    public void defense(Character character) {

    }

    @Override
    public int getReward() {
        return 0;
    }


}
