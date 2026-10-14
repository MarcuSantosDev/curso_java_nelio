package secao16_interfaces.exercicio_contrato_empresarial.services;

public interface OnlinePaymentService  {

    double paymentFee(double amount);
    double interest(double amount, int months);
}
