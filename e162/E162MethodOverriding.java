package hws.example.e162;

public class E162MethodOverriding {

    public static void main(String[] args) {
        E162Animal[] animals = {new Cat(), new Kitten1(), new Kitten2(), new Kitten3()};
        for (E162Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
        Cat cat = new Cat();
        cat.makeSound();
    }
    }

