package secao16_interfaces.exercicio_contrato_empresarial.services;

public class PaypalService implements OnlinePaymentService{
    @Override
    public double paymentFee(double amount){
        return 0.02 * amount;
    }
    @Override
    public double interest(double amount, int months){
        return amount * 0.01 * months;
    }

}
