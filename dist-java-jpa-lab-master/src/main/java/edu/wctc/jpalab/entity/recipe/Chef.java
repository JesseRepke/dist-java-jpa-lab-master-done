package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;

@Entity
@Table(name = "chef", schema = "recipe")
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chef_id")
    private Integer id;

    @Column(name = "chef_firstname")
    private String firstName;

    @Column(name = "chef_lastname")
    private String lastName;

    @Column(name = "chef_avatar")
    private String avatar;

}
