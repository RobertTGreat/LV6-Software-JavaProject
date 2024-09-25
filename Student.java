public class Student {

    static int NEXTNUMBER = 1000;
    //a variable which is exclusive to the student class.

    private String fname;
    private String sname;
    private String password;
    private String username;
    private String id;

    private int age;

    public Student (String fname, String sname, int age){

        this.fname = fname;
        this.sname = sname;
        this.age = age;
        this.id = "SID"+NEXTNUMBER++;
    }

    //Getter's and Setter's for Fname
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    //Getter's and Setter's for Sname
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    //Getter's and Setter's for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Getter's and Setter's for Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //Getter's and Setter's for ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Getter's and Setter's for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void generatePassword(){

        String password = getId();
        System.out.println("Your Password Is: "+password);
        this.password = password;
    }

    public void generateUsername(){

        String username = fname.substring(0,1)+sname;
        System.out.println("Your Username Is: "+username);
        this.username = username;
    }

    public String displayStudentDetails(){

        return "Name: "+getFname()+" "+getSname()+"\n"+"Age: "+getAge()+"\n"+"Student ID: "+getId();

    }
}
