package app.service.ERP.entities.crm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "companies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompaniesEntities {

    @Id
    @Column(name = "companies_id")
    private long companiesId;

    @Column(name = "companies_name")
    private String companiesName;

    @Column(name = "companies_addr")
    private String companiesAddr;

    @Column(name = "companies_phone")
    private String companiesPhone;

    @Column(name = "companies_email")
    private String companiesEmail;
}
