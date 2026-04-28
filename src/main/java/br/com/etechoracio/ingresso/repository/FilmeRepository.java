package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
