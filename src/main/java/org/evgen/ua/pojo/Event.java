package org.evgen.ua.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {

    private Long id;

    private final String name;

    private final String date;

    private final String time;

    private final Location location;

    private final String imageUrl;

    private final String description;
}
