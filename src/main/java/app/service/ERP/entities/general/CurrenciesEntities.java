package app.service.ERP.entities.general;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "currencies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrenciesEntities {

    @Id
    @Column(name = "currencies_id")
    private String currenciesId;

    @Column(name = "currencies_name")
    private String currenciesName;

    @Column(name = "currencies_symbol")
    private String currenciesSymbol;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "countries_id", nullable = false)
    private CountriesEntities countries;
}
