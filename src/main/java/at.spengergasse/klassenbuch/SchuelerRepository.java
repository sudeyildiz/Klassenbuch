package at.spengergasse.klassenbuch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerRepository extends JpaRepository<SSchueler, Integer> {
}
