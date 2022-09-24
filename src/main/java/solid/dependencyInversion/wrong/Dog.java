package solid.dependencyInversion.wrong;


public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Ham ham");
    }
}
