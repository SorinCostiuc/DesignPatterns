package solid.dependencyInversion.wrong;

public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Miau miau");
    }
}
