package org.example;

public class CoffeeFactory {


    public static Instructions getCoffeeInstructions(String coffeName){
        if(coffeName == null) {
            return null;
        }
        if(coffeName.equalsIgnoreCase("Эспрессо")){
            return new EspressoInstructions();
        } else if(coffeName.equalsIgnoreCase("Латте")){
            return new LatteInstructions();
        }
        return null;
    }

}
