package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.Chovek;
import mk.finki.ukim.example.bazikosarkarskafed.repository.ChovekRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.ChovekService;
import org.springframework.stereotype.Service;

@Service
public class ChovekServiceImpl implements ChovekService {
   private final  ChovekRepository chovekRepository;

    public ChovekServiceImpl(ChovekRepository chovekRepository) {
        this.chovekRepository = chovekRepository;
    }

    @Override
    public Chovek getByEMBG(String embg) {
        return chovekRepository.findById(embg).get();
    }

    @Override
    public void addChovek(Chovek chovek) {
        chovekRepository.save(chovek);
    }
}
