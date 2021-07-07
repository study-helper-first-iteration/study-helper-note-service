package com.example.StudyHelperNoteService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import dao.NoteRepository;
import entity.Note;
import service.NoteService;


@RunWith(MockitoJUnitRunner.class)
class NoteServiceTests {
	
	@Mock
	NoteRepository nr;
	
	@InjectMocks
	NoteService ns = new NoteService();
	
	

	@Test
	void testGetNoteById() {
		Note note = new Note(2,"Biolegy",new Date(), new Date(), "Body Text");
		Mockito.when(nr.getById(2)).thenReturn(note);
		assertEquals(ns.getNoteById(2),note);
	}
	
	@Test
	void testGetAllNotes() {
		Note note1 = new Note(1,"Biolegy",new Date(), new Date(), "Body Text");
		Note note2 = new Note(2,"English",new Date(), new Date(), "Body Text");
		Note note3 = new Note(3,"AI 101",new Date(), new Date(), "Body Text");
		
		List<Note> list = new ArrayList<Note>();
		list.add(note1);
		list.add(note2);
		list.add(note3);
		
		Mockito.when(nr.findAll()).thenReturn(list);
		List<Note> test = ns.getAllNotes();
		
		assertEquals(test.get(0),note1);
		assertEquals(test.get(1),note2);
	}
	

}
