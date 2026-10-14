package secao16_interfaces.problemaEstacionamento.services;

import secao16_interfaces.problemaEstacionamento.entities.CarRental;
import secao16_interfaces.problemaEstacionamento.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
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

        double tax  = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
    }


}
