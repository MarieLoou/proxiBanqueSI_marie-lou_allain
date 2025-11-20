package org.formation.projet_marielou_allain.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.formation.projet_marielou_allain.entity.BankAccount;
import org.formation.projet_marielou_allain.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BankAccountServiceImpl implements BankAccountService {
    private final BankAccountRepository repository;

    @PostConstruct
    private void initDb(){
        repository.saveAll(
                List.of(
                        new BankAccount(),
                        new BankAccount(),
                        new BankAccount(),
                        new BankAccount(),
                        new BankAccount()
                )
        );
    }

    @Override
    public List<BankAccount> getBankAccounts() {
        return repository.findAll();
    }

    @Override
    public BankAccount createBankAccount(BankAccount client) {
        return repository.save(client);
    }

    @Override
    public Optional<BankAccount> getBankAccount(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteBankAccount(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<BankAccount> updateBankAccount(Long id, BankAccount newData) {
        BankAccount client = repository.findById(id).orElseThrow();
        return Optional.of(repository.save(client));
    }

}
