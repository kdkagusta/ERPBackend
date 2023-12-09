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
}
