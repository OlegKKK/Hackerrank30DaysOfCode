//Day 1: Data Types

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int x;
        double y;
        String z;

        x = scan.nextInt();
        System.out.println(i+x);

        y = scan.nextDouble();
        System.out.println(d+y);

        scan.nextLine();
        z = scan.nextLine();
        System.out.println(s+z);

        scan.close();
    }
}