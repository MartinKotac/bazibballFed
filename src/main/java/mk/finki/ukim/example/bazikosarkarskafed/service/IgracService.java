package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.Igrac;
import mk.finki.ukim.example.bazikosarkarskafed.model.Klub;

public interface IgracService {
    void addPlayer(String id,Integer broj,String pozicija,Integer idKlub);
    void deletePlayer(String embg);

}
