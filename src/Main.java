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
        System.out.println("What do you want your bagel shop to be called?");
        String shopName = answer.nextLine();
        System.out.println("How expensive will your bagels be?");
        String price = answer.nextLine();
        while(!(isNumeric(price))){
            System.out.println("Enter a number.");
            price = answer.nextLine();
        }
        int bagelPrice = Integer.parseInt(price);
        Bank bank = new Bank();
        BagelShop shop = new BagelShop(shopName,1000,bagelPrice,bank);
        System.out.println(shop);
    }
    public static String generatePin(){
        String pin = "";
        for(int i = 0; i < 4; i++){
            pin+="" + (int)(Math.random()*10);
        }
        return pin;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
