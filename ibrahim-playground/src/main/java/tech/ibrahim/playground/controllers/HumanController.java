package tech.ibrahim.playground.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.ibrahim.playground.entities.Human;
import tech.ibrahim.playground.services.HumanService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/human")
// The user will send hos requests on http://address:port/human
public class HumanController {
    private final HumanService service;

    @GetMapping("/all")
    public List<Human> getAll() {
        return service.getAllHumans();
    }

    @GetMapping("/{id}")
    public Human getHumanById(@PathVariable int id) {
        return service.getHumanById(id);
    }

    @PostMapping("")
    public Human createHuman(@RequestBody Human newHuman) {
        return service.addHuman(newHuman);
    }

    @DeleteMapping("/{id}")
    public void deleteHuman(@PathVariable int id) {
        service.deleteHumanById(id);
    }

}
