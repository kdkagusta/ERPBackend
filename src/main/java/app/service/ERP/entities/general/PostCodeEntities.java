package app.service.ERP.entities.general;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
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
}
