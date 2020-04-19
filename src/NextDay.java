import java.util.Scanner;

public class NextDay {

    public static int findNextDay(int day){

        if (day == 31){
            return 1;
        }else if (day <31 && day >1){
            return day +=1;
        }
        else return 0;
    }
}
