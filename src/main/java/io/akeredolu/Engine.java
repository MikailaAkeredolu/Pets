package io.akeredolu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 5/7/16.
 */
public class Engine {

    int numberOfPets;
    String typeOfPets;
    String petNames;

    Scanner input = new Scanner(System.in);


    public void askForNumberOfPets(){
        System.out.println("How many pets do you have? ");
        String temp = input.nextLine();
        numberOfPets = Integer.parseInt(temp);
    }

    public void askForTypeOfPets(){
        System.out.println("What type of pets do you have ? ");
        typeOfPets = input.nextLine();
    }

    public void getNameOfPets(){
        System.out.println("What are your pet names? ");
        petNames = input.nextLine();
    }

    Pets myPets = new Pets("mike");


    public void run() {

        ArrayList<Pets> myList = new ArrayList<>();

        askForNumberOfPets();

        for (int x = 0; x < numberOfPets; x++) {

            getNameOfPets();
            askForTypeOfPets();

            String theTypeOfPet = typeOfPets;
            String nameOfPet = petNames;

            switch(theTypeOfPet){

                case "cat":
                    myList.add( new Cat(nameOfPet));
                    myPets.speak();
                    break;

                case "dog":
                    myList.add(new Dog(nameOfPet));
                    myPets.speak();
                    break;

                case "monkey":
                    myList.add(new Monkey(nameOfPet));
                    myPets.speak();

                 default:
                     System.out.println("No such animal exist in on this planet!!!");
            }


        }

       for(int x = 0; x < myList.size(); x++){
           System.out.println(myList.get(x).getName() + " " + myList.get(x).speak());
          // System.out.println(myList.get(x).speak());
       }
    }


}
