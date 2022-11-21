package com.marktplaats.marktplaatsChat.Controller;

import com.google.gson.Gson;
import com.marktplaats.marktplaatsChat.Model.Bericht;
import com.marktplaats.marktplaatsChat.Model.SenderAndReceiver;
import com.marktplaats.marktplaatsChat.Service.BerichtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bericht")
public class BerichtController {

    @Autowired
    private BerichtService berichtService;

    final Gson gson = new Gson();

    @PostMapping("/create")
    public ResponseEntity<Object> Create(@RequestBody Bericht bericht) {
        this.berichtService.Create(bericht);
        return new ResponseEntity<>(gson.toJson("Bericht is succesvol aangemaakt."), HttpStatus.CREATED);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Object> Delete(@PathVariable String id) {
        if (this.berichtService.FindById(id) != null) {
            this.berichtService.Delete(this.berichtService.FindById(id));
            return new ResponseEntity<>(gson.toJson("Bericht is succesvol verwijderd."), HttpStatus.OK);
        }
        return new ResponseEntity<>(gson.toJson("Er ging iets mis."), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getAll")
    public List<Bericht> GetAll() {
        return this.berichtService.GetAll();
    }

    @GetMapping("/getAllFromSenderAndReceiver")
    public List<Bericht> GetAllFromSenderAndReceiver(@RequestBody SenderAndReceiver users){
        return this.berichtService.GetAllFromSenderAndReceiver(users.getSenderId(), users.getReceiverId());
    }

}
