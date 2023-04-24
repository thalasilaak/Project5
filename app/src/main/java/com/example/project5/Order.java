package com.example.project5;


/**
 * Defines the order function for the project.
 *
 * @author Ishaan Keswani, Akhil Thalasila
 */
public class Order {
    MenuItem[] menu;
    int OrderNumber;
    int size;
    double price;

    public Order(){
        this.menu = new MenuItem[1];
        this.OrderNumber = 0;
    }

    /**
     * Sets the order number.
     * @param OrderNumber the order number to be set.
     */
    public Order(int OrderNumber){
        super();
        this.OrderNumber = OrderNumber;
    }

    /**
     * Adds an item to the menu with a given parameter.
     * @param item the item to be added.
     * @return true if successfully added, false otherwise.
     */
    public boolean add(MenuItem item){
        if(this.size == this.menu.length){
            grow();
        }
        this.menu[size] = item;
        this.size += 1;
        return true;
    }

    /**
     * Removes an item using its position.
     * @param pos the position of the item to be removed.
     * @return true if successfully removed, false otherwise.
     */
    public boolean remove(int pos){
        for (int i = pos; i < this.size - 1; i++) {
            this.menu[i] = this.menu[i + 1];
        }
        this.size -= 1;
        return true;
    }

    /**
     * Removes an item from the menu.
     * @param menu the item to be removed.
     * @return true if successful, false otherwise.
     */
    public boolean remove(MenuItem menu){
        int pos = find(menu);
        for (int i = pos; i < this.size - 1; i++) {
            this.menu[i] = this.menu[i + 1];
        }
        this.size -= 1;
        return true;
    }

    /**
     * Finds an item from the menu.
     * @param student given parameter to search for.
     * @return the place of the item in the menu.
     */
    private int find(MenuItem student) {
        for (int i = 0; i < this.size; i++) {
            if (this.menu[i].equals(student)) {
                return i;
            }
        }
        // search given student in roster
        return -1;
    }

    private void grow() {
        // grow main array by 4
        MenuItem[] newOrd = new MenuItem[this.menu.length + 4];
        for (int i = 0; i < this.size; i++) {
            newOrd[i] = this.menu[i];
        }
        this.menu = newOrd;
        // make a new array with a size greater by 4 and add everything to it (O(n))
    }

    /**
     * Sets the price of the order.
     * @param price the price as a double.
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * Generates the order.
     * @return a String with the orders.
     */
    public String generateOrder(){
        String res = "";
        if(this.size == 0){
            System.out.println("No stuff in here");
            return "";
        }
        for(int i = 0; i < this.size; i++){
            res += menu[i].toString();
        }
        return res;
    }
}
