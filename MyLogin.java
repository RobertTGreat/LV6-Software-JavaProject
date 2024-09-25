import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyLogin {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        allAccounts Accounts= new allAccounts();

        int choice;

        do{

            System.out.println("---Welcome to Student Portal---"+"\n");
            System.out.println("1: Create User");
            System.out.println("2: Log-in");
            System.out.println("3: View Students");
            System.out.println("4: Remove Student");
            System.out.println("5: Exit");


            choice = Validate.ValidateChoiceInt();

            if (choice == 1){

                System.out.println("Please enter firstname: ");
                String fname = sc.nextLine();

                System.out.println("Please enter surname: ");
                String sname = sc.nextLine();

                System.out.println("Please enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                Student student = new Student(fname, sname, age);

                student.generatePassword();
                student.generateUsername();
                Accounts.setStudents(student);


            } else if (choice == 2) {

                System.out.println("Please enter Username: ");
                String uname = sc.nextLine();

                System.out.println("Please enter Password: ");
                String pass = sc.nextLine();

                Accounts.checkLogin(uname,pass);

            } else if (choice == 3){

                Accounts.displayAllStudentAccounts();

            } else if (choice == 4) {

                System.out.println("Please enter ID to be removed: ");
                String id = sc.nextLine();

                Accounts.RemoveAccount(id);

            } else if (choice == 5){

                System.out.println("Adios");

            }else{
                System.out.println("Invalid Input---Re-enter Choice 1,2,3,4");
            }

        }while(choice != 5);



    }

}
