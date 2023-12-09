package app.service.ERP.entities.general;

import app.service.ERP.entities.crm.LeadEntities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "company_industry")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyIndustriesEntities {

    @Id
    @Column(name = "industry_id")
    private int industriesId;

    @Column(name = "industry_name")
    private String industriesName;

    @OneToMany(targetEntity = LeadEntities.class, mappedBy = "lead_id", fetch = FetchType.LAZY)
    private Set<LeadEntities> leads;
}
