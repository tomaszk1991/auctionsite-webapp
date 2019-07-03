package pl.sda.webappaucitonsite.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Purchase {
    private Auction auction;
    private User user;
    private Double amount;
}
