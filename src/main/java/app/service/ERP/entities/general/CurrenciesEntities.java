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
}
