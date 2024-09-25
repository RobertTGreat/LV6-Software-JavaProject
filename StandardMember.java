//Child class extends (inherits) attributes and methods from superclass

public class StandardMember extends Member{
    private String memType;
    private int credits;

    public StandardMember(String fname, String sname, String uname, String pword , String memtype) throws InputValidationException{

        //when creating a standard member we want to create a Member object
        super(fname,sname,uname,pword); //initialize these by calling on the super class
        this.memType=memtype;
    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public String disStanDetails(){
        return "First name: " + getfName() + "\n " + " Surname: " + getsName() + "\n " + " Membership Type: " + getMemType() + "\n ";

    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits += credits;
    }
}
