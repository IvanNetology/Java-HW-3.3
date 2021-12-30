public class CreditPaymentService {
    public int calculate(int amount, int period) {
        double count1 = 0.0879112364; // множитель при сроке кредита один год
        double count2 = 0.046140311; // множитель при сроке кредита два года
        double count3 = 0.0322624925; // множитель при сроке кредита три года
        int payment = 0;
        if (period == 1) {
            payment = (int) (amount * count1);
        }
        if (period == 2) {
            payment = (int) (amount * count2);
        }
        if (period == 3) {
            payment = (int) (amount * count3);
        }
        return payment;
    }
}
