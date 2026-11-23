package com.senai.oficina.Repository;

import com.senai.oficina.Entity.Pecas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PecasRepository extends JpaRepository<Pecas, Integer> {
}
