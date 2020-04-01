import java.util.* ;
/**
 * Sedan
 */
public class Sedan extends Car{

    private String peoplenum ;
    private String type ;
    private String use ;

    Scanner scn = new Scanner(System.in) ;

    public Sedan()
    {
        super() ;
        setSedan() ;
    }

    public void setSedan()
    {
        // ----peoplenum----
        System.out.println("Set PeopleNum : ") ;
        String newPeopleNum = scn.next() ;
        this.peoplenum = newPeopleNum ;

        // ----type----
        System.out.println() ;
        System.out.println("Set Type : ") ;
        String newType = scn.next() ;
        this.type = newType ;

        // ----use----
        System.out.println() ;
        System.out.println("Set Use : ") ;
        String newUse = scn.next() ;
        this.use = newUse ;
    }

    // ----get peoplenum----
    public String getPeopleNum()
    {
        return this.peoplenum ;
    }

    // ----get type----
    public String getType()
    {
        return this.type ;
    }

    // ----get use----
    public String getUse()
    {
        return this.use ;
    }

    public String showInfo()
    {
        return " Sedan Color is : " + this.getColor() + "\n Sedan Capacicy is : " + this.getCapacicy() 
        + "\n Sedan PowerType is : " + this.getPowerType() +  "\n Sedan Year is : " + this.getYear() 
        + "\n Sedan Weight is : " + this.getWeight() +  "\n Sedan Displacement is : " + this.getDisplacement() 
        + "\n Sedan PeopleNum is : " + this.getPeopleNum() + "\n Sedan Type is : " + this.getType() 
        + "\n Sedan Use is : " + this.getUse() + "\n" ;
    }
}