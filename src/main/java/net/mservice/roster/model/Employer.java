package net.mservice.roster.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Column(name = "sex")
    private String sex;

    @Column(name = "profession")
    private String profession;

    @Column(name = "full_years")
    private int fullYears;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "region", column = @Column(name = "home_region")),
            @AttributeOverride(name = "county", column = @Column(name = "home_county")),
            @AttributeOverride(name = "city", column = @Column(name = "home_city")),
            @AttributeOverride(name = "street", column = @Column(name = "home_street")),
            @AttributeOverride(name = "houseNumber", column = @Column(name = "home_house_number")),
            @AttributeOverride(name = "apartmentNumber", column = @Column(name = "home_apartment_number"))
    })
    private Home home;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "passport", column = @Column(name = "passport")),
            @AttributeOverride(name = "passportIssuer", column = @Column(name = "passport_issuer")),
            @AttributeOverride(name = "passportIssueDate", column = @Column(name = "passport_issue_date")),
            @AttributeOverride(name = "inn", column = @Column(name = "inn")),
            @AttributeOverride(name = "snils", column = @Column(name = "snils"))
    })
    private PersonalDocs personalDocs;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "isCurrent", column = @Column(name = "is_current_worker")),
            @AttributeOverride(name = "employedDate", column = @Column(name = "employed_date")),
            @AttributeOverride(name = "employedOrder", column = @Column(name = "employed_order")),
            @AttributeOverride(name = "employedContractNumber", column = @Column(name = "employed_contract_number")),
            @AttributeOverride(name = "employedContractDate", column = @Column(name = "employed_contract_date")),
            @AttributeOverride(name = "firedDate", column = @Column(name = "fired_date")),
            @AttributeOverride(name = "firedOrder", column = @Column(name = "fired_order")),
            @AttributeOverride(name = "additionalInfo", column = @Column(name = "additional_info"))
    })
    private Contract contract;
}
