package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.Trener;
import mk.finki.ukim.example.bazikosarkarskafed.repository.TrenerRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.TrenerService;
import org.springframework.stereotype.Service;

@Service
public class TrenerServiceImpl implements TrenerService {
    private final TrenerRepository trenerRepository;

    public TrenerServiceImpl(TrenerRepository trenerRepository) {
        this.trenerRepository = trenerRepository;
    }

    @Override
    public void addCoach(String id,String type,Integer idKlub) {
        trenerRepository.insertCoach(id,type,idKlub);

    }

    @Override
    public void deleteCoach(String id) {
        trenerRepository.deleteById(id);

    }
}
