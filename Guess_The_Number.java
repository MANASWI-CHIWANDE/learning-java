import java.util.Random;
import java.util.Scanner;
/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */
class Game{
    private int pc;
    private int user;
    private int noOfGuesses=0;
    public boolean flag = false;
    public Game(){
        Random r = new Random();
        pc = r.nextInt(1,100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR GUESS : ");
        int x = sc.nextInt();
        user = x;
        noOfGuesses++;
    }

    public void isCorrectNumber(){
        if(pc == user){
            System.out.println("GOOD JOB ");
            flag = true;
            System.out.println("YOU WON IN "+noOfGuesses+" GUESS");
        }
        else{
            if(pc > user){
                System.out.println("NUMBER IS LARGER ........HIGH YOUR GUESS");
            }
            else{
                System.out.println("NUMBER IS SMALLER ........LOW YOUR GUESS");
            }
        }
    }

}
public class Guess_The_Number {
    public static void main(String[] args) {
        Game g = new Game();
        while(g.flag!=true){
            g.takeUserInput();
            g.isCorrectNumber();

        }
    }
}
