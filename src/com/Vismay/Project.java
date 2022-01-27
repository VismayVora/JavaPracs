import java.util.*;
import java.io.*;
import java.lang.*;

public class Project {

    // csv file reader

    public static String[] read(long acc) throws Exception {

        Scanner sc = new Scanner(new File("JavaProject.csv"));
        sc.useDelimiter(","); // sets the delimiter pattern
        String arr[] = new String[12];
        int i = 0;

        while (sc.hasNext()) {
            arr[i] = sc.next();
            i++;
        }

        String names[] = new String[arr.length/4];
        long account_numbers[] = new long[arr.length/4];
        int pins[] = new int[arr.length/4];
        double amounts[] = new double[arr.length/4];

        int count=0;
        while(count<arr.length/4) {
            names[count] = arr[count*4];
            account_numbers[count] = Long.parseLong(arr[count*4+1]);
            pins[count] = Integer.parseInt(arr[count*4+2]);
            amounts[count] = Double.parseDouble(arr[count*4+3]);
            count++;
        }

        int index = -1;
        String user[] = new String[4];
        for(int x=0;x<account_numbers.length;x++) {
            if(acc==account_numbers[x]) {
                user[0] = names[x];
                user[1] = Long.toString(account_numbers[x]);
                user[2] = Integer.toString(pins[x]);
                user[3] = Double.toString(amounts[x]);
                break;
            }
        }
        return user;
    }

    // withdraw money
    public static boolean check(String a[]) {
        Scanner c = new Scanner(System.in);
        
        System.out.println("Enter your pin: ");
        int pno = c.nextInt();
        boolean valid = false;
        if(Integer.parseInt(a[2])==pno) {
            valid=true;
        }
        return valid;
    }

    public static void withdraw(String arr[]) {
        Scanner wd = new Scanner(System.in);
        if(check(arr)) {
            System.out.println("Enter withdrawal amount: ");
            double amount = wd.nextInt();
            if(Double.parseDouble(arr[3])>amount) {
                arr[3] = Double.toString(Double.parseDouble(arr[3]) - amount);
                balance(arr);
            }
            else {
                System.out.println("Balance kam hai");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void change(String arr[]) {
        Scanner ch = new Scanner(System.in);
        if(check(arr)) {
            System.out.println("Enter new pin: ");
            int new_pin = ch.nextInt();
            arr[2] = Integer.toString(new_pin);
            System.out.println("New pin: "+arr[2]);
        }
        else {
            System.out.println("Invalid pin");
        }
    }

    public static void balance(String arr[]) {
        if(check(arr)) {
            System.out.println("Your balance is: "+arr[3]);
        }
        else {
            System.out.println("Invalid");
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        // home
        System.out.println("Intro");
        System.out.print("Enter your acc no.: ");
        long accno = obj.nextLong();

        System.out.print(read(accno)[0]);
        System.out.println("Enter choice\n1.W\n2.CP\n3.CB\n4.E");
        int choice = obj.nextInt();
        switch(choice) {
            case 1: withdraw(read(accno)); break;
            case 2: change(read(accno)); break;
            case 3: balance(read(accno)); break;
            default: System.out.println("Invalid option"); break;
        }
    }

}

