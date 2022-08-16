package pl.altkom.dkah.ownerservice.client.mapper;

import java.util.List;
import java.util.stream.Collectors;

import pl.altkom.dkah.ownerservice.controller.model.Dog;

public class ResponseMapper {

    public static List<Dog> map(final List<pl.altkom.dkah.ownerservice.client.model.Dog> dogs) {
        return dogs.stream()
                .map(ResponseMapper::map)
                .collect(Collectors.toList());
    }

    private static Dog map(final pl.altkom.dkah.ownerservice.client.model.Dog dog) {
        final Dog result = new Dog();
        result.setBreed(dog.getBreed());
        result.setId(dog.getId());
        result.setName(dog.getName());
        result.setOwnerId(dog.getOwnerId());
        return result;
    }
}
