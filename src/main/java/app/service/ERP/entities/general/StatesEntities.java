package app.service.ERP.entities.general;

import app.service.ERP.entities.crm.LeadEntities;
import app.service.ERP.entities.crm.RatingEntities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "states")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatesEntities {

    @Id
    @Column(name = "state_id")
    public long stateId;

    @Column(name = "state_name")
    public String stateName;

    @Column(name = "state_short_name")
    public String stateShortName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private CountriesEntities countries;

    @OneToMany(targetEntity = LeadEntities.class, mappedBy = "lead_id", fetch = FetchType.LAZY)
    private Set<LeadEntities> leads;

    @OneToMany(targetEntity = CitiesEntities.class, mappedBy = "cities_id", fetch = FetchType.LAZY)
    private Set<CitiesEntities> cities;
}
