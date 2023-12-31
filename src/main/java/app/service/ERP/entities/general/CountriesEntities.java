package app.service.ERP.entities.general;

import app.service.ERP.entities.crm.LeadEntities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "countries")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountriesEntities {

    @Id
    @Column(name = "countries_id")
    public long countriesId;

    @Column(name = "countries_name")
    public String countriesName;

    @Column(name = "countries_short_name")
    public String countriesShortName;

    @OneToMany(targetEntity = LeadEntities.class, mappedBy = "lead_id", fetch = FetchType.LAZY)
    private Set<LeadEntities> leads;

    @OneToMany(targetEntity = StatesEntities.class, mappedBy = "state_id", fetch = FetchType.LAZY)
    private Set<StatesEntities> states;
}
