//Create 3 User objects, display info, then update contact for one user and display again.
import java.util.Scanner;
class new_User {
    int Semister ;
    int Rollnumber;
    String Name;
    int Contact;

    public void setSemister(int semister){
    this.Semister = semister;

    }
    public void setRollnumber(int rollnumber){
    this.Rollnumber = rollnumber;
    }
    public void setName(String name){
    this.Name = name;
    }
    public void setContact(int contact){
        this.Contact = contact;
    }

    public void displayinfo(){

        System.out.println("Semister :" + Semister);
        System.out.println("RollNumber :" + Rollnumber);
        System.out.println("Name :" + Name);
        System.out.println("Contact :" + Contact);

    }

}

public class Practice2 {
    public static void main(String[] args) {
        new_User user1 = new new_User();
        user1.setSemister(5);
        user1.setRollnumber(134);
        user1.setName("ARJUN");
        user1.setContact(600696);
        user1.displayinfo();
    }
}
