package edu.iu.habahram.coffeeorder;

import edu.iu.habahram.coffeeorder.model.*;
import org.junit.jupiter.api.Assertions;


/*
Costs

Dark Roast = 1.99
Decaf = 1.28
Espresso = 1.34
House Blend = 1.65

Mocha = 0.30
Milk = 0.40
Soy = 0.25
Whip = 0.25


 */

public class ModelTests {

    @org.junit.jupiter.api.Test
    public void testDarkRoast1(){
        DarkRoast darkRoast = new DarkRoast();

        Mocha mocha = new Mocha(darkRoast);

        Assertions.assertEquals(2.29, mocha.cost(),0.005);

    }

    @org.junit.jupiter.api.Test
    public void testDarkRoast2(){
        DarkRoast darkRoast = new DarkRoast();

        Milk milk = new Milk(darkRoast);

        Assertions.assertEquals(2.39, milk.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testDarkRoast3(){
        DarkRoast darkRoast = new DarkRoast();

        Soy soy = new Soy(darkRoast);

        Assertions.assertEquals(2.24, soy.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testDarkRoast4(){
        DarkRoast darkRoast = new DarkRoast();

        Whip whip = new Whip(darkRoast);

        Assertions.assertEquals(2.24, whip.cost(), 0.005);
    }


    @org.junit.jupiter.api.Test
    public void testDecaf1(){
        Decaf decaf = new Decaf();

        Mocha mocha = new Mocha(decaf);

        Assertions.assertEquals(1.58, mocha.cost(),0.005);

    }

    @org.junit.jupiter.api.Test
    public void testDecaf2(){
        Decaf decaf = new Decaf();

        Milk milk = new Milk(decaf);

        Assertions.assertEquals(1.68, milk.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testDecaf3(){
        Decaf decaf = new Decaf();

        Soy soy = new Soy(decaf);

        Assertions.assertEquals(1.53, soy.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testDecaf4(){
        Decaf decaf = new Decaf();

        Whip whip = new Whip(decaf);

        Assertions.assertEquals(1.53, whip.cost(), 0.005);
    }


    @org.junit.jupiter.api.Test
    public void testEspresso1(){
        Espresso espresso = new Espresso();

        Mocha mocha = new Mocha(espresso);

        Assertions.assertEquals(1.64, mocha.cost(),0.005);

    }

    @org.junit.jupiter.api.Test
    public void testEspresso2(){
        Espresso espresso = new Espresso();

        Milk milk = new Milk(espresso);

        Assertions.assertEquals(1.74, milk.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testEspresso3(){
        Espresso espresso = new Espresso();

        Soy soy = new Soy(espresso);

        Assertions.assertEquals(1.59, soy.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testEspresso4(){
        Espresso espresso = new Espresso();

        Whip whip = new Whip(espresso);

        Assertions.assertEquals(1.59, whip.cost(), 0.005);
    }


    @org.junit.jupiter.api.Test
    public void testHouseBlend1(){
        HouseBlend houseBlend = new HouseBlend();

        Mocha mocha = new Mocha(houseBlend);

        Assertions.assertEquals(1.95, mocha.cost(),0.005);

    }

    @org.junit.jupiter.api.Test
    public void testHouseBlend2(){
        HouseBlend houseBlend = new HouseBlend();

        Milk milk = new Milk(houseBlend);

        Assertions.assertEquals(2.05, milk.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testHouseBlend3(){
        HouseBlend houseBlend = new HouseBlend();

        Soy soy = new Soy(houseBlend);

        Assertions.assertEquals(1.90, soy.cost(),0.005);
    }

    @org.junit.jupiter.api.Test
    public void testHouseBlend4(){
        HouseBlend houseBlend = new HouseBlend();

        Whip whip = new Whip(houseBlend);

        Assertions.assertEquals(1.90, whip.cost(), 0.005);
    }



}
