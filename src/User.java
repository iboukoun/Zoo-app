
import java.util.Scanner;

public class User {
        public static void main( String[] args) {
            Scanner sc = new Scanner(System.in);

            boolean valid = false;
            int choice;
            while(!valid){
            System.out.println("\n Please choose option:\n"
                    + "1)Lion\n"
                    + "2)Cobra\n"
                    + "3)Zebra");

            choice = sc.nextInt();
            if (0<choice && choice<=3){
                valid=true;
            }else {
                System.out.println("invalid choice please select between 1 , 2 or 3");
            }


            switch (choice) {
                case 1:
                    System.out.println(" you choose the Lion");
                    Lion lion = new Lion();
                    lion.lionType();

                    break;
                case 2:
                    System.out.println(" You choose the Cobra");
                    Cobra cobra = new Cobra();
                    cobra.typeOfCobra();
                    break;
                case 3:
                    System.out.println("You choose the Zebra");
                    Zebra zebra = new Zebra();
                    zebra.typeOfZebra();
                    }
            }
        }}

