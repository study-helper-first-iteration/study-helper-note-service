package service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dao.NoteRepository;
import entity.Note;

@Service
public class NoteService {

	private NoteRepository pr;
	
	public NoteService(NoteRepository noteRepository){
		pr = noteRepository;
	}
	//create
	public void addNote(Note note) {
		pr.save(note);
	}
	
	//read
	public Note getNoteById(long id) throws Exception {
		Optional<Note> optional = pr.findById(id);
		if(optional.isPresent()){
			return optional.get();
		}
		throw new Exception();
	}
	
	public List<Note> getAllNotes(){
		return pr.findAll();
	}
	
	//update
	public void updateNote(Note note) {
		pr.save(note);
	}
	
	//delete
	public void deleteById(long id) {
		pr.deleteById(id);
	}
	

}
