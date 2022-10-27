package Kodlama.io.Kodlama.io.Devs.DataAccsess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguagesRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);
    boolean isExists(ProgrammingLanguage programmingLanguage);

}
