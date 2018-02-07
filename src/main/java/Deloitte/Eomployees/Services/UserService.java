package Deloitte.Eomployees.Services;

import Deloitte.Eomployees.Business.SignUpForm;
import Deloitte.Eomployees.Models.User;

public interface UserService {
	void save(SignUpForm signup);
    User findByuserName(String username);

}
