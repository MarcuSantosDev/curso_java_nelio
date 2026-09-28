package secao8_poo.exercises.exercise_4.util;

public class CurrencyConverter {

    public static double dollarToReal(double dollar, double dollarPrice) {
        return dollar * dollarPrice;
    }

    public static double iof(double dollar, double dollarPrice) {
        return dollarToReal(dollar, dollarPrice) * 0.06;
    }

    public static double total(double dollar, double dollarPrice) {
        double reais = dollarToReal(dollar, dollarPrice);
        double iof = reais * 0.06;

        return reais + iof;
    }
}
