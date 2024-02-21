package edu.iu.habahram.coffeeorder.model;

public record Receipt(String description, float cost) {
    static int ID;

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Receipt.ID = ID;
    }


}
