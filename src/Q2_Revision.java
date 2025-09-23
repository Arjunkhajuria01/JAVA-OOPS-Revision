// Write a class Student with private fields name and marks.
// Use getters and setters to access/modify the data.

class Student{
    private String name ;
    private int marks;

    public void setName(String name){

    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks){
        System.out.println(marks);
    }
    public int getMarks(){
        return marks;
    }

}

public class Q2_Revision {
    public static void main(String[] args) {
        Student st = new Student();
        st.setMarks(90);
        st.getMarks();

    }
}
