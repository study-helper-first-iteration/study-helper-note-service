package service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NoteRepository;
import entity.Note;

@Service
public class DataLoader {
	
	private NoteRepository nr;
	
	@Autowired
	public DataLoader(NoteRepository nr) {
		this.nr = nr;
	}
	
	@PostConstruct
	private void loadData() {
		Note note1 = new Note(1,"Biolegy",new Date(), new Date(), "Body Text");
		Note note2 = new Note(2,"English",new Date(), new Date(), "Body Text");
		Note note3 = new Note(3,"AI 101",new Date(), new Date(), "Body Text");
		Note note4 = new Note(4,"Mathematics",new Date(), new Date(), "Body Text");
		Note note5 = new Note(5,"Chemistry",new Date(), new Date(), "Body Text");
		Note note6 = new Note(6,"Latin",new Date(), new Date(), "Body Text");
		
		nr.save(note1);
		nr.save(note2);
		nr.save(note3);
		nr.save(note4);
		nr.save(note5);
		nr.save(note6);
		
	}

}
