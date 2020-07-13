package guru.springframework.sfgpetclinic.services.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
protected Map<ID, T> map=new HashMap<>();
	Set<T> findAll(){
		 return (new HashSet<>(map.values()));
	}
	T findById(ID id) {
		return map.get(id);		
	}

	T saveAll(ID id,T Object) {
		return map.put(id, Object);
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}