/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bus_reservation_system;
import java.util.AbstractList;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
/**
 *
 * @author janan
 */
public class bus {
    private int busno;
    private boolean ac;
    private int capacity;
    bus(int busno,boolean ac,int capacity){
    this.busno=busno;
    this.ac=ac;
    this.capacity=capacity;
    }
    public int get_busno(){
    return busno;
    }
    public boolean get_ac(){
    return ac;
    }
    public int get_capacity(){
    return capacity;
    }
    public void set_ac(boolean ac){
    this.ac=ac;}
        public void set_capacity(int capacity){
    this.capacity=capacity;}
        public void display_details(){
        System.out.println("The bus no is:"+busno);
         System.out.println("The bus has ac :"+ac);
         System.out.println("The bus capcity is:"+capacity);
        System.out.println();}
       
} 
