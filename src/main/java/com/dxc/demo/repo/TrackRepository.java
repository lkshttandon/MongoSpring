package com.dxc.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.dxc.demo.model.Track;

public interface TrackRepository extends MongoRepository<Track, String>{
	

}
