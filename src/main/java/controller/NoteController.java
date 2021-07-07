package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class NoteController {
	
	
	@Autowired
	private NoteService ns;
	

	
	@GetMapping("/studyhelper/note/{id}")
	public Note getNoteById(@PathVariable int id) {
		return ns.getNoteById(id);
	}
	
	@GetMapping("/studyhelper/notes")
	public List<Note> getAllNotes(){
		return ns.getAllNotes();
	}
	
	@PostMapping("/studyhelper/note")
	public void addNote(@RequestBody Note note) {
		ns.addNote(note);
	}
	
	@PutMapping("/studyhelper/note")
	public void updateNote(@RequestBody Note note) {
		ns.updateNote(note);
	}
	
	@DeleteMapping("/studyhelper/note/{id}")
	public void deleteNote(@PathVariable int id) {
		ns.deleteById(id);
	}

}
