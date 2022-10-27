package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.DataAccsess.concretes.InMemoryProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private InMemoryProgrammingLanguageRepository ProgrammingLanguageRepository;

    public ProgrammingLanguageManager(InMemoryProgrammingLanguageRepository programmingLanguageRepository) {
        ProgrammingLanguageRepository = programmingLanguageRepository;
    }

    @Autowired


    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.ProgrammingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return this.ProgrammingLanguageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage lang = this.ProgrammingLanguageRepository.getById(programmingLanguage.getId());

        if (lang == null){
            if (!programmingLanguage.getName().isBlank() && !this.ProgrammingLanguageRepository.isExists(programmingLanguage)){
                this.ProgrammingLanguageRepository.add(programmingLanguage);
            }else {
                return;
            }
        }else {
            return;
        }
    }

    @Override
    public void delete(int id) {
    this.ProgrammingLanguageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        this.ProgrammingLanguageRepository.update(programmingLanguage);
    }

}
