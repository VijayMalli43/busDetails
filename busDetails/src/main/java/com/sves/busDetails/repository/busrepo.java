package com.sves.busDetails.repository;

import com.sves.busDetails.entity.busEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface busrepo extends MongoRepository<busEntity, String> {
}
