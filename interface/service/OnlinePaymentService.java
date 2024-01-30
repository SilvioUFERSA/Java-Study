package service;

public interface OnlinePaymentService {
    Double PaymentFee(Double amount);
    Double interest (Double amount, Integer months);
}
