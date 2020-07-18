package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.maps.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.maps.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{
	
	public OwnerService ownerService;
	public VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Owner is loading ");
		Owner owner1=new Owner();
		owner1.setFirstName("Shree");
		owner1.setLastName("Ranga");
		//owner1.setId(1L);
		ownerService.save(owner1);
		Owner owner2=new Owner();
		owner2.setFirstName("2nd Owner");
		owner2.setLastName("LastName");
		//owner2.setId(2L);
		ownerService.save(owner2);
		System.out.println("Vet is loading ");
		Vet vet1=new Vet();
		vet1.setFirstName("vet1");
		vet1.setLastName("Last");
		//vet1.setId(1L);
		vetService.save(vet1);
		Vet vet2=new Vet();
		vet2.setFirstName("vet2");
		vet2.setLastName("Last");
		//vet2.setId(2L);
		vetService.save(vet2);
		
	}
	
	

}
