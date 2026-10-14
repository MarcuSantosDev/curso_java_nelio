package secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.services;

import secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.entities.CarRental;
import secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private BrasilTaxService brasilTaxService;

    public RentalService(double pricePerHour, double pricePerDay, BrasilTaxService brasilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brasilTaxService = brasilTaxService;
    }

    public void processInvoid(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;
        double basicPayment;
        if(hours<=12.0){
            basicPayment = pricePerHour * Math.ceil(hours); // ceil arredonda pra cima
        }
        else{
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax  = brasilTaxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
    }


}
