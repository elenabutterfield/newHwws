package hws.example.e88;

// Declare the Dog class
class Dog {

    String breed;
    String name;
    String color;

    void bark() {
        System.out.println(breed + " can bark");
    }

    void run() {
        System.out.println(breed + " can run");
    }

    void play() {
        System.out.println(breed + " can play");
    }


        public static void main(String[] args) {
            // Step 4: Create Objects
            Dog husky = new Dog();
            husky.breed = "Husky";
            husky.name = "AnyName";
            husky.color = "AnyColor";

            Dog bulldog = new Dog();
            bulldog.breed = "Bulldog";
            bulldog.name = "AnyName";
            bulldog.color = "AnyColor";


            Dog labrador = new Dog();
            labrador.breed = "Labrador";
            labrador.name = "AnyName";
            labrador.color = "AnyColor";

            husky.bark();
            husky.run();
            husky.play();

            bulldog.bark();
            bulldog.run();
            bulldog.play();

            labrador.bark();
            labrador.run();
            labrador.play();


        }

    }






