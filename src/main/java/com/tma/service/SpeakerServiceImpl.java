package com.tma.service;

import com.tma.model.Speaker;
import com.tma.repository.HibernateSpeakerRepositoryImpl;
import com.tma.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    //Constructor Injection
    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    //Setter Injection
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
