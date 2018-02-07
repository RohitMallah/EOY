package Deloitte.Eomployees.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Deloitte.Eomployees.Models.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>{
	User findByuserName(String username);
}
