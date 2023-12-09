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
}
