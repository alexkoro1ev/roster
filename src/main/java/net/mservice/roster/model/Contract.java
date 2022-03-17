package net.mservice.roster.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Embeddable
@Getter
@Setter
public class Contract {

    private Boolean isCurrent;

    @Temporal(TemporalType.DATE)
    private Date employedDate;

    private String employedOrder;

    private String employedContractNumber;

    @Temporal(TemporalType.DATE)
    private Date employedContractDate;

    @Temporal(TemporalType.DATE)
    private Date firedDate;

    private String firedOrder;

    private String additionalInfo;
}
