package hws.example.e162;

public class E162Animal {
    private String type;

    public E162Animal(String type) {
        this.type = type;
    }
    public void eat(){
        System.out.println("I am an animal eating");

    }
    protected void sleep() {
        System.out.println("I am an animal sleeping");
    }
    void makeSound() {
        System.out.println("I am an animal making sound");
    }
    private void roam() {
        System.out.println("I am an animal roaming");
    }
}

