package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

public class DonutView extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView myImgView = (ImageView) findViewById(R.id.DonutImg);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_view);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

/**

 @FXML ComboBox donutType;
 @FXML ComboBox donutsQuantity;
 @FXML ListView selectDonutFlavor;
 @FXML ListView finalDonut;
 @FXML Button removeDonuts;
 @FXML Button addDonuts;
 @FXML TextArea subTotalDonuts;
 @FXML ImageView donutsImage;

 Donut curDonut = new Donut();
 int quantity = 1;
 double subTotal;


 @Override public void initialize(URL url, ResourceBundle resourceBundle) {
 addDonuts.setDisable(true);
 donutsQuantity.getSelectionModel().select(0);
 subTotal=0;
 finalDonut.getItems().clear();
 for(int i = 0; i < HelloController.curOrder.size; i++){
 if(HelloController.curOrder.menu[i] instanceof Donut){
 String res = i + ". "+ HelloController.curOrder.menu[i].toString();
 finalDonut.getItems().add(i + ". " +HelloController.curOrder.menu[i].toString());
 }
 }
 }


 public void enable(){
 selectDonutFlavor.getItems().clear();
 String bTypes = donutType.getSelectedItem().toString();
 if(bTypes.equals("Yeast Donut")){
 for(int i = 0; i < Donut.yFlavors.length; i++){
 selectDonutFlavor.getItems().add(Donut.yFlavors[i]);
 Image img = new Image(new File("src/main/resources/Images/yeast.jpg").toURI().toString());
 donutsImage.setImage(img);
 }
 selectDonutFlavor.getSelectionModel().select(0);

 } else if (bTypes.equals("Cake Donut")){
 for(int i = 0; i < Donut.cFlavors.length; i++){
 selectDonutFlavor.getItems().add(Donut.cFlavors[i]);
 Image img = new Image(new File("src/main/resources/Images/cake.jpg").toURI().toString());
 donutsImage.setImage(img);
 }
 selectDonutFlavor.getSelectionModel().select(0);
 } else {
 for(int i = 0; i < Donut.bFlavors.length; i++){
 selectDonutFlavor.getItems().add(Donut.bFlavors[i]);
 Image img = new Image(new File("src/main/resources/Images/holes.jpeg").toURI().toString());
 donutsImage.setImage(img);
 }
 selectDonutFlavor.getSelectionModel().select(0);
 }
 curDonut.setbType(bTypes);
 addDonuts.setDisable(false);
 updateVals();
 }


 @FXML public void removeDonut(){
 int pos = finalDonut.getSelectionModel().getSelectedIndex();
 String stuff = finalDonut.getSelectionModel().getSelectedItem().toString();
 stuff = stuff.substring(0,1);
 int position = Integer.parseInt(stuff);
 finalDonut.getItems().remove(pos);
 HelloController.curOrder.remove(position);
 subTotalDonuts.setText("");
 finalDonut.getItems().clear();
 for(int i = 0; i < HelloController.curOrder.size; i++){
 if(HelloController.curOrder.menu[i] instanceof Donut){
 String res = i + ". "+ HelloController.curOrder.menu[i].toString();
 finalDonut.getItems().add(i + ". " +HelloController.curOrder.menu[i].toString());
 }
 }
 }


 @FXML public void finPrice(){
 if(finalDonut.getSelectionModel().getSelectedItem() != null){
 String stuff = finalDonut.getSelectionModel().getSelectedItem().toString();
 stuff = stuff.substring(0,1);
 int pos = Integer.parseInt(stuff);
 subTotalDonuts.setText(String.valueOf(HelloController.curOrder.menu[pos].itemPrice()));
 } else {
 return;
 }
 }

 @FXML public void initPrice(){
 if(selectDonutFlavor.getSelectionModel().getSelectedItem() != null){
 updateVals();
 } else {
 return;
 }
 }


 @FXML public void updateVals(){
 String bTypes = donutType.getSelectionModel().getSelectedItem().toString();
 String quantity = donutsQuantity.getSelectionModel().getSelectedItem().toString();
 String flavo = selectDonutFlavor.getSelectionModel().getSelectedItem().toString();
 int quant = Integer.parseInt(quantity);
 curDonut.setbType(bTypes);
 curDonut.setFlavor(flavo);
 double price = curDonut.itemPrice();
 price *= quant;
 price = Math.round(price*100.0)/100.0;
 subTotalDonuts.setText(String.valueOf(price));
 }

 @FXML public void addDonut(){
 updateVals();
 String quantity = donutsQuantity.getSelectionModel().getSelectedItem().toString();
 int quant = Integer.parseInt(quantity);
 String res = "";
 for(int i = 0; i < quant; i++){
 HelloController.curOrder.add(curDonut);
 res += curDonut.toString();
 }
 double price = curDonut.itemPrice();
 price *= quant;
 price = Math.round(price*100.0)/100.0;
 subTotal += price;
 price = 0;
 subTotalDonuts.setText("Successful Submission!");
 //selectDonutFlavor.getItems().clear();
 curDonut = new Donut();
 finalDonut.getItems().clear();
 for(int i = 0; i < HelloController.curOrder.size; i++){
 if(HelloController.curOrder.menu[i] instanceof Donut){
 finalDonut.getItems().add(i + ". " +HelloController.curOrder.menu[i].toString());
 }
 }

 }
 */
}
