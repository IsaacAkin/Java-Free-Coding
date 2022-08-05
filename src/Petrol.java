import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        String stationLocation;
        String petrol;
        int quantityInLitres;
        double pricePerLitre;
        double percentageDiscount;

        Scanner input = new Scanner(System.in);

        System.out.println("Where is your petrol station located in?");
        stationLocation = input.nextLine();

        System.out.println("What type of petrol are you buying?");
        petrol = input.nextLine();

        System.out.println("How many litres are you planing to get?");
        quantityInLitres = input.nextInt();

        System.out.println("How much does is cost for 1 litre?");
        pricePerLitre = input.nextDouble();

        System.out.println("What is the percentage discount that you get (in decimal form)?");
        percentageDiscount = input.nextDouble();

        PetrolPurchase petrolCalculator = new PetrolPurchase(stationLocation, petrol, quantityInLitres, pricePerLitre, percentageDiscount);

        //double purchaseAmount = petrolCalculator.getPurchaseAmount();
    }
}
