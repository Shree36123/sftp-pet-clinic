package guru.springframework.sfgpetclinic.services.maps;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Specialist;
import guru.springframework.sfgpetclinic.services.SpecialistService;

public class SpecialistMapService extends AbstractMapService<Specialist, Long>implements SpecialistService {

	@Override
	public Set<Specialist> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Specialist findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Specialist saveAll(Long id, Specialist object) {
		// TODO Auto-generated method stub
		return super.saveAll(id, object);
	}

	@Override
	public Specialist save(Specialist object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Specialist object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
