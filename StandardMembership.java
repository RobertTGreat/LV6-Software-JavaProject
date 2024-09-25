import java.util.ArrayList;

public class StandardMembership {

    private StandardMember member;

    //list of standard member objects
    private ArrayList<StandardMember> members = new ArrayList();

    public StandardMembership(){

    }



    public StandardMember getMember() {
        return member;
    }

    public void setMember(StandardMember member) {
        this.member = member;
        addMember(member);//this adds that instance of standard member to the array list
    }

    public void addMember(StandardMember member){
        members.add(member);
        //print statment to check code reached this section
        System.out.println("Standard member successfully added");
    }

    //passing an amount the user wishes to increase
    public void addCredits(int result, int amount){
        members.get(result).setCredits(amount);
    }

    public void withdrawCredits(int result, int amount){

        //transaction can go ahead
        //small change whatever their credits is , if its equal to or greater than - 100

        if (members.get(result).getCredits() - amount >=0){
            members.get(result).setCredits(-amount);
        }
        else{
            System.out.println("Insufficent funds.");
        }

    }

    public void disStanAcc(int result){
        System.out.println("First name: " + member.getfName() + "\n " + " Surname: " + member.getsName() + "\n " + " Membership Type: " + member.getMemType() + "\n " + "Current game credits balance: " + members.get(result).getCredits() +  "\n ");

    }

    //for every member thats part of this array list go and get the disStanDetails method
    public void disStandardMembers(){
        for(StandardMember member: members){
            System.out.println(member.disStanDetails()+"\n");
        }
    }

    public void disCurCredits(int result)
    {
        System.out.println("Current credit balance: "+ members.get(result).getCredits());
    }

    public void Login(int result , String pWord){
        //possibility of adding loop to increase number of tries
        //compare uname and password from console scanner with existing member uName and pword
        if (result == -1){
            System.out.println("Username incorrect");
            System.exit(0);
        }

        if(members.get(result).getpWord().equals(pWord)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Unsuccessful");
            System.out.println("You have been removed from the system");
            System.exit(0);
        }
    }


    public int searchUserName(String x)
    {
        int n = members.size();
        for(int i = 0; i < n; i++)
        {
            if(members.get(i).getuName().equals(x)) {
                System.out.println("FOUND");
                return i;
            }

        }
        return -1;
    }
}
