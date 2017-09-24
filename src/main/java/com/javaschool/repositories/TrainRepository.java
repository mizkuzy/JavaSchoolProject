package com.javaschool.repositories;


import com.javaschool.model.Train;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface TrainRepository extends CrudRepository<Train, Long> {

    @Query("SELECT t FROM Train t WHERE t.name =:train_name")
    Train findTrainByName(@Param("train_name") String name);
}
