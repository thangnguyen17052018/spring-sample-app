package com.tma.service;

import com.tma.model.Speaker;
import com.tma.repository.HibernateSpeakerRepositoryImpl;
import com.tma.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
