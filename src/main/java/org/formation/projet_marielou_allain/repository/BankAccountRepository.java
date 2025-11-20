package org.formation.projet_marielou_allain.repository;

import org.formation.projet_marielou_allain.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
