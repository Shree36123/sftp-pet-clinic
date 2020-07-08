package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
	Owner findByFirstName(String firstName);
	Owner findByID(Long id);
	void saveAll(Owner owner);
	Set<Owner> findAll();
}
