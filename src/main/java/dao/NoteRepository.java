package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Note;

public interface NoteRepository extends JpaRepository<Note,Long>{

}
