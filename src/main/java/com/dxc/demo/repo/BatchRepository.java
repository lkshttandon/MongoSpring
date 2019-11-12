package com.dxc.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.demo.model.Batch;


public interface BatchRepository extends MongoRepository<Batch, String>{

}
