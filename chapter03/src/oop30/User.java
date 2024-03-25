package oop30;

public class User implements Cloneable{
    private String name;
    private Address addr;

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //重写方法，让其达到深克隆的方法
        //User要克隆，User对象关联的Address对象也需要克隆一份
        Address copyAddr = (Address)this.getAddr().clone();
        User copyUser = (User)super.clone();
        copyUser.setAddr(copyAddr);
        return copyUser;
    }
}
