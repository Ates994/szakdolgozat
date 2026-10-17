package hu.kido.backend.repository;

import hu.kido.backend.entity.Pass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepository extends JpaRepository<Pass, Long> {
}
