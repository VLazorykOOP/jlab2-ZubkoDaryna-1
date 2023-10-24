import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab 2:");
       System.out.println("Input the amount of hryvnia:");
       long hryvnia1= scanner.nextLong();
        System.out.println("Input the amount of coins:");
        byte coint1= scanner.nextByte();
        Money money1=new Money(hryvnia1, coint1);
        System.out.println("Input the amount of hryvnia:");
        long hryvnia2= scanner.nextLong();
        System.out.println("Input the amount of coins:");
        byte coint2= scanner.nextByte();
        Money money2=new Money(hryvnia2, coint2);
        System.out.println("money1: " + money1);
        System.out.println("money2: " + money2);

        Money sum =money1.Add(money2);
        System.out.println("Summa="+sum);

        Money difference = money1.subtract(money2);
        System.out.println("Difference: " + difference);

        System.out.print("Enter a divisor for division: ");
        long divisor = scanner.nextLong();
        Money division = money1.divisionValue(divisor);
        System.out.println("Result of division by " + divisor + ": " + division);


            Money divisionMoney = money1.divide(money2);
            System.out.println("Result of money1 division by money2: " + divisionMoney);


        int comparison = money1.compareTo(money2);
        if (comparison < 0) {
            System.out.println("Money1 is less than money2");
        } else if (comparison > 0) {
            System.out.println("Money1 is greater than money2");
        } else {
            System.out.println("Money1 is equal to money2");
        }
        scanner.close();
    }
}