package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CurdService<T, ID>  {
	public Set<T> findAll();
	public T findById(ID id);
	public T saveAll(ID id,T object);
	public T save(T object);
	public void delete(T Object);
	public void deleteById(ID id);

}
