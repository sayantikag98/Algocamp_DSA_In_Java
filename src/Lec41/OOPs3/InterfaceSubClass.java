package Lec41.OOPs3;

public class InterfaceSubClass implements InterfaceDemo, D{
    @Override
    public void printInfo(){
        System.out.println("print info");
    }
    @Override
    public void msgA(){
        System.out.println("msg A");
    }

    @Override
    public void msgB(){
        System.out.println("msg B");
    }

    @Override
    public void msgC(){
        System.out.println("msg C");
    }

    @Override
    public void msgD(){
        System.out.println("msg D");
    }

    public static void main(String[] args){
        InterfaceSubClass isc = new InterfaceSubClass();
        isc.printInfo();
        isc.msgA();
        isc.msgB();
        isc.msgC();
        isc.msgD();
        InterfaceDemo.printStaticMessage();
        isc.printNonStaticMessage();
    }
}

class subClass implements InterfaceDemo{
    @Override
    public void printInfo(){
        System.out.println("hello world");
    }

}
