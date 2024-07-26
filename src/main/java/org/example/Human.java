package org.example;

public class Human {

//    Constructor method is the method with the name of the class.
//    Constructor method id the first method to be called when creating a new instance of the class.
//    Constructor method by default is empty
    Human(){}
//    Overloading = multiple methods with different method signatures
//    Method Signature = args (datatype, order)


//    Overloaded constructors
    Human(
            String name,
            int age,
            Gender gender,
            Country country
    ) {
        System.out.println("creating new instance of Human");
        setName(name);
        setAge(age);
        setGender(gender);
        setCountry(country);
    }
    Human(String name){
        System.out.println("Hello " + name);
    }
    Human(
            int age,
            String name,
            Gender gender,
            Country country
    ) {
        System.out.println("creating new instance of Human");
        setName(name);
        setAge(age);
        setGender(gender);
        setCountry(country);
    }


    private String name;
    private int age;
    private Gender gender;
    private Country country;

    //    No one outside this class will know anything about this secret.
    private String secret = "1234";

    private void printSecret() {
        System.out.println(secret);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    void eat(String food) {
        System.out.println("Eat food: " + food);
    }

    void sleep() {
        System.out.println("Sleeping for 12 hours");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Employee extends Human {
//    Overriding can't exist without inheritance.
    @Override
    void sleep(){
        System.out.println("Sleeping for 3 hours");
    }

//    Overloading
    void sleep(int hours) {
        System.out.println("Sleeping for " + hours + " hours");
    }
}
// public & class together means a new file.
// Polymorphism = Overloading & Overriding.
