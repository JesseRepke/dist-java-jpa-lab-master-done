package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.*;

@Entity
@Table(name = "collector", schema = "collection")
public class Collector {

    @Id
    @GeneratedValue(strategy = GenerationiType.IDENTITY)
    private Integer id;

    @column(name = "collector_id")
    private String firstName;

    @Column(name = "collector_lastname")
    private String lastName;

    @Column(name = "collector_avatar")
    private String avatar;

}
