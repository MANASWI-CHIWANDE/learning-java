
//1. Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)
class Employees{
    int sal;
    String name ;
    public  int getSalary(){
        return sal;
    }
    public void setName(String a ){
        name = a;
    }
    public String getName(){
        return name;
    }
}

//2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class Cellphone{
    public void meth1(){
        System.out.println("ringing.....");
    }
    public void meth2(){
        System.out.println("vibrating.....");
    }
}

//3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.
class Square{
    int side ;
    public void initialize(int a ){
        side = a;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

//4. Create a class Rectangle & problem 3.
class Rectangle{
    int length ;
    int breadth;
    public void initialize(int a,int b ){
        length= a;
        breadth = b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

//5. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class TommyVecetti{
    public void hitting(){
        System.out.println("hitting...");
    }
    public void running(){
        System.out.println("running...");
    }
    public void firing(){
        System.out.println("firing...");
    }
}

//6. Repeat problem 4 for a circle.
class Circle{
    int rad ;
    public void initialize(int a ){
        rad = a;
    }
    public float area(){
        return (22*rad*rad)/7f;
    }
    public float perimeter(){
        return (44*rad)/7f;
    }
}
public class PS_8 {
    public static void main(String[] args) {
        //1.
        Employees obj = new Employees();
        obj.sal = 100000;
        obj.name= "TISHA CHIWANDE";
        System.out.println("SALARY IS : " + obj.getSalary());
        System.out.println("NAME IS : "+ obj.getName());
        obj.setName("MANASWI CHIWANDE");
        System.out.println("NAME IS : "+ obj.getName());

        //2.
        Cellphone obj1 = new Cellphone();
        obj1.meth1();
        obj1.meth2();

        //3.
        Square sq = new Square();
        sq.initialize(5);
        System.out.println("AREA OF SQUARE IS : " + sq.area());
        System.out.println("PERIMETER OF SQUARE IS : " + sq.perimeter());

        //4.
        Rectangle rc = new Rectangle();
        rc.initialize(5 , 3);
        System.out.println("AREA OF RECTANGLE IS : " + rc.area());
        System.out.println("PERIMETER OF RECTANGLE IS : " + rc.perimeter());

        //5.
        TommyVecetti tv = new TommyVecetti();
        tv.firing();
        tv.hitting();
        tv.running();

        //6.
        Circle c = new Circle();
        c.initialize(7);
        System.out.println("AREA OF CIRCLE IS : " + c.area());
        System.out.println("PERIMETER OF CIRCLE IS : " + c.perimeter());
    }
}
