package io.akeredolu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 5/5/16.
 */

public class Pets {

    private String name;
    private int number;
    private String type;

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public Pets(String newName){

        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){

        String speak = "I speak: ";

        return speak;
    }
}
