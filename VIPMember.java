public class VIPMember extends Member{
    private String memType;

    int credits;

    public VIPMember(String fname, String sname, String uname, String pword , String memtype) throws InputValidationException{

        //when creating a standard member we want to create a Member object
        super(fname,sname,uname,pword); //initialize these by calling on the super class
        this.memType=memtype;
        this.credits = 0;

    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public String disVipDetails(){
        return "First name: " + getfName() + "\n " + " Surname: " + getsName() + "\n " + " Membership Type: " + getMemType() + "\n ";

    }


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits += credits;
    }
}
