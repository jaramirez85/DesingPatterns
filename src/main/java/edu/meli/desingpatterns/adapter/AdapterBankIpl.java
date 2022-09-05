package edu.meli.desingpatterns.adapter;

import edu.meli.desingpatterns.adapter.service.*;

public class AdapterBankIpl implements AdaptaderBankService {
    public AdapterBankIpl(BankService bankService){
        this.bankService = bankService;
    }
    private final BankService bankService ;
    @Override
    public  User getBankService(int accountNumber) {
        BankData bankData = bankService.findByAccountNumber(accountNumber);
        return new User(bankData.getAccount(),bankData.getName(),bankData.getBalance());
    }
}
