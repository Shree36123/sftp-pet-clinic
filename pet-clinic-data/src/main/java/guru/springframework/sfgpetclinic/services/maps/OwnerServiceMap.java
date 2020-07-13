package guru.springframework.sfgpetclinic.services.maps;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CurdService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CurdService<Owner, Long> {
	
	public Set<Owner> findAll(){
		return super.findAll();
	}
	public Owner findById(Long id) {
		return super.findById(id);
	}
	public Owner saveAll(Long id, Owner object) {
		return super.saveAll(id, object);
	}
	public void delete(Owner Object) {
		super.delete(Object);
	}
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
