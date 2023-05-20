// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String cnp = "6001103046215";

        System.out.println(cnp.charAt(0));
        switch (cnp.charAt(0)){
            case '1', '3', '5', '7'-> System.out.println('M');
            case '2', '4', '6', '8'-> System.out.println('F');


        }
        String prefix = "";
        switch (cnp.charAt(0)){
            case '1', '2'->prefix= "19";
            case'3', '4' ->prefix="18";
            case '5', '6'->prefix="20";

        }
        System.out.println(cnp.substring(1,7));
        int year = Integer.parseInt(prefix+cnp.substring(1,3));
        int month = Integer.parseInt(cnp.substring(3,5));
        int day = Integer.parseInt(cnp.substring(5,7));
        System.out.println(year + "/" + month + "/" + day);

        String currentDate = "20230513";
        int currentYear = Integer.parseInt(currentDate.substring(0,4));
        int currentMonth = Integer.parseInt(currentDate.substring(4,6));
        int currentDay = Integer.parseInt(currentDate.substring(6,8));
        System.out.println(currentYear + "." + currentMonth + "." + currentDay);

    }
}