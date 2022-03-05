package mk.finki.ukim.example.bazikosarkarskafed.service.impl;

import mk.finki.ukim.example.bazikosarkarskafed.model.views.Refs;
import mk.finki.ukim.example.bazikosarkarskafed.repository.RefsRepository;
import mk.finki.ukim.example.bazikosarkarskafed.service.RefsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefsServiceImpl implements RefsService {
    private final RefsRepository refsRepository;

    public RefsServiceImpl(RefsRepository refsRepository) {
        this.refsRepository = refsRepository;
    }

    @Override
    public List<Refs> listAll() {
        return refsRepository.findAll();
    }
}
