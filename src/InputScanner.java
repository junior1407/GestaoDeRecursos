import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a sentence:\t");
            String sentence = scanner.nextLine();

            System.out.print("Enter an index:\t");
            int index = scanner.nextInt();

            System.out.println("\nYour sentence:\t" + sentence);
            System.out.println("Your index:\t" + index);

            System.out.print("Enter Item Code: ");

            String itemCode = scanner.next();

            // A double value
            System.out.print("Enter Price: ");

            double price = scanner.nextDouble();

            // An int value
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            // Display entered values
            double total = price * quantity;
            System.out.println();
            System.out.printf("%d %s @ %f = %f\n", quantity, itemCode, price, total);
            // Read three int values
            System.out.printf("Enter three integer values: ");
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();
            // Calculate the average and display the result
            int avg = (i1 + i2 + i3) / 3;

            System.out.printf("Average: %d", avg);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }
}
