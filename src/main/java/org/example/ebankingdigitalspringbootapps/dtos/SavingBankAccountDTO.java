package org.example.ebankingdigitalspringbootapps.dtos;

import lombok.Data;
import org.example.ebankingdigitalspringbootapps.enums.AccountStatus;

import java.util.Date;
@Data
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customer;
    private double interestRate;
}
