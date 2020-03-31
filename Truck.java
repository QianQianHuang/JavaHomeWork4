/**
 * Truck
 */
import java.util.* ;
 public class Truck extends Car{
 
 private String goodcapacicy ;
 private String tairnum ;
//  public static int counts = 0 ;
 Scanner scn = new Scanner(System.in) ;

 public Truck()
 {
     setTruck() ;
     
     //counts ++ ;
 }

 public void setTruck()
 {
    //  ----truck has been created----
    System.out.println("Truck : ") ;

    // ----goodcapacicy----
    System.out.println() ;
    System.out.println("Set GoodCapacicy : ") ;
    String newGoodCapacicy = scn.next() ;
    this.capacicy = newGoodCapacicy ;

    // ----tairnum----
    System.out.println() ;
    System.out.println("Set TairNum : ") ;
    String newTairNum = scn.next() ;
    this.tairnum = newTairNum ;
 }

 public void showInfo()
 {
    System.out.println() ;
    System.out.println("Truck : ") ;
    System.out.println("Truck Color is : " + color) ;
    System.out.println("Truck Capacicy is : " + capacicy) ;
    System.out.println("Truck PowerType is : " + powertype) ;
    System.out.println("Truck Year is : " + year) ;
    System.out.println("Truck Weight is : " + weight) ;
    System.out.println("Truck Displacement is : " + displacement) ;
    System.out.println("Truck GoodCapacicy is : " + goodcapacicy) ;
    System.out.println("Truck TairNum is : " + tairnum) ;
 }
    
}