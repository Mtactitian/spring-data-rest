package md.alexb.springdatarest.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "street_address2")
    private String streetAddress2;

    private String city;

    private String state;

    private String country;

    @Column(name = "postal_code")
    private String postalCode;
}
