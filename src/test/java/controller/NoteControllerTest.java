package controller;

import entity.Note;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import service.NoteService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoteControllerTest {

    private NoteController nc;
    private NoteService ns;

    @BeforeEach
    void setUp() {
        ns = Mockito.mock(NoteService.class);
        nc = new NoteController(ns);
    }

    @Test
    void getNoteById() throws Exception {
        Note note = new Note(2,"Biolegy",new Date(), new Date(), "Body Text");
        Mockito.doReturn(note).when(ns).getNoteById(2);

        assertEquals(note, nc.getNoteById(2));
        Mockito.verify(ns).getNoteById(2);
    }

    @Test
    void getAllNotes() {
        Note note1 = new Note(1,"Biolegy",new Date(), new Date(), "Body Text");
        Note note2 = new Note(2,"English",new Date(), new Date(), "Body Text");
        Note note3 = new Note(3,"AI 101",new Date(), new Date(), "Body Text");

        List<Note> list = new ArrayList<Note>();
        list.add(note1);
        list.add(note2);
        list.add(note3);

        Mockito.doReturn(list).when(ns).getAllNotes();

        assertEquals(list, nc.getAllNotes());
        Mockito.verify(ns).getAllNotes();
    }

}