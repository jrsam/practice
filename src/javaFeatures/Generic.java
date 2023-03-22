package javaFeatures;

public class Generic {

    class Animal {

    }
    class Cat extends Animal {

    }
    class Dog { //should extend Animal

    }
    class Cage<T extends Animal> {


    }
    public static <T> T returnType(T argument) {
        return argument;
    }
    public static void main(String[] args) {
//        Cage cat = new Cage<Cat>();
//        Cage dog = new Cage<Dog>();


        Integer inferredInteger = returnType(1);
        System.out.println(inferredInteger);
        String inferredString = returnType("String");
        System.out.println(inferredString);

    }
}
