package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;


public class RentalService {
    private double PricePerHour;
    private double PricePerDay;

    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        PricePerHour = pricePerHour;
        PricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minutes / 60.0;

        double basicPayment;
        if (hour <= 12.0){
         basicPayment = PricePerHour * Math.ceil(hour);
        }
        else {
            basicPayment = PricePerDay * Math.ceil(hour / 24.0);
        }
        double Tax = taxService.Tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, Tax));
    }
}
