package com.dosi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ENSEIGNANT")
public class Enseignant {
    @Id
    @Column(name = "NO_ENSEIGNANT", nullable = false)
    private Long id;

    @Column(name = "\"TYPE\"", nullable = false, length = 5)
    private String type;

    @Column(name = "SEXE", nullable = false, length = 1)
    private String sexe;

    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @Column(name = "ADRESSE", nullable = false)
    private String adresse;

    @Column(name = "CODE_POSTAL", nullable = false, length = 10)
    private String codePostal;

    @Column(name = "VILLE", nullable = false)
    private String ville;

    @Column(name = "PAYS", nullable = false, length = 5)
    private String pays;

    @Column(name = "MOBILE", nullable = false, length = 20)
    private String mobile;

    @Column(name = "TELEPHONE", length = 20)
    private String telephone;

    @Column(name = "EMAIL_UBO", nullable = false)
    private String emailUbo;

    @Column(name = "EMAIL_PERSO")
    private String emailPerso;

}