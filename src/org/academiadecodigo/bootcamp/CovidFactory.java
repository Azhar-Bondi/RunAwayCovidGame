package org.academiadecodigo.bootcamp;

public class CovidFactory {

    public ElementsOfCovid createElements(){

        double random = (double) Math.random();

        ElementsOfCovid elementsOfCovid;

        if (random < 0.8) {
            elementsOfCovid =new Virus();
        }
        else if (random >= 0.8 && random < 0.9){
            elementsOfCovid = new Mask();
        }
        else {
            elementsOfCovid = new Vaccine();

        }

       return elementsOfCovid;
    }






}
