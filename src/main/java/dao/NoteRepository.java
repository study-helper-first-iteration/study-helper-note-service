package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import entity.Note;

public interface NoteRepository extends JpaRepository<Note,Integer>{

}
