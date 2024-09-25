import java.util.Scanner;

public class Validate{

    public static Scanner sc = new Scanner(System.in);

    public static int ValidateChoiceInt() {
        while(true){

            try{

                int choice = Integer.parseInt(sc.next());

                return choice;

            }catch (NumberFormatException e){
                sc.nextLine();
                System.out.println("Invalid Integer");
            }

        }



    }

}
