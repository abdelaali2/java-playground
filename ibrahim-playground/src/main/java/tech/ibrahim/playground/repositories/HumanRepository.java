package tech.ibrahim.playground.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ibrahim.playground.entities.Human;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {
}
