package oop25;

/**
 * 角色接口
 */
public interface Character {
    /**
     * 获取角色姓名
     */
    String getName();

    /**
     * 获取生命值
     * @return
     */
    int getHealth();

    /**
     * 获取攻击力
     * @return
     */
    int getAttack();

    /**
     * 获取防御值
     * @return
     */
    int getDefense();

    void setHealth(int health);

    /**
     * 攻击:攻击另一个角色，所以参数应该是角色
     */
    void Attack(Character character);

    /**
     * 防御：防御也是防御另一个角色，所以参数是角色
     */
    void defense(Character character);
}
