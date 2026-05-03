package OOPs;

public class Animal {
    public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.bark("Tomy");
       d1.sleep("Shera");
       Cat c1 = new Cat();
       c1.bark("Mani");
       c1.hungry();

    }
}
class Dog{
    void bark(String name){
        System.out.println(name+" is Barking");
    }

    void sleep(String name){
        System.out.println(name+" is slepping");
    }

}
class Cat extends Dog{
        void hungry(){
            System.out.println("Cat is hungry");
        }
}