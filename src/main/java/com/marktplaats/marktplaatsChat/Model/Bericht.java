package com.marktplaats.marktplaatsChat.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "berichten")
public class Bericht {

    @Id
    private String id;
    @Field("sequence_number")
    int sequence;
    private String verzenderId;
    private String ontvangerId;
    private String text;
    private LocalDate datum;


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        this.datum = datum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
