package at.htlkaindorf;

import at.htlkaindorf.pojos.Beverage;
import at.htlkaindorf.pojos.Espresso;
import at.htlkaindorf.pojos.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}