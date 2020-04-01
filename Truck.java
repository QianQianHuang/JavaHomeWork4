/**
 * Truck
 */
import java.util.* ;
 public class Truck extends Car{
 
   private String goodcapacicy ;
   private String tairnum ;

   Scanner scn = new Scanner(System.in) ;

   public Truck()
   {
     setTruck() ;
   }

   public void setTruck()
   {
      
   // ----goodcapacicy----
      System.out.println() ;
      System.out.println("Set GoodCapacicy : ") ;
      String newGoodCapacicy = scn.next() ;
      this.goodcapacicy = newGoodCapacicy ;

      // ----tairnum----
      System.out.println() ;
      System.out.println("Set TairNum : ") ;
      String newTairNum = scn.next() ;
      this.tairnum = newTairNum ;
   } 

   // ----get GoodCapacicy----
   public String getGoodCapacicy()
   {
      return this.goodcapacicy ;
   }

   // ----getTairNum----
   public String getTairNum()
   {
      return this.tairnum ;
   }

   public String showInfo()
   {
      return " Truck Color is : " + this.getColor() + "\n Truck Capacicy is : " + this.getCapacicy() 
      + "\n Truck PowerType is : " + this.getPowerType() +  "\n Truck Year is : " + this.getYear() 
      + "\n Truck Weight is : " + this.getWeight() +  "\n Truck Displacement is : " + this.getDisplacement() 
      + "\n Truck GoodCapacicy is : " + this.getGoodCapacicy() + "\n Truck TairNum is : " + this.getTairNum() 
      + "\n" ;
      
   }
   
}