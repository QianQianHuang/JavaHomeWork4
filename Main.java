/**
 * Main
 */
import java.util.* ;
 public class Main {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
     
        ArrayList <Truck> TruckList = new ArrayList <Truck>() ;
        ArrayList <Bus> BusList = new ArrayList <Bus>() ;
        ArrayList <Sedan> SedanList = new ArrayList <Sedan>() ;
     
        String str = " " ;

        while(true)
        {
            System.out.println("Continue") ;
            str = scn.next() ;

            if(str.equals ("y") || str.equals("Y"))
            {
                System.out.println() ;
                System.out.println("Add new Obj : ") ;
                TruckList.add(new Truck()) ;
                BusList.add(new Bus()) ;
                SedanList.add(new Sedan()) ;
            }   

            else if(str.equals("n") || str.equals("N"))
            {
                System.out.println() ;
                break ;
            }

            }

            System.out.println(TruckList.get(TruckList.size()-1).showInfo()) ;
            System.out.println(TruckList.get(BusList.size()-1).showInfo()) ;
            System.out.println(SedanList.get(SedanList.size()-1).showInfo()) ;
           
            
            System.out.println("Total Obj : " + Car.counts) ;
            System.out.println("End") ;

    }   
 }
    
    
