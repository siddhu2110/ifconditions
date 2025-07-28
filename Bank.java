class Bank {
    public static void main(String[] args) {  // <-- FIXED HERE!
        int balance = 5000;
        int withdrawAmount = 5000;
        int amount = 500;
        int i = 1;
        boolean recieverAccount = false;

        switch (i) {
            case 1:
                if (balance >= withdrawAmount && withdrawAmount > 0) {
                    System.out.println("Allow");
                } else {
                    System.out.println("Insufficient Funds");
                }
                break;
            case 2:
                if (amount > 0) {
                    System.out.println("Add to balance");
                }
                break;
            case 3:
                if (amount < balance && recieverAccount == true) {
                    System.out.println("Transfer");
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}