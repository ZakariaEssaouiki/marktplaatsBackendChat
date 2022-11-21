package com.marktplaats.marktplaatsChat.Service;

import com.marktplaats.marktplaatsChat.Model.Bericht;

import java.util.List;

public interface IBericht {

    public void Create(Bericht bericht);
    public void Delete(Bericht bericht);
    public List<Bericht> GetAll();
    public List<Bericht> GetAllFromSenderAndReceiver(String senderId, String receiverId);
    public Bericht FindById(int id);
}
