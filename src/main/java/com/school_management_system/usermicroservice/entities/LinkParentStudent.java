package com.school_management_system.usermicroservice.entities;

import com.school_management_system.usermicroservice.constants.RelationShipType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name  = "tbl_link_parent_student")
public class LinkParentStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User parent;

    @OneToOne
    private User student;

    @Enumerated(EnumType.STRING)
    private RelationShipType relationShipType;
}
