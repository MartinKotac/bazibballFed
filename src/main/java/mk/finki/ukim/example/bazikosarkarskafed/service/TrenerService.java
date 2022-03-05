package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.Trener;

public interface TrenerService {
    void addCoach(String id,String type,Integer idKlub);
    void deleteCoach(String id);
}
