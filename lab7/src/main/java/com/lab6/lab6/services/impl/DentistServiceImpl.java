package com.lab6.lab6.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab6.lab6.model.Dentist;
import com.lab6.lab6.repository.DentistRepository;
import com.lab6.lab6.services.DentistService;

@Service
public class DentistServiceImpl implements DentistService {
    @Autowired
    DentistRepository dentistRepository;

    @Override
    public Dentist addDentist(Dentist d) {
        return dentistRepository.save(d);

    }

}
