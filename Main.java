class Animal{
    String name;
    void DisplayName(String name){
        System.out.println("The animal name is from animal class:"+name);
    }
}
class Dog extends Animal{
    void setName(String name){
        System.out.println("The animal name is from dog class:"+name);
    }
}
class Cat extends Animal{
    void setName(String name){
        System.out.println("The animal name is from cat class:"+name);
    }
}
public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Dog");
        Cat cat = new Cat();
        cat.setName("Cat");
    }
}
