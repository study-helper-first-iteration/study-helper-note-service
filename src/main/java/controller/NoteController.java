package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Note;
import service.NoteService;

@RestController
@CrossOrigin("*")
public class NoteController {
	

	private NoteService ns;

	public NoteController(NoteService noteService){
		ns = noteService;
	}

	
	@GetMapping("/note/{id}")
	public Note getNoteById(@PathVariable long id) throws Exception {
		return ns.getNoteById(id);
	}
	
	@GetMapping("/notes")
	public List<Note> getAllNotes(){
		return ns.getAllNotes();
	}
	
	@PostMapping("/note")
	public void addNote(@RequestBody Note note) {
		ns.addNote(note);
	}
	
	@PutMapping("/note")
	public void updateNote(@RequestBody Note note) {
		ns.updateNote(note);
	}
	
	@DeleteMapping("/note/{id}")
	public void deleteNote(@PathVariable long id) {
		ns.deleteById(id);
	}

}
