package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NoteRepository;
import entity.Note;

@Service
public class NoteService {
	
	@Autowired
	private NoteRepository pr;
	
	
	//create
	public void addNote(Note note) {
		pr.save(note);
	}
	
	//read
	public Note getNoteById(int id){
		return pr.getById(id);
	}
	
	public List<Note> getAllNotes(){
		return pr.findAll();
	}
	
	//update
	public void updateNote(Note note) {
		pr.save(note);
	}
	
	//delete
	public void deleteById(int id) {
		pr.deleteById(id);
	}
	

}
