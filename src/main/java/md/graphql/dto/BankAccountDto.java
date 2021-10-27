package md.graphql.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import md.graphql.bank.Currency;

@Data
public class BankAccountDto {
    private Long id;
    Currency currency;
    private String name;
}
