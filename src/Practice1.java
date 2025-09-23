// 1. Create a`User`class with properties: userId`,`name`,contact`,role`.
//    - Write constructor(s) and methoddisplayInfo()`.
import java.sql.SQLOutput;
import java.util.Scanner;
class User {
    int User_id ;
    String Name ;
    int Contact ;
    String role;
    public User (int  User_id, String Name ,int Contact, String role ){
//        Scanner sc = new Scanner(System.in);
//        User_id = sc.nextLong();
        this.User_id = User_id;
        this.Name = Name;
        this.Contact = Contact;
        this.role = role;
    }
    public void displayinfo(){
        System.out.println("USER ID :" + User_id);
        System.out.println("NAME :" + Name);
        System.out.println("CONTACT :" + Contact);
        System.out.println("ROLE :" + role);

    }
}
public class Practice1 {
    public static void main(String[] args) {
     User user1 = new User(101 , "Arjun",60069680, "Driver" );
     user1.displayinfo();

        }
    }

