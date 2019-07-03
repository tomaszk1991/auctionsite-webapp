package pl.sda.webappaucitonsite.data;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Address {


    private String street;
    private String buildingNumber;
    private String houseNumber;
    private String province;
    private String city;
    private String ZIPCode;


}


