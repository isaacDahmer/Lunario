package br.com.lunario.repository;

import br.com.lunario.model.Rewind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewindRepository extends JpaRepository<Rewind, Long> {
}
