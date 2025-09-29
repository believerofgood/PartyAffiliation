import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String PartyAffiliation = "";

        System.out.println("Enter Party affiliation [D, R, I, other]");

        String Party = in.nextLine();

        if (Party.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey");

        }

        else if (Party.equalsIgnoreCase("R")) {

            System.out.println("You get a Republican Elephant");

        }

        else if (Party.equalsIgnoreCase("I")) {

            System.out.println("You get a Independent person");

        }

        else {

            System.out.println("You entered other");

        }


        }



    }
