package Deloitte.Eomployees.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import Deloitte.Eomployees.Business.SignUpForm;
import Deloitte.Eomployees.Models.EmployeeProfile;
import Deloitte.Eomployees.Models.User;
import Deloitte.Eomployees.Repository.ProfileRepository;
import Deloitte.Eomployees.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private ProfileRepository profileRepo;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void save(SignUpForm signup) {
		
		EmployeeProfile profile = profileRepo.save(new EmployeeProfile(signup.getEmpName(), 
				signup.getDesignation(), signup.getsL(), signup.getRole()));
		User user = new User();
		user.setUserName(signup.getEmplNo());
		user.setPassword(bCryptPasswordEncoder.encode(signup.getPassword()));
		user.setProfile(profile);
		userRepo.save(user);
	}

	@Override
	public User findByuserName(String username) {
		// TODO Auto-generated method stub
		return userRepo.findByuserName(username);
	}

}
