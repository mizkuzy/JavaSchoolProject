package com.javaschool.services;


import com.javaschool.model.Train;
import com.javaschool.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    public void saveTrain(Train train) {
        trainRepository.save(train);
    }

    public Train findTrainById(long id) {
        return trainRepository.findOne(id);
    }

    public Train findTrainByName(String name) {
        return trainRepository.findTrainByName(name);
    }

    public List<Train> findAllTrains() {
        return (List<Train>) trainRepository.findAll();
    }

    public void deleteAllTrains() {
        trainRepository.deleteAll();
    }


}
