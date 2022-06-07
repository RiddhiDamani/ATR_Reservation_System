package atrteam.atrreservationsystem.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import atrteam.atrreservationsystem.repositories.UsersRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = usersRepository.getUserByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        
        return new UserDetailsImpl(user);
    }
    
}
