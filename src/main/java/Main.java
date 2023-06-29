/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your Name?");

        String response;
        response = scanner.nextLine();

        String alice = "Alice";
        String bob = "Bob";

         if(alice.equals(response))
        {
            System.out.println("Hello Alice!");
        }

        if(bob.equals(response)) {
            System.out.println("Hello Bob!");
        }


    }
}
