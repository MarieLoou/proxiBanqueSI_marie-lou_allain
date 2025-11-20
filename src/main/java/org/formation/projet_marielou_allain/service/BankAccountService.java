package org.formation.projet_marielou_allain.service;

import org.formation.projet_marielou_allain.entity.BankAccount;

import java.util.List;
import java.util.Optional;

public interface BankAccountService {

    List<BankAccount> getBankAccounts ();

    BankAccount createBankAccount(BankAccount agency);

    Optional<BankAccount> getBankAccount(Long id);

    void deleteBankAccount(Long id);

    Optional<BankAccount> updateBankAccount(Long id, BankAccount newData);
}
