package pl.sda.webappaucitonsite.data;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String buildingNumber;
    private String houseNumber;
    private String province;
    private String city;
    private String ZIPCode;

    public Address(String street, String buildingNumber, String province, String city, String ZIPCode) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.province = province;
        this.city = city;
        this.ZIPCode = ZIPCode;
    }
}


