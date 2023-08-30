package Lec41.OOPs3;

public abstract class AbstractClassDemo {
    String name;
    int age;

    protected AbstractClassDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected abstract String getName();
    protected abstract int getAge();
    protected abstract void setName(String name);
    protected abstract void setAge(int age);
}
