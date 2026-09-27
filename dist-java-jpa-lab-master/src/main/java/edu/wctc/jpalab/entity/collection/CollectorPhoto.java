package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "collection")
public class CollectorPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "photo_collector_id")
    private Collector collector;

    @Column(name = "photo_filename")
    private String filename;

    @Column(name = "photo_datestamp")
    private LocalDateTime datestamp;

    @Column(name = "photo_visible")
    private String visible;
}
