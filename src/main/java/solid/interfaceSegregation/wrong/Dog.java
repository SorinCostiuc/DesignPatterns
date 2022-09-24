package solid.interfaceSegregation.wrong;

public class Dog implements Animal {
    @Override
    public void crawl() {
    }
    @Override
    public void bark() {
        System.out.println("Ham ham");
    }
    @Override
    public void fly() {
    }
    @Override
    public void swim() {
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
