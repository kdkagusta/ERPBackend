package app.service.ERP.entities.crm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "leads")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeadEntities implements Serializable {

    @Id
    @Column(name = "lead_id")
    private UUID leadId;

    @Column(name = "lead_salutation")
    private String leadSalutation;

    @Column(name = "lead_first_name")
    private String leadFirstname;

    @Column(name = "lead_last_name")
    private String leadLastname;

    @Column(name = "lead_phone")
    private String leadPhone;

    @Column(name = "lead_email")
    private String leadEmail;

    @Column(name = "lead_title")
    private String leadTitle;

    @Column(name = "follow_up")
    private boolean leadFollowUp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_rating_id", nullable = false)
    private RatingEntities rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_status_id", nullable = false)
    private StatusCrmEntities status;

    @Column(name = "address")
    private String leadAddress;

    @Column(name = "website")
    private String leadWebsite;

}