package md.graphql.resolver;

//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import md.graphql.bank.BankAccount;
import md.graphql.bank.Client;
import md.graphql.bank.Currency;
import md.graphql.bank.DepositAccount;
import md.graphql.dto.BankAccountDto;
//import org.checkerframework.checker.units.qual.C;
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
    public Client client(Long id)
    {
        return new Client();
    }
}
