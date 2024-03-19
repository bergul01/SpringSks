package SKS.SKS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SKS.SKS.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
