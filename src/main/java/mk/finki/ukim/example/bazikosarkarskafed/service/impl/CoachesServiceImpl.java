package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.Coaches;
import mk.finki.ukim.example.bazikosarkarskafed.repository.CoachesRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.CoachesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachesServiceImpl implements CoachesService {
    private final CoachesRepository coachesRepository;

    public CoachesServiceImpl(CoachesRepository coachesRepository) {
        this.coachesRepository = coachesRepository;
    }

    @Override
    public List<Coaches> listAll() {
        return coachesRepository.findAll();
    }
}
