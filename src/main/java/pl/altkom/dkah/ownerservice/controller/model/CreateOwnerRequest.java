package pl.altkom.dkah.ownerservice.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateOwnerRequest {

    private String firstName;
    private String lastName;
}
