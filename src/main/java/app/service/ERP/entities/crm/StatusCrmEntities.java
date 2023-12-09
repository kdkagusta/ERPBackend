package app.service.ERP.entities.crm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "status_crm")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusCrmEntities implements Serializable {

    @Id
    @Column(name = "status_id")
    private UUID statusId;

    @Column(name = "status_name")
    private String statusName;

    @OneToMany(targetEntity = LeadEntities.class, mappedBy = "lead_id", fetch = FetchType.LAZY)
    private Set<LeadEntities> leads;
}
