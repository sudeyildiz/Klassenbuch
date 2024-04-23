package at.spengergasse.klassenbuch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<LLehrer, Integer> {
}
