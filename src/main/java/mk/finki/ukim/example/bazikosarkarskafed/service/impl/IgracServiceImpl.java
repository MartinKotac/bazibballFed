package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.Igrac;
import mk.finki.ukim.example.bazikosarkarskafed.repository.IgracRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.IgracService;
import org.springframework.stereotype.Service;

@Service
public class IgracServiceImpl implements IgracService {
    private final IgracRepository igracRepository;

    public IgracServiceImpl(IgracRepository igracRepository) {
        this.igracRepository = igracRepository;
    }

    @Override
    public void addPlayer(String id,Integer broj,String pozicija,Integer idKlub) {

        igracRepository.insertPlayer(id,broj,pozicija,idKlub);
    }
    @Override
    public void deletePlayer(String embg) {
        igracRepository.deleteById(embg);
    }
}
