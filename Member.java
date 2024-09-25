public class Member {

    //private instance variables
    private String fName, sName, uName, pWord ;

    //constructor
    //Method with same name but different method signatures - Static polymorphism
    //Method overloading - same name but different signatures

    public Member(String fname, String sname, String uname, String pword) throws InputValidationException{
        this.fName = fname;//this key word refers to the classes version of fName equals the value being passed
        this.sName = sname;
        this.uName=uname;
        this.pWord = pword;
    }

    public Member(){

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) throws InputValidationException{
        if(pWord.length()<=10){
            this.pWord = pWord;
        }
        else{
            throw new InputValidationException(); // needs to be thrown somewhere
        }
    }


    public String toString(){
        return "First name: " + getfName() + " Surname: " + getsName() + "\n ";
    }

}
