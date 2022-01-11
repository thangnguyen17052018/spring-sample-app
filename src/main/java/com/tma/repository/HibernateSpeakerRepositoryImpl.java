package com.tma.repository;

import com.tma.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Thang");
        speaker.setLastName("Nguyen");

        speakers.add(speaker);

        return speakers;
    }

}
