import java.util.Scanner;

public class UserLogin {

    private static String sysPassword1 = "parool1";
    private static String sysPassword2 = "parool2";
    private static Scanner passwordScanner = new Scanner(System.in);
    private static boolean check = false;

    public static void main(String[] args) {

        while (!check){

            while(!check) {
                System.out.println("Sisesta esimene parool: ");
                String userInput1 = askUserFirstPassword();
                if (passwordChecker(userInput1, sysPassword1))
                    check = true;
            }
            System.out.println("Sisesta teine parool: ");
            String userInput2 = askUserFirstPassword();
            check = passwordChecker(userInput2, sysPassword2);
        }
    }
    private static String askUserFirstPassword(){
        return passwordScanner.next();
    }
    private static boolean passwordChecker(String input1, String input2) {
        if (input1.equals(input2)) {
            System.out.println("Õige");
            return true;
        }
        else return false;
    }
}