class Example{
    private int a ;
    private String s;
    public void setNum(int x){
        a = x;
    }
    public int getNum(){
        return a;
    }
    public void setName(String s1){
        this.s = s1;
        //this.s = "djrn" such methods can also be used not here but in general
    }
    public String  getName(){
        return  s;
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.setNum(1);
        System.out.println(obj.getNum());
        obj.setName("MANN");
        System.out.println(obj.getName());
    }
}
