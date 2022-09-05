package edu.meli.desingpatterns.adapter;

import edu.meli.desingpatterns.adapter.service.*;

public class Client {

    public static void main(String[] args) {

       System.out.println("---------Accediendo directo servicio------------");
        BankService service = new BankService();
        BankData bankData;
        for ( int cuenta = 1; cuenta<=4; cuenta++) {
            bankData = service.findByAccountNumber(cuenta);
            System.out.println("-Account No." + bankData.getAccount() + " Name: " + bankData.getName() + " Balance " + bankData.getBalance() + " Type :"+bankData.getType());
        }

        System.out.println("---------Accediendo con adaptador------------");
        AdaptaderBankService adapterBankIpl = new AdapterBankIpl(new BankService());
        for ( int cuenta = 1; cuenta<=4; cuenta++) {
            User user =  adapterBankIpl.getBankService(cuenta);
            System.out.println("-Account No." + user.getId() + " Name: " + user.getName() + " Balance " + user.getTotalAvailable());
        }
    }
}