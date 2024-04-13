package com.teo.WOPEMAUS.Direccion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Innecesario
public interface DireccionRepository extends JpaRepository<Direccion, Long>{
    
}
