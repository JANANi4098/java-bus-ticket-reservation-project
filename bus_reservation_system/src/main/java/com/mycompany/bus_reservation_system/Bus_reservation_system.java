/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bus_reservation_system;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author janan
 */
public class Bus_reservation_system {
    public static void main(String[] args) throws ParseException {
       ArrayList<bus> buslist=new ArrayList<>(); 
  ArrayList<booking> bookings=new ArrayList<>();
       buslist.add(new bus(1,true,45));
  buslist.add(new bus(2,false,54));
    buslist.add(new bus(3,true,60));
    buslist.add(new bus(4,false,44));
    buslist.add(new bus(5,true,87));
  buslist.add(new bus(6,true,86));
  buslist.add(new bus(7,false,57));
    buslist.add(new bus(8,true,78));
    buslist.add(new bus(9,false,45));
    buslist.add(new bus(10,true,45));
    Scanner sc=new Scanner(System.in);
    int user=1;
    while(user==1){
    System.out.println("Enter 1 for booking. Enter 2 for exit");
    user=sc.nextInt ();
    if(user==1){
    System.out.println("Click 1 for new booking, Click 2 for deleting, Click 3 for cancellation.Click 4 for checking details");
   int choice=sc.nextInt();
   switch(choice){
       case 1:
    booking book=new booking();
    if(book.isavailable(bookings,buslist)){
    bookings.add(book);
    }
    else{
    System.out.println("The bus has full capacity. Try booking another bus");}  
   break;
       case 2:
           System.out.println("Enter the bus number:");
           int busnumber=sc.nextInt();
           System.out.println("Enter the detail to be updated in the format -property:new value");
   String detail=sc.nextLine();
   String[] details=detail.split(":");
   if(details[0].equals("busno")){
   System.out.println("Sorry, you cant change the bus number");}
   for(booking b:bookings){
       if(details[0].equals("passengername")){
   if(b.get_Busno()==busnumber){
   b.set_passengername(details[1]);
   }
   }
      if(details[0].equals("date")){
       if(b.get_Busno()==busnumber){
            SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
   b.set_date(dateformat.parse(details[1]));
   }    
   }  
   }
   break;
       case 3:
           System.out.println("Enter the bus seat number you want to cancel:");
           int seat=sc.nextInt();
           for(booking b:bookings){
           if(b.get_Busno()==seat){
          bookings.remove(b);
           }
           }
           break;
       case 4:
           System.out.println(" Enter \n1- Get all bus details \n2-Get all the bookings details \n3-Get booking details using bus number \b4.Get booking details using bus number and date");
   int info=sc.nextInt();
      switch(info){
       case 1:
   for(bus b:buslist){
    b.display_details();
    }
   break;
       case 2:
   info=sc.nextInt();
   
     for(booking  b:bookings){
    b.display_details();
    }
   break;
   case 3:
       System.out.println("Enter the bus number");
        busnumber=sc.nextInt();
           booking.display_details_using_busno(busnumber, bookings);
   break;
   default:
       System.out.println("Invalid choice so exiited");
      }
       
   }   
   }   
    }
    }
}
