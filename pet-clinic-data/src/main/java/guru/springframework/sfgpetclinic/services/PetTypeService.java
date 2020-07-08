package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.PetType;

public interface PetTypeService {
	PetType findByID(Long id);
	void saveAll(PetType PetType);
	Set<PetType> findAll();
}
