package app.service.ERP.entities.general;

import app.service.ERP.entities.crm.LeadEntities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "cities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CitiesEntities {

    @Id
    @Column(name = "cities_id")
    public long citiesId;

    @Column(name = "cities_name")
    public String citiesName;

    @Column(name = "cities_short_name")
    public String citiesShortName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id", nullable = false)
    private StatesEntities states;

    @OneToMany(targetEntity = PostCodeEntities.class, mappedBy = "post_code_id", fetch = FetchType.LAZY)
    private Set<PostCodeEntities> postCode;

    @OneToMany(targetEntity = LeadEntities.class, mappedBy = "lead_id", fetch = FetchType.LAZY)
    private Set<LeadEntities> leads;
}
