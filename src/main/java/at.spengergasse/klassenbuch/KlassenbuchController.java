package at.spengergasse.klassenbuch;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class KlassenbuchController {

    private final LehrerRepository lehrerRepository;
    private final SchuelerRepository schuelerRepository;


    public KlassenbuchController(LehrerRepository lehrerRepository, SchuelerRepository schuelerRepository) {
        this.lehrerRepository = lehrerRepository;
        this.schuelerRepository = schuelerRepository;
    }

    // Lehrer speichern
    @PostMapping("/lehrer")
    public LLehrer saveLehrer(@RequestBody LLehrer lehrer) {
        return lehrerRepository.save(lehrer);
    }

    // Schüler speichern
    @PostMapping("/schueler")
    public SSchueler saveSchueler(@RequestBody SSchueler schueler) {
        return schuelerRepository.save(schueler);
    }

    // Alle Lehrer abrufen
    @GetMapping("/lehrer")
    public List<LLehrer> getAlleLehrer() {
        return lehrerRepository.findAll();
    }

    // Alle Schüler abrufen
    @GetMapping("/schueler")
    public List<SSchueler> getAlleSchueler() {
        return schuelerRepository.findAll();
    }


    // Lehrer aktualisieren
    @GetMapping("/editLehrer/{id}")
    public String editLehrer(@PathVariable int id, Model model) {
        model.addAttribute("lehrer", lehrerRepository.findById(id).get());
        return "/lehrer/edit_lehrer";
    }
    // Schüler aktualisieren
    @GetMapping("/editSchueler/{id}")
    public String editSchueler(@PathVariable int id, Model model) {
        model.addAttribute("schueler", schuelerRepository.findById(id).get());
        return "/schueler/edit_schueler";
    }

    // Lehrer löschen
    @DeleteMapping("/lehrer/{id}")
    public void deleteLehrer(@PathVariable int id) {
        lehrerRepository.deleteById(id);
    }

    // Schüler löschen
    @DeleteMapping("/schueler/{id}")
    public void deleteSchueler(@PathVariable int id) {
        schuelerRepository.deleteById(id);
    }
}





