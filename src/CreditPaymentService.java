public class CreditPaymentService {
    public int calculate(int amount, int period) {
        double percent = 0.008325; // ежемесячная процентная ставка
        int months = period * 12; // срок кредита в месяцах
        double payment = amount * (percent + percent / ((Math.pow(1 + percent, months)) - 1));
        return (int) payment;
    }
}
