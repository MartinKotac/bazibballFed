package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.Sudija;
import mk.finki.ukim.example.bazikosarkarskafed.repository.SudijaRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.SudijaService;
import org.springframework.stereotype.Service;

@Service
public class SudijaServiceImpl implements SudijaService {
    private final SudijaRepository sudijaRepository;

    public SudijaServiceImpl(SudijaRepository sudijaRepository) {
        this.sudijaRepository = sudijaRepository;
    }

    @Override
    public void addRef(String embg,Integer n) {
        sudijaRepository.insertRef(embg,n);

    }

    @Override
    public void deleteRef(String id) {
        sudijaRepository.deleteById(id);
    }
}
