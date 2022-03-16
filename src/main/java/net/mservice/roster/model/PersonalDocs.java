package net.mservice.roster.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Embeddable
public class PersonalDocs {

        private String passport;

        private String passportIssuer;

        @Temporal(TemporalType.DATE)
        private Date passportIssueDate;

        private String inn;

        private String snils;
}
