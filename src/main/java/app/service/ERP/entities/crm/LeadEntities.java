package app.service.ERP.entities.crm;

import app.service.ERP.entities.general.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_countries_id", nullable = false)
    private CountriesEntities countries;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_state_id", nullable = false)
    private StatesEntities states;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_cities_id", nullable = false)
    private CitiesEntities cities;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_post_code_id", nullable = false)
    private PostCodeEntities postCode;

    @Column(name = "lead_no_of_employee")
    private String leadNoEmployee;

    @Column(name = "lead_annual_revenue")
    private String leadAnnualRevenue;
    
    @Column(name = "lead_source")
    private String leadSource;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leads_industries_id", nullable = false)
    private CompanyIndustriesEntities companyIndustries;

    @Column(name = "lead_description")
    private String leadDesc;
}