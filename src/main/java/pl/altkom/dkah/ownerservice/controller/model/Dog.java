package pl.altkom.dkah.ownerservice.controller.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Dog {
    private Long id;

    private String name;
    private String breed;
    private Long ownerId;
}