import java.util.Scanner;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCard card = new CreditCard("Chris", 'L', "Martin", 4000123456789123L, 256, 0, 100);
        System.out.println(card);

        if(card.purchase(40)) {
            System.out.println("Your purchase of $40 didn't go through");
        }
        else {
            System.out.println("Your purchase of $40 didn't go through.");
        }

        if(card.purchase(60)) {
            System.out.println("Your purchase of $60 didn't go through");
        }
        else {
            System.out.println("Your purchase of $60 didn't go through.");
        }

        System.out.printf("Current balance: %.2f\n", card.getBalance());
        System.out.printf("Credit Limit: %.2f\n", card.getCreditLimit() - card.getBalance());

        card.setCreditLimit(200);

        if(card.purchase(60)) {
            System.out.println("Your purchase of $60 didn't go through");
        }
        else {
            System.out.println("Your purchase of $60 didn't go through.");
        }

        System.out.printf("Current balance: %.2f\n", card.getBalance());
        System.out.printf("Credit Limit: %.2f\n", card.getCreditLimit() - card.getBalance());

        //prompt user to enter how much they would like to pay
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Payment: ");
        double payment = input.nextDouble();
        card.makePayment(payment);
        System.out.println(card);
    }

}
