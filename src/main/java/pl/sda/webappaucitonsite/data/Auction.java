package pl.sda.webappaucitonsite.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Auction {

    private String tittle;
    private String description;
    private Category Category;
    private Double minAmount;
    private Double buyNowAmount;
    private boolean promoted;
    private Address localization;
    private LocalDate startDate;
    private LocalDate endDay;
    private int visitCounter;

}
