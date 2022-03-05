package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.Igrac;
import mk.finki.ukim.example.bazikosarkarskafed.model.Klub;
import mk.finki.ukim.example.bazikosarkarskafed.model.Trener;
import mk.finki.ukim.example.bazikosarkarskafed.model.exceptions.ClubNotFoundException;
import mk.finki.ukim.example.bazikosarkarskafed.model.exceptions.PersonNotFoundException;
import mk.finki.ukim.example.bazikosarkarskafed.repository.CoachesRepository;
import mk.finki.ukim.example.bazikosarkarskafed.repository.IgracRepository;
import mk.finki.ukim.example.bazikosarkarskafed.repository.KlubRepository;
import mk.finki.ukim.example.bazikosarkarskafed.repository.TrenerRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.KlubService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlubServiceImpl implements KlubService {
    private final IgracRepository igracRepository;
    private final TrenerRepository trenerRepository;
    private final KlubRepository klubRepository;

    public KlubServiceImpl(IgracRepository igracRepository, TrenerRepository trenerRepository, KlubRepository klubRepository) {
        this.igracRepository = igracRepository;
        this.trenerRepository = trenerRepository;
        this.klubRepository = klubRepository;
    }

    @Override
    public void addClub(Klub klub) {
        klubRepository.save(klub);
    }

    @Override
    public void addPlayerInClub(String embg, int klubId) {
        Igrac igrac=igracRepository.findById(embg).orElseThrow(()->new PersonNotFoundException(embg));
        Klub klub=klubRepository.findById(klubId).orElseThrow(()->new ClubNotFoundException(klubId));
        igrac.setIdKlub(klub);
        igracRepository.save(igrac);

    }

    @Override
    public void addCoachInClub(String embg, int klubId) {
        Trener trener=trenerRepository.findById(embg).orElseThrow(()->new PersonNotFoundException(embg));
        Klub klub=klubRepository.findById(klubId).orElseThrow(()->new ClubNotFoundException(klubId));
        trener.setIdKlub(klub);
        trenerRepository.save(trener);
    }

    @Override
    public List<Klub> findAll() {
        return klubRepository.findAll();
    }

    @Override
    public void deleteClub(int klubId) {
        klubRepository.deleteById(klubId);
    }

    @Override
    public Klub getClubById(int id) {
        return klubRepository.findById(id).get();
    }

    @Override
    public List<Klub> showStandings() {
        return klubRepository.showStandings();
    }


}
