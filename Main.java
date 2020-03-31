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

            for(int i = 0 ; i < TruckList.size() ; i ++)
            {
                TruckList.get(i).showInfo() ;
                BusList.get(i).showInfo() ;
                SedanList.get(i).showInfo() ;
            }
            
            System.out.println("Total Obj : " + Car.counts) ;
            System.out.println("End") ;

    }   
 }
    
    
