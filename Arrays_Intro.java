public class Arrays_Intro {
    public static void main(String[] args) {
        //for classroom of 500 students - to store their marks
        //option:-
        //1. Create 500 variables
        //2. use array

        //Types of array
        int [] marks = {23,56,78,98,45};
        //float [] mark = {23,56,78,98,45};->correct
        float [] mark = {23.5f,56.7f,78.8f,98.3f,45.f};//------>also correct
        String[] names = {"Saloni", "Mansi","Tisha", "Manaswi"};

        //THERE ARE 3 MAIN WAYS TO HAVE ARRAYS
        /*
        //1. Declaration + memory allocation
        int [] marks = new int[5];
        marks[0]= 56;
        marks[1]= 86;
        marks[2]= 76;
        marks[3]= 66;
        marks[4]= 96;
         */

        /*
        //2. Declaration and then  memory allocation
        int [] marks;
        marks = new int[5];
        marks[0]= 56;
        marks[1]= 86;
        marks[2]= 76;
        marks[3]= 66;
        marks[4]= 96;
         */


        //3. Declaration , memory allocation and initialize
        //int [] marks = {23,56,78,98,45};
        System.out.println(marks[4]);
        System.out.println(marks.length);
    }
}
