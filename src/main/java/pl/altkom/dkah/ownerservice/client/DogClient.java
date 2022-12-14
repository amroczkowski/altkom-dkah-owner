package pl.altkom.dkah.ownerservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.altkom.dkah.ownerservice.client.model.Dog;

@FeignClient(value = "dogClient", url = "${pl.altkom.dkah.dog-service.url}")
public interface DogClient {

    @GetMapping("/dog/owner/{ownerId}")
    List<Dog> getOwnerDogs(@PathVariable("ownerId") final Long ownerId);

    @GetMapping("/dog")
    List<Dog> getDogs();
}
