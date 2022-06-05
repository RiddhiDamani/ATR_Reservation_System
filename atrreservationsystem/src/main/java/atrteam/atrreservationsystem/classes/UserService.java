package atrteam.atrreservationsystem.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import atrteam.atrreservationsystem.repositories.RoleRepository;
import atrteam.atrreservationsystem.repositories.UsersRepository;

@Service
public class UserService {
    
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    public void saveUserWithDefaultRole(Users user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
	    String encodedPassword = encoder.encode(user.getPasswordHash());
	    user.setPasswordHash(encodedPassword);
        user.setEnabled(true);

        Role roleUser = roleRepository.findByRoleName("USER");
        user.addRole(roleUser);
        usersRepository.save(user); 
        
    }
}
