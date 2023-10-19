/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.bus_reservation_system;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author janan
 */
public class booking {
   private String passengername;
   private  int Busno;
    Date date;
    booking() throws ParseException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the passenger name:");
     this.passengername=sc.nextLine();
     System.out.println("Enter the bus number:");            
     this.Busno=sc.nextInt();
     System.out.println("Enter the date :");
    String date1=sc.next();
    SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
   this.date=dateformat.parse(date1);
    }
    public String get_passengername(){
    return passengername;}
    public int get_Busno(){
    return Busno;}
    public Date get_date(){
    return date;}
    public void set_passengername(String passengername){
    this.passengername=passengername;
    }
    public void set_busno(int busno){
    this.Busno=busno;}
    public void set_date(Date date){
    this.date=date;}
     public boolean isavailable(ArrayList<booking> bookings, ArrayList<bus> buslist){
        int capacity=0;
         for(bus b:buslist){
        if(b.get_busno()==Busno){
         capacity=b.get_capacity();
        }
        }
        int count=0;
        for(booking bo:bookings){
        if(bo.get_Busno()==Busno&&bo.date.equals(date)){
        count++;
        }
        }
        if(count<capacity){
        return true;
        }
        else{
        return false;}
        }
       public void display_details(){
        System.out.println("The bus no is:"+Busno);
         System.out.println("The passenger name is:"+passengername);
         System.out.println("The booked date is"+date);
        System.out.println();}
       public static void display_details_using_busno(int busnumber, ArrayList<booking> bookings){
       for(booking b:bookings){
       if(b.Busno==busnumber){
       System.out.println("Bus no:"+b.Busno);
      System.out.println("passengername: "+b.passengername);
      System.out.println("Date of booking: "+b.date);
      System.out.println();
       }
       }
       }
     
}
