import java.awt.*;
import java.util.*;
import java.util.List;

public class DecimalComparator {
    public static boolean areEqualByTreeDecimalPlaces(double one, double two) {
        String a = String.valueOf(one);

        String b = String.valueOf(two);


        String[] first = a.split("\\.");
        String[] secound = b.split("\\.");
        String h = first[1];
        String k = secound[1];
        String up = first[0];
        String down = secound[0];
        char[] destiny = up.toCharArray();
        char[] theBest = down.toCharArray();

        char[] love = h.toCharArray();
        char[] kasper = k.toCharArray();


        if (love[0] == kasper[0]) {
            if (love[1] == kasper[1]) {

                if (love[2] == kasper[2]) {
                    if (destiny[0] == theBest[0])
                        return false;
                }
            }
        }


        return false;
    }
}










