package com.superdriver.clouddriver.model;

import java.math.BigDecimal;

public class Note {

    private Integer noteId;
    private String noteText;
    private BigDecimal notePoint;


    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public BigDecimal getNotePoint() {
        return notePoint;
    }

    public void setNotePoint(BigDecimal notePoint) {
        this.notePoint = notePoint;
    }





}
