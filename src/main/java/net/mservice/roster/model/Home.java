package net.mservice.roster.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Home {

    private String region;
    private String county;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
}
