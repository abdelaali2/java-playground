package org.example;

public class Main {

    public static void main(String[] args) {
//        Human ibrahim = new Human("ibrahim");
        Employee rania = new Employee();
        rania.sleep();
    }

    void myMethod() {
//        All the below are instances of the Human class.
        Human rania = new Human();
        Human mina  = new Human();
        Human bahader = new Human();

    }
//    Function  definition in Java:
//    <Return Datatype> functionName(args ... ){
//      method implementation
//    }

    String greeting() {
        return "Hello World";
    }

    int duplicate(int x) {
        return x * 2;
    }

    int multiplier(int x, int y){
        return x * y;
    }
}

