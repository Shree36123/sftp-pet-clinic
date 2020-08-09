package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

	Set<Specialist> specialistes;

	public Set<Specialist> getSpecialistes() {
		return specialistes;
	}

	public void setSpecialistes(Set<Specialist> specialistes) {
		this.specialistes = specialistes;
	}
	
	
}
