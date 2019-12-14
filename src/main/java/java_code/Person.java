package java_code;

import sun.rmi.server.Activation;

public class Person {
    private int age;
    private String firstName;
    String jobTitle;
    String address;
    String city;

    public Person(int age) {
        this.age=age;


    }

    public static void main(String[] args) {
        String name= "Maral";
        System.out.println(name);
    }
}
