package org.example;

public class Organizer{

    Human human;
    Session session;

    public Human getNewHuman(String name){
        return new Human(name);
    }

    public Session getNewSession(){
        return new Session();
    }
}
