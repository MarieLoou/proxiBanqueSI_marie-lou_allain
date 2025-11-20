package org.formation.projet_marielou_allain.service;

import org.formation.projet_marielou_allain.entity.BankCard;

import java.util.List;
import java.util.Optional;

public interface BankCardService {

    List<BankCard> getBankCards ();

    BankCard createBankCard(BankCard agency);

    Optional<BankCard> getBankCard(Long id);

    Optional<BankCard> deleteBankCard(Long id);

    Optional<BankCard> updateBankCard(Long id, BankCard newData);
}
