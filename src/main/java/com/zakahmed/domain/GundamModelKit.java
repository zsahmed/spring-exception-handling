package com.zakahmed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Created by zahmed on 9/23/17.
 */

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class GundamModelKit {

    private int id;
    private String imageUrl;
    private String link;
    private String price;
    private String release_date;
    private String series;
    private String title;

}
