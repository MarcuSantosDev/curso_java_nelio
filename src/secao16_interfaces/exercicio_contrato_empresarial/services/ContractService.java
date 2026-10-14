package secao16_interfaces.exercicio_contrato_empresarial.services;

import secao16_interfaces.exercicio_contrato_empresarial.entities.Contract;
import secao16_interfaces.exercicio_contrato_empresarial.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for(int i=1; i<= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double quota = basicQuota + interest;
            quota += onlinePaymentService.paymentFee(quota);

            contract.getInstallments().add(new Installment(dueDate,quota));
        }
    }
}
