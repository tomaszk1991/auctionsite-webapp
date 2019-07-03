package pl.sda.webappaucitonsite.data;
import lombok.Data;
import pl.sda.webappaucitonsite.enums.AccountStatus;
import pl.sda.webappaucitonsite.enums.AccountType;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String accountName;
    private Address address;
    private LocalDate registerDate;
    private AccountStatus accountStatus;
    private String avatar;
    private AccountType accountType;



}
