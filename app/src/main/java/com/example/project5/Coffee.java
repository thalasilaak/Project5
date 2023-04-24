package com.example.project5;

/**
 * Defines the properties of Coffee.
 *
 * @author Ishaan Keswani, Akhil Thalasila
 */
public class Coffee extends MenuItem {
    public String flavor;
    //flavors in use: 6 flavors yeast, 3 flavors for cake donuts, 3 flavors for donut holes
    // Strawberry, chocolate, banana, apple, blueberry, cherry
    //vanilla, neapolitan, tuna
    // glazed, pumpkin, cat
    public String[] addIns = new String[]{"French Vanilla", "Sweet Cream", "Caramel", "Mocha", "Irish Cream"};
    public String[] cFlavors = new String[]{"VANILLA", "NEAPOLITAN", "TUNA"};
    public String[] bFlavors = new String[]{"GLAZED", "PUMPKIN", "CAT"};
    public int cSize;
    public int[] addIn = new int[]{0,0,0,0,0};
    public final double SPRICE = 1.89;
    public final double sizeIncrease = 0.40;
    public final double APRICE = 0.30;

    // yeast, cake, donut holes
    public Coffee(){

    }

    /**
     * Initializes the coffee with a size and add ins.
     * @param cSize size of the coffee as an integer.
     * @param addIn add ins of the coffee as an integer.
     */
    public Coffee(int cSize, int[] addIn){
        this.cSize = cSize;
        this.addIn = addIn;
    }

    public int numAdd;

    /**
     * Sets the item price of the coffee.
     * @return returns the price of the coffee as a double.
     */
    public double itemPrice(){
        double res = SPRICE + sizeIncrease*this.cSize + APRICE * this.numAdd;
        res = Math.round(res*100.0)/100.0;
        return res;
    }

    /**
     * Sets the size of the coffee.
     * @param cSize size of the coffee to be set.
     */
    public void setcSize(int cSize){
        this.cSize = cSize;
    }

    /**
     * Sets any add ins for the coffee.
     * @param item items to be set as add ins for the coffee.
     */
    public void setAddIns(int[] item){
        this.addIn = item;
        int numAdds = 0;
        for(int i = 0; i < this.addIn.length; i++){
            if(this.addIn[i] == 1){
                numAdds += 1;
            }
        }
        this.numAdd = numAdds;
    }

    /**
     * Returns a string containing the add-ins of the coffee and its price.
     * @return the size, add-ins, and the price of the coffee as a String.
     */
    public String toString(){
        String res = "";
        String size = "";
        if(this.cSize == 0){
            size = "Short";
        } else if (this.cSize == 1){
            size = "Tall";
        } else if (this.cSize == 2){
            size = "Grande";
        } else {
            size = "Venti";
        }
        res += size +" Coffee with ";
        for(int i = 0; i < addIn.length; i++){
            if(addIn[i] == 1){
                res += addIns[i] + ", ";
            }
        }
        res +=  " Add-ons: " + this.itemPrice() + " Dollars\n";
        return res;
    }

    /**
     * Checks if two coffees are equal to each other.
     * @param coffee the coffee to be checked with.
     * @return true if the two coffees are the same, false otherwise.
     */
    public boolean equals(MenuItem coffee){
        Coffee coffees = (Coffee)coffee;
        if(this.cSize == (coffees.cSize)){
            if(this.addIn.equals(coffees.addIn)){
                return true;
            }
        }
        return false;
    }
}
