public class MegaBytesConverter {

    public static void printMeghaBytesAndKiloBytes (int kiloBytes){

        int meghaBytes = kiloBytes/1024;
       int meghaBytes1= kiloBytes%1024;


                System.out.println( kiloBytes+ " KB " +" = " + meghaBytes + " MB " + meghaBytes1 + " KB "  );

                if(kiloBytes<0){
                    System.out.println("Invalid Value");
                }
    }

    }
