package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {
	
	Vet findByID(Long id);
	void saveAll(Vet Vet);
	Set<Vet> findAll();
}
