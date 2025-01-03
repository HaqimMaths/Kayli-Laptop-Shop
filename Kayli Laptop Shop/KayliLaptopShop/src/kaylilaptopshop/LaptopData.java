/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaylilaptopshop;

/*
@author: Haqim Maths (https://github.com/HaqimMaths?tab=overview&from=2025-01-01&to=2025-01-02)
*/

import java.util.ArrayList;
import java.util.Arrays;

public class LaptopData {
 // Attributes
 private int ID;
 private String brand;
 private String model;
 private int storageSize;
 private int ramSize;
 private static int nextId = 1;
 private static ArrayList<LaptopData> listOfLaptops = new ArrayList<>();
 // Constructors
 public LaptopData(String newBrand, String newModel, int newStorageSize, int newRamSize){
  this.ID = nextId++;
  this.brand = newBrand;
  this.model = newModel;
  this.storageSize = newStorageSize;
  this.ramSize = newRamSize;
  listOfLaptops.add(this);
 }
 public LaptopData(){
  this("ANONYMOUS", "ANONYMOUS", -1, -1);
 }
 // Setters
 public void setId(int newId){
   for(LaptopData laptop : listOfLaptops){
     if(laptop.getId() == newId){
       System.out.println("ID already existed!");
     } else {
       this.ID = newId;
     }
   }
 }
 public void setBrand(String newBrand){
  this.brand = newBrand;
 }
 public void setModel(String newModel){
  this.model = newModel;
 }
 public void setStorageSize(int newStorageSize){
  this.storageSize = newStorageSize;
 }
 public void setRamSize(int newRamSize){
  this.ramSize = newRamSize;
 }
 // Getters
 public int getId(){
   return this.ID;
 }
 public String getBrand(){
  return this.brand;
 }
 public String getModel(){
  return this.model;
 }
 public int getStorageSize(){
  return this.storageSize;
 }
 public int getRamSize() {
  return this.ramSize;
 }
 // Get detail
 @Override
 public String toString(){
  return "ID: " + this.getId() + " | Brand: " + this.getBrand() + " | Model: " + this.getModel() + " | Storage Size: " + this.getStorageSize() + " | RAM Size: " + this.getRamSize() + "\n";
 }
 // Add laptop
 public static void addLaptop(String newBrand, String newModel, int newStorageSize, int newRamSize){
  listOfLaptops.add(new LaptopData(newBrand, newModel, newStorageSize, newRamSize));
 }
 public static void addLaptop(){
  listOfLaptops.add(new LaptopData());
 }
 // Remove laptop
 public static void removeLaptop(int findId){
   listOfLaptops.removeIf(laptop -> laptop.ID == findId);
 }
 // Get all laptops
 public static void getAllLaptops(){
   System.out.print("-".repeat(30));
   System.out.println();
   for(LaptopData laptop : listOfLaptops){
    System.out.println(laptop);
   }
   System.out.print("-".repeat(30));
   System.out.println();
 }
}



