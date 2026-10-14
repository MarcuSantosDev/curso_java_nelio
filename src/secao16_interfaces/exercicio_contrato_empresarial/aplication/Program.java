package secao16_interfaces.exercicio_contrato_empresarial.aplication;

import secao16_interfaces.exercicio_contrato_empresarial.entities.Contract;
import secao16_interfaces.exercicio_contrato_empresarial.entities.Installment;
import secao16_interfaces.exercicio_contrato_empresarial.services.ContractService;
import secao16_interfaces.exercicio_contrato_empresarial.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.println("Número do contrato");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.println("Valor do Contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.println("Entre com o número de parcelas: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract,months);

        System.out.println("Parcelas : ");
        for(Installment installment:contract.getInstallments()){
            System.out.println(installment);
        }



        sc.close();
    }
}
