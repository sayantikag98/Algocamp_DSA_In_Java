package Lec41.OOPs3;

public class AbstractClassSubClass extends AbstractClassDemo{
    String name;
    int age;

    protected AbstractClassSubClass(String name, int age){
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    protected String getName(){
        return this.name;
    }

    @Override
    protected int getAge(){
        return this.age;
    }

    @Override
    protected void setName(String name){
        this.name = name;
    }

    @Override
    protected void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args){
        AbstractClassSubClass ab = new AbstractClassSubClass("Sayantika", 25);
        System.out.println(ab.getName());
        System.out.println(ab.getAge());
        ab.setName("Licy");
        ab.setAge(24);
        System.out.println(ab.getName());
        System.out.println(ab.getAge());
    }
}
