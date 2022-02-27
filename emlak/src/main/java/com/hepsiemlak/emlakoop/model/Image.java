package com.hepsiemlak.emlakoop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.util.UUID;

@Getter
@Setter
@ToString
@Embeddable
@NoArgsConstructor
public class Image {
    private String id;
    private String name;
    private String path;
    private String format;
    private Integer size;
}
