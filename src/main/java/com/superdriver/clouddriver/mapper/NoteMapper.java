package com.superdriver.clouddriver.mapper;

import com.superdriver.clouddriver.model.Note;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoteMapper {
    @Select("select * from NOTES")
    List<Note> getAllNotes();

    @Insert("INSERT INTO NOTES (noteText, notePoint) VALUES(#{noteText}, #{notePoint})")
    @Options(useGeneratedKeys = true, keyProperty = "noteId")
    int addNoteSave(Note note);

    @Update("Update NOTES set  note_text=#{noteText}, note_point=#{notePoint}  where note_id=#{noteId}")
    public int updateNote(Note note);


    @Delete("DELETE FROM NOTES WHERE noteid = #{noteId}")
    public int deleteNoteById(Note note);



}
