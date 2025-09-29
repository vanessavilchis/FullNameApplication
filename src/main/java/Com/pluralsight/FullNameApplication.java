package Com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scan.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter Suffix Name: ");
        String suffix = scan.nextLine();

        String fullName = firstName;

        System.out.printf("Full name: %s %s %s %s\n", firstName, middleName, lastName, suffix);;



    }

}
