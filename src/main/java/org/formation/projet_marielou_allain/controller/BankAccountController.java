package org.formation.projet_marielou_allain.controller;

import lombok.RequiredArgsConstructor;
import org.formation.projet_marielou_allain.entity.BankAccount;
import org.formation.projet_marielou_allain.service.BankAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BankAccountController {
    private final BankAccountService service;

    @GetMapping("/bank-accounts")
    List<BankAccount> getBankAccounts(){
        return service.getBankAccounts();
    };
    @PostMapping("/bank-accounts")
    BankAccount createBankAccount(@RequestBody BankAccount bankAccount){
        return service.createBankAccount(bankAccount);
    };

    @GetMapping("/bank-accounts/{id}")
    ResponseEntity<BankAccount> getBankAccountById(@PathVariable Long id){
        return service.getBankAccount(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    };

    @PutMapping("/bank-accounts/{id}")
    ResponseEntity<BankAccount> updateBankAccountById(@PathVariable Long id, @RequestBody BankAccount newData){
        return service.updateBankAccount(id, newData).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    };

    @DeleteMapping("/bank-accounts/{id}")
    ResponseEntity<Void> deleteBankAccountById(@PathVariable Long id){
        service.deleteBankAccount(id);
        return ResponseEntity.noContent().build();
    };
}
