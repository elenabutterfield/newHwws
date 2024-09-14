package hws.example.e142;

import org.w3c.dom.ls.LSOutput;

public class E142Constructor {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public E142Constructor() {
        this.schoolName = null;
        this.batch = 0;
        this.year = 0;
        this.lastDayOfClass = null;
    }

    public E142Constructor(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    public void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }


    public static void main(String[] args) {
        E142Constructor obj1=new E142Constructor();
        obj1.display();

        E142Constructor obj2=new E142Constructor("Syntax",6,2024,"December 15");
        obj2.display();

    }
}

