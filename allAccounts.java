import java.util.ArrayList;
import java.util.Iterator;

public class allAccounts {

    private ArrayList <Student> Accounts = new ArrayList<>();

    public allAccounts(){



    }

    public void setStudents(Student s){

        addStudents(s);

    }

    public void addStudents(Student s){

        Accounts.add(s);

    }

    public void displayAllStudentAccounts(){

        System.out.println("-----Student Accounts-----");
        for (Student s : Accounts){

            System.out.println("\n"+s.displayStudentDetails());
            System.out.println("\n");

        }



    }

    public void checkLogin(String username, String password){

        boolean loggedIn = false;

        for (Student s : Accounts){

            if (username.equals(s.getUsername()) && password.equals(s.getPassword())){

                loggedIn = true;
                break;

            }

        }
        if (loggedIn){
            System.out.println("---Successful Log-In---");
        }
        else{
            System.out.println("---Incorrect Username/Password---");
        }

    }

    public void RemoveAccount(String id) {

        Iterator<Student> iter = Accounts.iterator();

        while (iter.hasNext()){

            Student student = iter.next();

            if (student.getId().equals(id)){

                iter.remove();
                System.out.println("Student Successfully removed."+"\n");

            }

        }

    }
}
