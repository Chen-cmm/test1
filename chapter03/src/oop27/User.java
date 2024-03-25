package oop27;

public class User {
    private String name;
    private Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
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
    public boolean equals(Object obj) {
        if (obj==null)return false;
        if (obj==this)return true;
        if (obj instanceof User){
            User u = (User) obj;
            //字符串比较不能使用==比较，因为String类型也是相当于一个引用类型，
            //用==比较的是两个内存地址，而不是两个字符串的值
            //String类中的equals方法已经重写了，比较的是两个字符串的值
            if (this.name.equals(u.name)&&this.addr.equals(u.addr)){
                return true;
            }
        }
        return false;
    }
}
