package hws.example.e197;

public class Dog {

        String name;
        String breed;
        int age;


        public Dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
    }
}

