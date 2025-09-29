package Com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scan.nextLine().trim();

        String[] entire = fullName.split(" ");
        String firstName = entire[0];
        String middleName = "(none)";
        String lastName;

        if(entire.length == 2) {
            lastName = entire[1];
        } else {





        






    }
