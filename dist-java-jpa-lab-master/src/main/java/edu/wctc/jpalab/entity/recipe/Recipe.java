package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe", schema = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chef;

    @Column(name = "recipe_title")
    private String title;

    @Column(name = "recipe_description")
    private String description;
}
