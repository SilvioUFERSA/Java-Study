package service;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuitoa = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i ++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuitoa, i);
            double fee = onlinePaymentService.PaymentFee(basicQuitoa + interest);
            double quota = basicQuitoa + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
