package example;

public class Dog1 implements AnimalInterface{
    @Override
    public void move() {
        System.out.println("쇼쇽");
    }

    @Override
    public void bark(){
        System.out.println("멍뭉");
    }

    @Override
    public void eat() {
        System.out.println("챱챱");
    }
}
