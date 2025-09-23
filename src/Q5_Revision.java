// Create a class Shape with a method area(). Derive classes Circle and Square that
// implement their own area calculation.
class Shape{
    int l;

    int r;
    public void area(){

    }
}

class Circle extends Shape{
    int area ;
    @Override
    public void area(){
        area = r*r;
        System.out.println(area);
    }
}
class Square extends Shape{
    int area ;
    @Override
    public void area(){
        area = l*l;
        System.out.println(area);
    }
}

public class Q5_Revision {
    public static void main(String[] args) {

    }
}
