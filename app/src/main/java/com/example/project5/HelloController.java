//package com.example.project5;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Label;
//import javafx.stage.Stage;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.io.IOException;
//
///**
// * Controller for MainView fxml file.
// *
// * @author Ishaan Keswani, Akhil Thalasila
// */
//public class HelloController {
//    setContentView(R.layout.activity_main);
//    private Label welcomeText;
//    private Stage stage;
//    private Parent root;
//
//    static int size;
//    protected static Order[] orderList = new Order[]{};
//
//    public static Order curOrder = new Order();
//
//    /**
//     * Grows the array of orders.
//     */
//    protected static void orderGrow(){
//        Order[] newProf = new Order[orderList.length + 4];
//        for (int i = 0; i < size; i++) {
//            newProf[i] = orderList[i];
//        }
//        orderList = newProf;
//    }
//
//    /**
//     * Adds an order to the list of orders.
//     * @param order order to be added to the list of orders.
//     */
//    protected static void orderAdd(Order order){
//        if (size == orderList.length) {
//            orderGrow();
//        }
//            orderList[size] = order;
//            size += 1;
//    }
//
//    /**
//     * Removes an order from the list of orders.
//     * @param pos position of the order to be removed from the list of orders.
//     */
//    protected static void orderRemove(int pos){
//        for (int i = pos; i < size - 1; i++) {
//            orderList[i] = orderList[i + 1];
//        }
//        size -= 1;
//    }
//
//    /**
//     * Gets the order list as a String.
//     * @return the order list as a String.
//     */
//    protected String getOrderListString(){
//        String res = "";
//        for(int i = 0; i < size; i++){
//            res += i +": "+ orderList[i].generateOrder() + " \n";
//        }
//        return res;
//    }
//
//    /**
//     * Get method for orderList.
//     * @return gets the order list as an orderList.
//     */
//    protected static Order[] getOrderList(){
//        return orderList;
//    }
//
//    /**
//     * Sets the order list as the current orderList.
//     * @param orderList the orderList to be set.
//     */
//    protected void setOrderList(Order[] orderList){
//        this.orderList = orderList;
//    }
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//    protected void switchDonut(ActionEvent event) throws IOException{
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        stage.setTitle("hi how's it going");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    /**
//     * The response from pressing the Order Coffee button.
//     * @param event the action required to trigger the event.
//     */
//    @FXML
//    void callOrderCoffee(ActionEvent event) {
//
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("CoffeeView.fxml"));
//            Parent root1 = loader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Order Coffee");
//            stage.setScene(new Scene(root1));
//            stage.show();
//        }
//
//        catch(Exception e) {
//            e.printStackTrace();
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setContentText("Cannot open Order Coffee");
//            alert.showAndWait();
//            return;
//        }
//    }
//
//    /**
//     * The response from pressing the Order Donuts button.
//     * @param event the action required to trigger the event.
//     */
//    @FXML
//    void callOrderDonuts(ActionEvent event) {
//
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("DonutView.fxml"));
//            Parent root2 = loader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Order Donuts");
//            stage.setScene(new Scene(root2));
//            stage.show();
//        }
//
//        catch(Exception e) {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setContentText("Cannot open Order Donuts.");
//            alert.showAndWait();
//            return;
//        }
//    }
//
//    /**
//     * The response from pressing the Store Order button.
//     * @param event the action required to trigger the event.
//     */
//    @FXML
//    void callStoreOrder(ActionEvent event) {
//
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("StoreOrderView.fxml"));
//            Parent root3 = loader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Store Order");
//            stage.setScene(new Scene(root3));
//            stage.show();
//        }
//
//        catch(Exception e) {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setContentText("Cannot open Store Order.");
//            alert.showAndWait();
//            return;
//        }
//    }
//
//    /**
//     * The response from pressing the Your Order button.
//     * @param event the action required to trigger the event.
//     */
//    @FXML
//    void callYourOrder(ActionEvent event) {
//
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderView.fxml"));
//            Parent root3 = loader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Your Order");
//            stage.setScene(new Scene(root3));
//            stage.show();
//        }
//
//        catch(Exception e) {
//            e.printStackTrace();
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setContentText("Cannot open Your Order.");
//            alert.showAndWait();
//            return;
//        }
//    }
//}