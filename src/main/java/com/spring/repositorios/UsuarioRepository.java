package com.spring.repositorios;

import com.spring.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByTarjetaMembresiaId(Long tarjetaMembresiaId);
}
