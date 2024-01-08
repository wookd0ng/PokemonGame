package example;

public abstract class Animal {
    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void bark();
    public void move(){ System.out.println("쇽쇽");}
    public void eat(){ System.out.println("챱챱");}
}