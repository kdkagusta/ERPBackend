package app.service.ERP.entities.general;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
