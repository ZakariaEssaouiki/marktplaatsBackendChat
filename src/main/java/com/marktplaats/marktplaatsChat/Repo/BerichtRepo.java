package com.marktplaats.marktplaatsChat.Repo;

import com.marktplaats.marktplaatsChat.Model.Bericht;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BerichtRepo extends MongoRepository<Bericht,String> {

    List<Bericht> findBerichtsByVerzenderIdAndAndOntvangerId(String verzenderId, String ontvangerId);
}
