import java.util.*;

public class GameCreditStore {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            //this is where things link up and start to make sense

            //we  know that there will be a 1 to 1 relationship between members and the membership
            StandardMembership mem1 = new StandardMembership();
            VIPMembership mem2 = new VIPMembership();

            //user decisions for loging in , withdraw , etc...
            int choice; //main menu
            int opt; // inner options

            //get values for instances of members objects based on user input
            String fName, sName, uName, pWord, memType;

            //Do loop for "choice" used to register, login, and exit
            do {
                System.out.println("----Welcome to the Game Credit Store----");
                System.out.println("Please choose from the following options");
                System.out.println("Option 1: Register");
                System.out.println("Option 2: Login");
                System.out.println("Option 3: Exit");


                //these two lines will get removed later for the validate section
                choice = Validate.ValidateChoiceInt();

                if (choice == 1) {
                    System.out.println("----Register----");
                    System.out.println("Please enter your first name: ");
                    fName = in.nextLine();

                    System.out.println("Please enter your Surname: ");
                    sName = in.nextLine();

                    System.out.println("Please enter your username: ");
                    uName = in.nextLine();

                    System.out.println("Please enter your password: ");
                    pWord = in.nextLine();

                    Member member = new Member(); // create instance of super class to validate the pword in the set method
                    member.setpWord(pWord);

                    //assign member being registed to appropriate membership class
                    System.out.println("What type of membership do you want?");
                    System.out.println("1 - VIP membership: gaming credit facility (100 credits) "); //lets user know of the 100 credit bonus overdraft
                    System.out.println("2 - Standard membership: no gaming credit facility");

                    opt = in.nextInt();
                    in.nextLine();
                    if (opt == 1) {
                        memType = "VIP membership";
                        VIPMember vipmem = new VIPMember(fName, sName, uName, pWord, memType); // what does the VIPmember need?
                        mem2.setMember(vipmem);// adding the newly registered member to the list of VIP members
                    } else if (opt == 2) {
                        memType = "Standard membership";
                        StandardMember stanmem = new StandardMember(fName, sName, uName, pWord, memType); // what does the VIPmember need?
                        mem1.setMember(stanmem);// adding the newly registered member to the list of VIP members
                    }

                } else if (choice == 2) {
                    //get user to enter username and password
                    //second submenu to login
                    int acc;
                    int tran = 0; //account , transaction
                    String userName, passWord;

                    System.out.println("----Login----");

                    System.out.println("What membership would you like to log into?: ");
                    System.out.println("1 - VIP membership");
                    System.out.println("2 - Standard membership");
                    acc = in.nextInt();
                    in.nextLine();
                    if (acc == 1) {
                        System.out.println("---VIP membership Login ---");
                        System.out.println("Please enter your username: ");
                        userName = in.nextLine();

                        System.out.println("Please enter your password: ");
                        passWord = in.nextLine();


                        //updated login section with linear search to return existing user as result
                        int result = mem2.searchUserName(userName);
                        mem2.Login(result, passWord); //pass user inputs to login to check if they exist




                        //if successful then they can carry out a transaction, if not then the system will exit based on the login method
                        do {
                            System.out.println("--- Transaction --- ");
                            System.out.println("1 - Check Credit Balance");
                            System.out.println("2 - Add Credits");
                            System.out.println("3 - Witrhdraw credits ");
                            System.out.println("4 - Exit");

                            tran = in.nextInt();
                            in.nextLine();

                            if (tran == 1) {
                                mem2.disCurCredits(result);

                            } else if (tran == 2) {
                                System.out.println("--Add Credits--");
                                System.out.println("How many would you like to deposit");
                                int amount = in.nextInt(); // value expected to bne passed over to add credits method
                                mem2.addCredits(result, amount);
                            } else if (tran == 3) {
                                System.out.println("--Withdraw Credits--");
                                System.out.println("How many would you like to Withdraw");
                                int amount = in.nextInt(); // value expected to the passed over to withdraw credits method
                                mem2.withdrawCredits(result, amount);
                            } else if (tran == 4) {
                                System.out.println("Exiting transaction");

                            }
                        } while (tran != 4);


                    } else if (acc == 2) {
                        System.out.println("---Standard membership Login ---");
                        System.out.println("Please enter your username: ");
                        userName = in.nextLine();

                        System.out.println("Please enter your password: ");
                        passWord = in.nextLine();

                        int result = mem1.searchUserName(userName);
                        mem1.Login(result, passWord);

                        //if successful then they can carry out a transaction, if not then the system will exit based on the login method
                        do {
                            System.out.println("--- Transaction --- ");
                            System.out.println("1 - Check Credit Balance");
                            System.out.println("2 - Add Credits");
                            System.out.println("3 - Witrhdraw credits ");
                            System.out.println("4 - Exit");

                            tran = in.nextInt();
                            in.nextLine();

                            if (tran == 1) {
                                mem1.disCurCredits(result);

                            } else if (tran == 2) {
                                System.out.println("--Add Credits--");
                                System.out.println("How many would you like to deposit");
                                int amount = in.nextInt(); // value expected to bne passed over to add credits method
                                mem1.addCredits(result, amount);
                            } else if (tran == 3) {
                                System.out.println("--Withdraw Credits--");
                                System.out.println("How many would you like to Withdraw");
                                int amount = in.nextInt(); // value expected to the passed over to withdraw credits method
                                mem1.withdrawCredits(result, amount);
                            } else if (tran == 4) {
                                System.out.println("Exiting transaction");

                            }
                        } while (tran != 4);
                    }
                }
            }
            while (choice != 3);


        }catch(InputValidationException e){
            e.printStackTrace();

        }
    }
}
