import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner answer = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = answer.nextLine();
        CreditCard card = new CreditCard(name, generatePin());
        System.out.println(card);
    }
    public static String generatePin(){
        String pin = "";
        for(int i = 0; i < 4; i++){
            pin+="" + (int)(Math.random()*10);
        }
        return pin;
    }
}
