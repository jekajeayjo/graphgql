package md.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import md.graphql.bank.BankAccount;
import md.graphql.bank.Currency;
import md.graphql.bank.DepositAccount;
import md.graphql.dto.BankAccountDto;
import org.springframework.stereotype.Component;

@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(Long id) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setCurrency(Currency.USD);
        bankAccount.setId(id);
        bankAccount.setName("Asd");
        return bankAccount;
    }

    public DepositAccount depositAccount(Long id) {
        DepositAccount depositAccount=new DepositAccount();
        depositAccount.setId(id);
        depositAccount.setName("asdasd");
        return depositAccount;
    }
}
