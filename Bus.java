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
        super() ;
        setBus() ;
    }
    
    public void setBus()
    {
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

    // ----get proplenum----
    public String getPeopleNum()
    {
        return this.peoplenum ;
    }

    // ----get doornum----
    public String getDoorNum()
    {
        return this.doornum ;
    }

    // ----get company----
    public String getCompany()
    {
        return this.company ;
    }

    public String showInfo()
    {
        return " Bus Color is : " + this.getColor() + "\n Bus Capacicy is : " + this.getCapacicy() 
        + "\n Bus PowerType is : " + this.getPowerType() +  "\n Bus Year is : " + this.getYear() 
        + "\n Bus Weight is : " + this.getWeight() +  "\n Bus Displacement is : " + this.getDisplacement() 
        + "\n Bus PeopleNum is : " + this.getPeopleNum() + "\n Bus DoorNum is : " + this.getDoorNum() 
        + "\n Bus Company is : " + this.getCompany() + "\n" ;
    }
}
     

