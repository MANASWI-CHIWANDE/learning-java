

//1.create a class cylinder and use getter and setters to set its radius and height
class Cylinder{
    int radius ;
    int height ;

    //3. Use a constructor and repeat ➊
    public Cylinder(int a , int b ){
        radius = a;
        height = b;
    }
    public int getRadius(){     return radius; }
    public int getHeight() {    return height; }
    public void setRadius(int r ){  radius = r;}
    public void setHeight(int height) { this.height = height; }
    //2. use ➊ to calculate surface and volume of the cylinder
    public void surfaceArea (){ System.out.println("SURFACE AREA OF CYLINDER IS : " + 2*3.14*radius*(radius+height)); }
    public void volume (){ System.out.println("VOLUME OF CYLINDER IS : " + 3.14*radius*radius*height); }
}


//4. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {  return length;}
    public int getBreadth() { return breadth;}
}

//5. Repeat ➊ for a sphere
class Sphere{
    int radius ;

    public Sphere(int a ){
        radius = a;
    }
    public int getRadius(){     return radius; }
    public void setRadius(int r ){  radius = r;}
    public void surfaceArea (){ System.out.println("SURFACE AREA OF SPHERE IS : " + 4*3.14*radius*radius); }
    public void volume (){ System.out.println("VOLUME OF SPHERE IS : " + 3.14*radius*radius*radius); }
}


public class PS_9 {
    public static void main(String[] args) {
        //1.create a class cylinder and use getter and setters to set its radius and height
        //Cylinder c = new Cylinder();
        /*c.setRadius(2);
        System.out.println(c.getRadius());
        c.setHeight(4);
        System.out.println(c.getHeight());*/
        //2. use ➊ to calculate surface and volume of the cylinder
        //3. Use a constructor and repeat ➊
        Cylinder c = new Cylinder(2,4);
        c.surfaceArea();
        c.volume();
        //4. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
        Rectangle1 r = new Rectangle1(5,4);
        //5. Repeat ➊ for a sphere
        Sphere s = new Sphere(4);
        s.surfaceArea();
        s.volume();
    }
}
