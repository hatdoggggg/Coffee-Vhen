package com.tumbaga_project.Coffee_Vhen.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tumbaga_project.Coffee_Vhen.Model.Role;
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role>findByName(String name);
}
