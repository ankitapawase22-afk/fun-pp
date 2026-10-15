package fp1.practice;

public class Shopping {

	public static void main(String[] args) {
		double currentBalance = 5000;
        double amount = 6000;

        if (amount > currentBalance) {
            System.out.println("Amount exceeds current balance!");
            System.out.println("Insufficient balance.");
        } else {
            currentBalance = currentBalance - amount;
            System.out.println("Shopping successful!");
            System.out.println("Remaining balance: ₹" + currentBalance);
        }

	}

}
