package atrteam.atrreservationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import atrteam.atrreservationsystem.classes.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
    @Query("SELECT r FROM Role r where r.roleName = ?1")
    public Role findByRoleName(String roleName);
}
