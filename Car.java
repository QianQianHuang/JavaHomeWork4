/**
 * Car
 */
import java.util.* ;
 public abstract class Car {
    public String color ;
    public String capacicy ;
    public String powertype;
    public String year ;
    public int weight ;
    public int displacement ;
    public static int counts = 0 ;
    Scanner scn = new Scanner(System.in) ;

 public Car()
 {
    setCar() ;
    counts ++ ;
 }

 public void setCar()
 {
    // ----car has been created----
     System.out.println("Car Has Been Created : ") ;
    
      if(counts == 0)
     {
        System.out.println() ;
        System.out.println("The Car Obj is : Truck") ;
     }
     else if(counts == 1)
     {
        System.out.println() ;
        System.out.println("The Car Obj is : Bus") ;
     }
     else if(counts == 2)
     {
        System.out.println() ;
        System.out.println("The Car Obj is : Sedan") ;
     }

    // ----color----
    System.out.println() ;
    System.out.println("Set Color : ") ;
    String newColor = scn.next() ;
    this.color = newColor ;
    
    // ----capacicy----
    System.out.println() ;
    System.out.println("Set Capacicy : ") ;
    String newCapacicy = scn.next() ;
    this.capacicy = newCapacicy ;
    // ----powertype----
    System.out.println() ;
    System.out.println("Set PowerType : ") ;
    String newPowerType = scn.next() ;
    this.powertype = newPowerType ;
    // ----year----
    System.out.println() ;
    System.out.println("Set Year : ") ;
    String newYear = scn.next() ;
    this.year = newYear ;
    // ----weight----
    System.out.println() ;
    System.out.println("Set Weight : ") ;
    int newWeight = scn.nextInt() ;
    this.weight = newWeight ;
    // ----displacement----
    System.out.println() ;
    System.out.println("Set Displacement : ") ;
    int newDisplacement = scn.nextInt() ;
    this.displacement = newDisplacement ;
 }


}