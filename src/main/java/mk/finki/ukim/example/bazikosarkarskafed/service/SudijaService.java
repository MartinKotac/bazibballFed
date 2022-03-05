package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.Sudija;
import mk.finki.ukim.example.bazikosarkarskafed.model.Trener;

public interface SudijaService {
    void addRef(String id,Integer n);
    void deleteRef(String id);
}
