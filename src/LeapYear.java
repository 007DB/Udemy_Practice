

public  class  LeapYear {
    public  static boolean isLeapyear(int year){

        if (year>= 1 && year<=9999) {

            if (year%4==0){
                if ((year %100!=0)||(year%400==0)){
                        System.out.println("this is a leap year it has 366 days");
                        return true;
                    }
                }else
                System.out.println("this is not a leap year it has 365 days");
                return false;


        } return false;
    }
}


