
import java.util.*;
import javax.lang.model.util.ElementScanner6;
class Gusser
{
    int gussNum;
    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser kindly gusses the number");
        gussNum = sc.nextInt();
        return gussNum;
    }
}
class Player
{
    int guessNum;
    int gussingNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("player! gusses the number");
        guessNum = sc.nextInt();
        return guessNum;

    }
}
class Umpire
{
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void CollectNumFromGusser()
    {
        Gusser g = new Gusser();
        numFromGusser = g.guessingNumber();
    }
    void CollectNumberFromPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.gussingNumber();
        numFromPlayer2 = p2.gussingNumber();
        numFromPlayer3 = p3.gussingNumber();
        
    }
    void Compare(){
        if(numFromGusser==numFromPlayer1){
            if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3){
                System.out.println("player 1 , player2 or player3 all give right answer");
            }
            else if(numFromGusser==numFromPlayer2){
                System.out.println("player 1 or player 2 won");
            }
            else if(numFromGusser==numFromPlayer3){
                System.out.println("player 1 or player 3 won");
            }
            else{
                System.out.println("player1 is won");
            }
        }
        else if(numFromGusser==numFromPlayer2){
            if(numFromGusser==numFromPlayer3){
                System.out.println("player 2 or player 3 both won");

            }
            else{
                System.out.println("player2 is won");
            }
            
        }
        else if(numFromGusser==numFromPlayer3){
            System.out.println("player3 is won");
        }
        else{
            System.out.println("all are lost");
        }
    }

}

public class GusserGame{
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.CollectNumFromGusser();
        u.CollectNumberFromPlayer();
        u.Compare();

    }
}
