package Kodlama.io.Kodlama.io.Devs.webApi;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Programminglang")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService language;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService language) {
        this.language = language;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return this.language.getAll();
    }

    @GetMapping("/getbyid")
    public ProgrammingLanguage getAll(@RequestParam int id){
        return this.language.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestParam ProgrammingLanguage language){
        this.language.add(language);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
        this.language.delete(id);
    }

    @PostMapping("/Update")
    public void update(@RequestBody ProgrammingLanguage language){
        this.language.update(language);
    }


}
