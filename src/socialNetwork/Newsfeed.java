package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Newsfeed{
	 
	private ArrayList<Newsfeed>newsfeed;
	private String title;
	private String content;
	private String name;
	private LocalDateTime Date;
	private String like;
	private String comment;
	
	
	public Newsfeed() {
		
	}
	
	public Newsfeed(ArrayList<Newsfeed> newsfeed, String title, String content, String name, LocalDateTime Date, String like, String comment) {
		super();
		this.newsfeed = newsfeed;
		this.title = title;
		this.content = content;
		this.name = name;
		this.Date = Date;
		this.like = like;
		this.comment = comment;
		
	}
	public ArrayList<Newsfeed> getNewsfeed() {
		return newsfeed;
	}
	public void setNewsfeed(ArrayList<Newsfeed> newsfeed) {
		this.newsfeed = newsfeed;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
		
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
	
	
}