import java.util.* ;
/**
 * Bus
 */
public class Bus extends Car{

    private String peoplenum ;
    private String doornum ;
    private String company ;

    Scanner scn = new Scanner(System.in) ;

public Bus()
{
    setBus() ;
}

public void setBus()
{
    // ----bus has been created----
    System.out.println("Bus : ") ;

    // ----peoplenum----
    System.out.println("Set PeopleNum : ") ;
    String newPeopleNum = scn.next() ;
    this.peoplenum = newPeopleNum ;

    // ----doornum----
    System.out.println() ;
    System.out.println("Set DoorNum : ") ;
    String newDoorNum = scn.next() ;
    this.doornum = newDoorNum ;

    // ----company----
    System.out.println() ;
    System.out.println("Set Company : ") ;
    String newCompany = scn.next() ;
    this.company = newCompany ;
}

public void showInfo()
{
    System.out.println() ;
    System.out.println("Bus : ") ;
    System.out.println("Bus Color is : " + color) ;
    System.out.println("Bus Capacicy is : " + capacicy) ;
    System.out.println("Bus PowerType is : " + powertype) ;
    System.out.println("Bus Year is : " + year) ;
    System.out.println("Bus Weight is : " + weight) ;
    System.out.println("Bus Displacement is : " + displacement) ;
    System.out.println("Bus PeopleNum is : " + peoplenum) ;
    System.out.println("Bus DoorNum is : " + doornum) ;
    System.out.println("Bus Company is : " + company) ;
 }

}
