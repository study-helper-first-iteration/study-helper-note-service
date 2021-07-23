package entity;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="note")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "note_id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "createddate")
	private Date createdDate;
	
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;
	
	@Column(name = "body")
	private String body;
	
	
	
	public Note() {
		super();
	}
	

	public Note(long id, String title, Date createdDate, Date lastModifiedDate, String body) {
		super();
		this.id = id;
		this.title = title;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.body = body;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	

}
