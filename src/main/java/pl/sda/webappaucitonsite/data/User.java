package pl.sda.webappaucitonsite.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.sda.webappaucitonsite.enums.AccountStatus;
import pl.sda.webappaucitonsite.enums.AccountType;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {
    private String login;
    private String password;
    private String accountName;
    private Address address;
    private LocalDate registerDate;
    private AccountStatus accountStatus;
    private String avatar;
    private AccountType accountType;

}
