package org.example;

public class Session {
//    Both properties and methods contain access modifier (private, public, package-private[Default])
//    Private access modifier + Setters & Getters = Encapsulation.
//    properties
    private int x =5;
    private long y = 1L;
    private float z = 2.5f;
    private String name = "Ibrahim";
    private Human owner;

//    Methods
//    Each property should have at most only 1 getter and at least 1 setter.
//    All setters return void and take only 1 Argument.
    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
    public void setX(int x){
        this.x = x;
    }
//    All getters take no args and return the datatype of the property.
    public int getX(){
        return x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
