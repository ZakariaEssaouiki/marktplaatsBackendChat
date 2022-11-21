package com.marktplaats.marktplaatsChat.Service;

import com.marktplaats.marktplaatsChat.Model.Bericht;
import com.marktplaats.marktplaatsChat.Repo.BerichtRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BerichtService implements IBericht{

    @Autowired
    private BerichtRepo berichtRepo;

    public BerichtService(BerichtRepo berichtRepo){
        this.berichtRepo = berichtRepo;
    }

    @Override
    public void Create(Bericht bericht) {
        this.berichtRepo.save(bericht);
    }

    @Override
    public void Delete(Bericht bericht) {
        this.berichtRepo.delete(bericht);
    }

    @Override
    public List<Bericht> GetAll() {
        return this.berichtRepo.findAll();
    }

    @Override
    public List<Bericht> GetAllFromSenderAndReceiver(String senderId, String receiverId) {
        return this.berichtRepo.findBerichtsByVerzenderIdAndAndOntvangerId(senderId,receiverId);
    }

    @Override
    public Bericht FindById(String id) {
        return this.berichtRepo.findById(id).orElse(null);
    }

    //test
}
