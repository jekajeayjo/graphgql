package md.graphql.mapper;

import md.graphql.bank.BankAccount;
import md.graphql.dto.BankAccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper {
    BankAccountDto mapToDto(BankAccount  bankAccount);
    BankAccount mapToEntity (BankAccountDto bankAccountDto);
}
