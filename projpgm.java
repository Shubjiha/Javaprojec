import java.util.Scanner;
public class projpgm 
{
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[][] details = {
            {"13 April", "Sneha", "12345", "ECE", "5000"}, 
            {"02 June", "Sheela", "45678", "CSE", "7000"},
            {"13 July", "John", "78910", "EEE", "10000"},
            {"18 May", "Saravana", "78910", "EEE", "30000"},

            {"16 Jan", "Samule", "78910", "EEE", "20000"},

            {"28 Feb", "Nirav", "78910", "EEE", "50000"},

            {"29 Sep", "Sam", "78910", "EEE", "60000"},

            {"31 March", "Ram", "78910", "EEE", "80000"},

            {"1 Agu", "Mahi", "78910", "EEE", "90000"}

        };
        System.out.print("Enter the date and month : ");
        String date = scanner.nextLine();
        boolean found = false;
        double totalAmount = 0;
       for (String[] transaction : details) {
            if (transaction[0].equals(date)) {
                found = true;
                System.out.println("Deposited Amount: Rs." + transaction[4]);
                System.out.println("Depositor Name: " + transaction[1]);
                System.out.println("Roll No: " + transaction[2]);
                System.out.println("Department: " + transaction[3]);
                totalAmount += Double.parseDouble(transaction[4]);
            }
        }

        if (!found) {
            System.out.println("No transactions found for the given date.");
            return;
        }

        System.out.print("Enter expenditure amount: Rs.");
        double expenditure = scanner.nextDouble();

        if (expenditure > totalAmount) {
            System.out.println("Expenditure exceeds total deposited amount.");
            return;
        }

        System.out.println("Expenditure deducted: Rs." + expenditure);
        totalAmount -= expenditure;
        System.out.println("Final balance: Rs." + totalAmount);

        scanner.close();
    }
}