package org.example;

public class Program {

//    Property
    Organizer organizer;

//  Dependency Injection. => there are 3 types of DI

//  Constructor D.I.
    Program(Organizer organizer){
        this.organizer = organizer;
    }

    void runProgram() {

//        Heavy coupling between Program, Human & Session classes

//        Instances Creation step
        Human ibrahim = organizer.getNewHuman("ibrahim");
        Session session = organizer.getNewSession();
//        Business Logic Stop
        session.setOwner(ibrahim);

//        Instances Creation step
        Human rania = organizer.getNewHuman("rania");
        Session session2 = organizer.getNewSession();
//        Business Logic Stop
        session2.setOwner(rania);
    }

}

class Runner{

//    After moving instance creation step to Organizer class,
//    Program, Session & Human are now loosely coupled.

    public static void main(String[] args) {
        new Program(new Organizer()).runProgram();
    }
}

// Spring framework basically focuses on DI & Coupling between classes.
// to create Web Applications

// Spring boot is a framework built on top of the Spring framework
// Introduces less boilerplate code & less complex development experience.
// Annotations are what made this transformation easier.

// SpringMVC:
/*
* M => Model: is what maps database tables
* V => View: is the webpage displaying the data (webpage technologies built using java [Servlet, Java Server Pages (JSP)])
* C => Controller: is what connects the model to the view (provides API routes).
*
* */

/*
* Spring Boot:
*   Database => Model Layer (Entity)
*   Service Layer (Business Logic)
*   Controller Layer (API Routes) => User
* */
