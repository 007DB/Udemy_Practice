import com.oracle.tools.packager.Log;

import static java.lang.System.*;

public class SpeedConveter {




     public long toMilesperHour(double KilometersPerhour) {


         if (KilometersPerhour < 0) {
             return -1;
         } else if (KilometersPerhour > 0) {

             double calc =  KilometersPerhour /1.6079;
             long newCalc =  Math.round(calc);

             System.out.println(newCalc);



             return  newCalc;





         }
         return (long) KilometersPerhour;
     }





     public void printConversion (double KilometersPerhour ) {

         if (KilometersPerhour <= 0) {
             System.out.println("invalid value");


         } else
         System.out.println(KilometersPerhour + " km/h " + " = " + toMilesperHour(KilometersPerhour) + " mi/hr");



     }
}