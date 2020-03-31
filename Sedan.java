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
        setSedan() ;
    }

    public void setSedan()
    {
        // ----sedan has been created----
        System.out.println("Sedan : ") ;

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

    public void showInfo()
    {  
        System.out.println() ;
        System.out.println("Sedan : ") ;
        System.out.println("Sedan Color is : " + color) ;
        System.out.println("Sedan Capacicy is : " + capacicy) ;
        System.out.println("Sedan PowerType is : " + powertype) ;
        System.out.println("Sedan Year is : " + year) ;
        System.out.println("Sedan Weight is : " + weight) ;
        System.out.println("Sedan Displacement is : " + displacement) ;
        System.out.println("Sedan PeopleNum is : " + peoplenum) ;
        System.out.println("Sedan Type is : " + type) ;
        System.out.println("Sedan Use is : " + use) ;
    }
}