package com.superdriver.clouddriver.service;

import com.superdriver.clouddriver.mapper.NoteMapper;
import com.superdriver.clouddriver.model.Note;
import com.superdriver.clouddriver.model.NoteForm;
import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class NoteService {

    private final NoteMapper noteMapper;



    public NoteService(NoteMapper noteMapper) {
        this.noteMapper = noteMapper;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating NoteService bean");
    }


    public  void addNoteMessage(NoteForm noteForm){
        Note newNote = new Note();
        newNote.setNoteText(noteForm.getNoteText());
        newNote.setNotePoint(noteForm.getNotePoint());

        switch (noteForm.getNoteType()) {
            case "Good":
                newNote.setNoteText(noteForm.getNoteText());
                break;
            case "Medium":
                newNote.setNoteText(noteForm.getNoteText().toUpperCase());
                break;
            case "Excellent":
                newNote.setNoteText(noteForm.getNoteText().toLowerCase());
                break;
        }


        noteMapper.addNoteSave(newNote);
    }

    public List<Note> getNoteMessages() {
        return noteMapper.getAllNotes();
    }





   public void deleteNoteServ(){

       Note newNoteId = new Note();
       newNoteId.setNoteId(newNoteId.getNoteId());
       //newNoteId.setNoteText(noteForm.getNoteText());

        noteMapper.deleteNoteById(newNoteId);

   }





























}
