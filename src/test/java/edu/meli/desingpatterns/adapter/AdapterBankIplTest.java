package edu.meli.desingpatterns.adapter;

import edu.meli.desingpatterns.adapter.AdaptaderBankService;
import edu.meli.desingpatterns.adapter.AdapterBankIpl;
import edu.meli.desingpatterns.adapter.User;
import edu.meli.desingpatterns.adapter.service.BankService;
import org.junit.jupiter.api.Assertions;


class AdapterBankIplTest {

    @org.junit.jupiter.api.Test
    void dadoUnAccountNumberReturnUser() {
        AdaptaderBankService adapterBankIpl = new AdapterBankIpl(new BankService());
        User user_ = adapterBankIpl.getBankService(1);
        Assertions.assertEquals(1,user_.getId());
    }
}