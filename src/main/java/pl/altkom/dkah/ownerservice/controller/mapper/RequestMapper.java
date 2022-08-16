package pl.altkom.dkah.ownerservice.controller.mapper;

import pl.altkom.dkah.ownerservice.controller.model.CreateOwnerRequest;
import pl.altkom.dkah.ownerservice.controller.model.UpdateOwnerRequest;
import pl.altkom.dkah.ownerservice.repository.model.Owner;

public class RequestMapper {

    public static Owner bind(final CreateOwnerRequest request) {
        final Owner owner = new Owner();
        owner.setFirstName(request.getFirstName());
        owner.setLastName(request.getLastName());
        return owner;
    }

    public static Owner bind(final UpdateOwnerRequest request, final Owner destination) {
        destination.setFirstName(request.getFirstName());
        destination.setLastName(request.getLastName());
        return destination;
    }
}
