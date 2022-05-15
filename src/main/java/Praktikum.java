import java.util.Scanner;

public class Praktikum {


    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        String controlName = name.nextLine();

        Account account = new Account(controlName);

        boolean check = account.checkNameToEmboss();

        System.out.println(check);
    }

}
