package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.Chovek;

public interface ChovekService {
    Chovek getByEMBG(String embg);
    void addChovek(Chovek chovek);
}
