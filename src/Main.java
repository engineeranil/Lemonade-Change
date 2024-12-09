public class Main {
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        int fiveDollar = 0;
        int tenDollar = 0;
        boolean checkChange = true;
        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];
            if (bill == 5) {
                fiveDollar++;
            } else if (bill == 10) {
                if (fiveDollar > 0) {
                    fiveDollar--;
                    tenDollar++;
                } else {
                    checkChange = false;
                    break;
                }
            } else {
                if (fiveDollar > 0 && tenDollar > 0) {
                    fiveDollar--;
                    tenDollar--;
                } else if (fiveDollar >= 3) {
                    fiveDollar -= 3;
                } else {
                    checkChange = false;
                    break;
                }
            }

        }
        System.out.println(checkChange);
    }
}









