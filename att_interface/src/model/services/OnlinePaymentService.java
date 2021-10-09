package model.services;

public interface OnlinePaymentService {

    public Double paymentFee(Double amount);
    public Double interest(double amount, int months);

}
