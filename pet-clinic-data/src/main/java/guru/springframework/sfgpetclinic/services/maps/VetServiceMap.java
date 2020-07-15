package guru.springframework.sfgpetclinic.services.maps;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CurdService;
import guru.springframework.sfgpetclinic.services.VetService;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	public Set<Vet> findAll(){
		return super.findAll();
	}
	public Vet findById(Long id) {
		return super.findById(id);
	}
	public Vet save(Vet object) {
		return super.save(object);
	}
	public Vet saveAll(Long id, Vet object) {
		return super.saveAll(id, object);
	}
	public void delete(Vet Object) {
		super.delete(Object);
	}
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
