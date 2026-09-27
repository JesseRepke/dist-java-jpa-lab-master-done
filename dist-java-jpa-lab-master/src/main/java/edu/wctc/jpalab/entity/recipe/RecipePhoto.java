package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "recipe")
public class RecipePhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "photo_recipe_id")
    private Recipe recipe;

    @Column(name = "photo_filename")
    private String filename;

    @Column(name = "photo_caption")
    private String caption;

    @Column(name = "photo_datestamp")
    private LocalDateTime datestamp;

    @Column(name = "photo_visible")
    private String visible;
}
