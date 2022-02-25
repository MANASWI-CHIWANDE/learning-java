class Base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
        System.out.println("hey! i'm from base class");

    }

    public void printMe(){
        System.out.println("hey! i'm a method");
    }
}

class derived extends Base{
    int y;

    public void setY(int y) {
        this.y = y;
        System.out.println("hey! i'm from derived class");
    }
    public int getY(){
        return y;
    }
}
public class InheritanceInJava {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        derived d = new derived();
        d.setX(55);
        d.setY(555);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
