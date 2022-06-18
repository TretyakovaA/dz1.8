
import java.time.LocalDate;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        int yearPresent = 2022;//year = yearPresent
        checkLeap(yearPresent);
        print();
        checkOS(2022,  0);
print();
int distance = 95;
delivery (distance);
int day = delivery(distance);
        System.out.println("Потребуется дней: "+day);

    }
    private static  void  print () {
        System.out.println("==============================================");
    }
    private static void checkLeap (int year){
        if ( year%4 == 0 && year %100 !=0 || year %400 ==0)

        System.out.println(year+ " - год високосный");
        else
        System.out.println( year+ " - год невисокосный");
    }
    private static void checkOS (int checkYear, int OS){
        int currentYear = LocalDate.now().getYear();
        if (OS ==0 && currentYear > checkYear)
            System.out.println("Скачайте облегченную версию для iOS");
        else if (OS ==0 && currentYear <= checkYear)
            System.out.println("Скачайте обычную версию для iOS");
        if (OS ==1 && currentYear > checkYear)
            System.out.println("Скачайте облегченную версию для Android");
        else if (OS ==1 && currentYear <= checkYear)
            System.out.println("Скачайте обычную версию для Android");

//// task3


    }
private  static int delivery (int distance) {
        int day =0;
        if ( distance <20)
            day =1;
        if (distance>=20 && distance<60)
            day = 2;
        if (distance >=60 && distance <100)
            day = 3;



return day;
}
}
