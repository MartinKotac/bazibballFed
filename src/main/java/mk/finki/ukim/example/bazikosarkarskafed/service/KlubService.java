package mk.finki.ukim.example.bazikosarkarskafed.service;

import mk.finki.ukim.example.bazikosarkarskafed.model.Igrac;
import mk.finki.ukim.example.bazikosarkarskafed.model.Klub;
import mk.finki.ukim.example.bazikosarkarskafed.model.Trener;

import java.util.List;

public interface KlubService {
    void addClub(Klub klub);
    void addPlayerInClub(String embg,int klubId);
    void addCoachInClub(String embg, int klubId);
    List<Klub> findAll();
    void deleteClub(int klubId);
    Klub getClubById(int id);
    List<Klub> showStandings();
}
