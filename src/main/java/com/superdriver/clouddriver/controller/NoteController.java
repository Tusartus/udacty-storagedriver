package com.superdriver.clouddriver.controller;


import com.superdriver.clouddriver.model.NoteForm;
import com.superdriver.clouddriver.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/note")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public String getNotePage(NoteForm noteForm, Model model) {
        model.addAttribute("notes", this.noteService.getNoteMessages());
        return "note";
    }

    @PostMapping
    public String postNotes(NoteForm noteForm, Model model) {
        this.noteService.addNoteMessage(noteForm);
        noteForm.setNoteText("");
        model.addAttribute("notes", this.noteService.getNoteMessages());
        return "note";

    }


    @ModelAttribute("allNoteTypes")
    public String[] allNoteTypes() {
        return new String[]{"Good", "Medium", "Excellent"};
    }



    @RequestMapping(value = "note/delete/{noteId}",method = RequestMethod.GET)
    public String removeNote(@PathVariable int noteId){
        noteService.deleteNoteServ();
        return "redirect:/note";
    }













}







