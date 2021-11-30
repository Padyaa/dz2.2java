
public class Main {
    public static void main(String[] args) {
        int balance = 4000;
        int amount =9000;
        int bonus = 0;


        if (amount > 1000) {
            bonus = amount/100;
        }
        int final_balane = balance + bonus + amount;
        System.out.println( "На вашем счету:"+final_balane );
    }
}
