package com.example.project5;


/**
 * Defines the properties of Donuts.
 *
 * @author Ishaan Keswani, Akhil Thalasila
 */
public class Donut extends MenuItem{
    public String flavor;
    //flavors in use: 6 flavors yeast, 3 flavors for cake donuts, 3 flavors for donut holes
    // Strawberry, chocolate, banana, apple, blueberry, cherry
    //vanilla, neapolitan, tuna
    // glazed, pumpkin, cat
    public static String[] yFlavors = new String[]{"PLAIN", "CHOCOLATE", "BANANA", "APPLE", "BLUEBERRY", "CHERRY"};
    public static String[] cFlavors = new String[]{"PLAIN", "NEAPOLITAN", "TUNA"};
    public static String[] bFlavors = new String[]{"PLAIN", "PUMPKIN", "GLAZED"};
    public String bType;
    public final double YPRICE = 1.59;
    public final double CPRICE = 1.79;
    public final double DPRICE = 0.39;
    // yeast, cake, donut holes
    public Donut(){

    }

    /**
     * Initializes a Donut with flavor and type of donut.
     * @param flavor the flavor of the donut as a String.
     * @param bType the type of the donut as a String.
     */
    public Donut(String flavor, String bType){
        this.flavor = flavor;
        this.bType = bType;
    }

    /**
     * Sets the flavor of the donut.
     * @param flavor the flavor of the donut as a String.
     */
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    /**
     * Sets the type of the donut
     * @param bType the type of the donut as a String.
     */
    public void setbType(String bType){
        this.bType = bType;
    }

    /**
     * Sets the item price of the donut based on the item selected.
     * @return the price of the item as a double.
     */
    public double itemPrice(){
        if(this.bType.equals("Cake Donut")){
            return CPRICE;
        } else if(this.bType.equals("Donut Hole")){
            return DPRICE;
        } else {
            return YPRICE;
        }
    }

    /**
     * Returns the donut as a string that contains the flavor, type, and item price.
     * @return the flavor, type, and item price of the donut as a String.
     */
    public String toString(){
        String res = "";
        res += this.flavor +" "+ this.bType + ": " + this.itemPrice() + "\n";
        return res;
    }

    /**
     * Checks to see if a donut is equal to a given donut.
     * @param donut the donut to be checked with the menu.
     * @return true if the donut type and flavor matches, false otherwise.
     */
    public boolean equals(MenuItem donut){
        Donut donuts = (Donut)donut;
        if(this.bType.equals(donuts.bType)){
            if(this.flavor.equals(donuts.flavor)){
                return true;
            }
        }
        return false;
    }
}
