package com.marktplaats.marktplaatsChat.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "berichten")
public class Bericht {

    @Id
    private int id;
    private String verzenderId;
    private String ontvangerId;
    private String text;
    private LocalDate datum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVerzenderId() {
        return verzenderId;
    }

    public void setVerzenderId(String verzenderId) {
        this.verzenderId = verzenderId;
    }

    public String getOntvangerId() {
        return ontvangerId;
    }

    public void setOntvangerId(String ontvangerId) {
        this.ontvangerId = ontvangerId;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        datum = datum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
