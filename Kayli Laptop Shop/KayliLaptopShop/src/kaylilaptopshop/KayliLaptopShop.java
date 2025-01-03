/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kaylilaptopshop;

/*
@author: Haqim Maths (https://github.com/HaqimMaths?tab=overview&from=2025-01-01&to=2025-01-02)
*/

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KayliLaptopShop extends Application {
  public static void console(){
    // Add 4 laptops
    LaptopData laptop1 = new LaptopData("Acer", "Predator Helios 20", 1024, 24);
    LaptopData laptop2 = new LaptopData("Acer", "Aspire 5", 512, 16);
    LaptopData laptop3 = new LaptopData("Acer", "Predator Helios 18", 1024, 20);
    LaptopData laptop4 = new LaptopData("Acer", "Predator Helios 16", 512, 12);
    // Display all laptops
    LaptopData.getAllLaptops();
    // Remove a laptop
    LaptopData.removeLaptop(3);
    // Display all laptops again...
    LaptopData.getAllLaptops();
  }
  public static void main(String[] args) {
    console();
  }
 
}
