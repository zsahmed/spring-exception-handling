package com.zakahmed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by zahmed on 9/23/17.
 */

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
public class GundamModelKit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imageUrl;
    private String link;
    private String price;
    private String release_date;
    private String series;
    private String title;

}
