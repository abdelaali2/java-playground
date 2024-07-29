package tech.ibrahim.playground.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.ibrahim.playground.entities.Human;
import tech.ibrahim.playground.repositories.HumanRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HumanService {
//    All business logic implemented here
    private final HumanRepository repository;

    public List<Human> getAllHumans() {
        return repository.findAll();
    }

    public Human getHumanById(int id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Human addHuman(Human newHuman) {
        return repository.save(newHuman);
    }

    public void deleteHumanById(int id) {
        repository.deleteById(id);
    }
}
