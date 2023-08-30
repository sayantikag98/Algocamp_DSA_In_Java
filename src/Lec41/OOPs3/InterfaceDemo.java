package Lec41.OOPs3;


// All interface methods are by default public
public interface InterfaceDemo {

    private static void getStaticMessage(){
        System.out.println("hello");
    }


    static void printStaticMessage(){
        getStaticMessage();
    }

    private void getNonStaticMessage(){
        System.out.println("hi");
    }

    default void printNonStaticMessage(){
        getNonStaticMessage();
    }

    void printInfo();
}

interface A{
    void msgA();
}

interface B{
    void msgB();
}

interface C extends A,B{
    void msgC();
}

interface D extends C{
    void msgD();
}
