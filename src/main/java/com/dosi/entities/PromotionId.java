package com.dosi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PromotionId implements Serializable {
    private static final long serialVersionUID = -5037787922242894967L;
    @Column(name = "ANNEE_UNIVERSITAIRE", nullable = false, length = 10)
    private String anneeUniversitaire;

    @Column(name = "CODE_FORMATION", nullable = false, length = 8)
    private String codeFormation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PromotionId entity = (PromotionId) o;
        return Objects.equals(this.anneeUniversitaire, entity.anneeUniversitaire) &&
                Objects.equals(this.codeFormation, entity.codeFormation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anneeUniversitaire, codeFormation);
    }

}