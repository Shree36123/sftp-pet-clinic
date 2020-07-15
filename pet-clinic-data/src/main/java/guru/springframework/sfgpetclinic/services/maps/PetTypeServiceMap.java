package guru.springframework.sfgpetclinic.services.maps;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CurdService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
	
	public Set<PetType> findAll(){
		return super.findAll();
	}
	public PetType findById(Long id) {
		return super.findById(id);
	}
	public PetType saveAll(Long id, PetType object) {
		return super.saveAll(id, object);
	}
	public void delete(PetType Object) {
		super.delete(Object);
	}
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	public PetType save(PetType object) {
		return super.save(object);
	}
}
