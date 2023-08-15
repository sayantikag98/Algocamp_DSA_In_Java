package Lec30.OOPs;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Animal(false);
        System.out.println(a.canSpeak);
        a.hasMovement();
    }
}
