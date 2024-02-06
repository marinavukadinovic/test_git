package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class News extends Newsfeed{
	

	private String name;
	private String test;
	private LocalDateTime Date;
	private String like;
	private String comment;
	
	public News() {
		super();
	}
	
	public News(ArrayList<Newsfeed> newsfeed, String title, String content, String name, String test,LocalDate Date, String like, String comment) {
		super(newsfeed, title, content);

		this.name = name;
		this.test = test;
		this.Date = Date;
		this.like = like;
		this.comment = comment;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public LocalDateTime getDate() {
		return Date;
	}
	public void setDate(LocalDateTime date) {
		Date = date;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
