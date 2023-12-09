package app.service.ERP.entities.general;

import app.service.ERP.entities.crm.LeadEntities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "post_code")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostCodeEntities implements Serializable {

    @Id
    @Column(name = "post_code_id")
    private UUID postCodeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cities_id", nullable = false)
    private CitiesEntities cities;

    @OneToMany(targetEntity = LeadEntities.class, mappedBy = "lead_id", fetch = FetchType.LAZY)
    private Set<LeadEntities> leads;
}
