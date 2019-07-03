package pl.sda.webappaucitonsite.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuctionObservation {
    private Auction auction;
    private User user;
}
