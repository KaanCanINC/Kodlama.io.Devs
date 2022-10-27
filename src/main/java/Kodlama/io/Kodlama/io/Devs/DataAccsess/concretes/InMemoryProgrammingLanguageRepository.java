package Kodlama.io.Kodlama.io.Devs.DataAccsess.concretes;

import Kodlama.io.Kodlama.io.Devs.DataAccsess.abstracts.LanguagesRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class InMemoryProgrammingLanguageRepository implements LanguagesRepository {
    List<ProgrammingLanguage> languages;

    public InMemoryProgrammingLanguageRepository() {
        this.languages = new ArrayList<ProgrammingLanguage>();

        this.languages.add(new ProgrammingLanguage(1,"C#"));
        this.languages.add(new ProgrammingLanguage(2,"Java"));
        this.languages.add(new ProgrammingLanguage(3,"Python"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.languages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage language : languages){
            if (language.getId() == id){
                return language;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        this.languages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        languages.remove(this.getById(id));
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage language = this.getById(programmingLanguage.getId());
        int index = languages.indexOf(language);
        languages.set(index,programmingLanguage);
    }

    @Override
    public boolean isExists(ProgrammingLanguage programmingLanguage) {
        if (this.getById(programmingLanguage.getId()).getName() == programmingLanguage.getName()){
            return true;
        }
        return false;
    }
}
