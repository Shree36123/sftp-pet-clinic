package guru.springframework.sfgpetclinic.services.maps;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
	
	public Set<Pet> findAll(){
		return super.findAll();
	}
	public Pet findById(Long id) {
		return super.findById(id);
	}
	public Pet saveAll(Long id, Pet object) {
		return super.saveAll(id, object);
	}
	public void delete(Pet Object) {
		super.delete(Object);
	}
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	public Pet save(Pet object) {
		return super.save(object);
	}
}
