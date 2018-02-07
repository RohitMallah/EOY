package Deloitte.Eomployees.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Deloitte.Eomployees.Models.EmployeeProfile;

@Repository
@Transactional
public interface ProfileRepository extends JpaRepository<EmployeeProfile, Long> {

}
