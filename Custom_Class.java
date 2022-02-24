class Employee{
    byte id ;
    String name ;
    int salary ;
    public void printDetails(){
        System.out.println("MY NAME IS : "+name);
        System.out.println("MY id is : "+id);
    }
    public int getSalary(){
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        Employee obj = new Employee();
        //SETTING ATTRIBUTES
        obj.id= 101;
        obj.name = "AARADHYA";
        obj.salary = 340000;
        //GETTING ATTRIBUTES
        //System.out.println(obj.id);
        //System.out.println(obj.name);
        obj.printDetails();

        int sal = obj.getSalary();
        System.out.println("MY SALARY IS : "+sal);
    }
}
