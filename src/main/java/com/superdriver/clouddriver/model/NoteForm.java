package com.superdriver.clouddriver.model;

import java.math.BigDecimal;

public class NoteForm {

    private String noteText;
    private String noteType;
    private BigDecimal notePoint;

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }


    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public BigDecimal getNotePoint() {
        return notePoint;
    }

    public void setNotePoint(BigDecimal notePoint) {
        this.notePoint = notePoint;
    }







}
