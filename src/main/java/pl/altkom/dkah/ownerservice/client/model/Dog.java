package pl.altkom.dkah.ownerservice.client.model;

import lombok.Data;

@Data
public class Dog {

    private Long id;
    private String name;
    private String breed;
    private Long ownerId;
}
