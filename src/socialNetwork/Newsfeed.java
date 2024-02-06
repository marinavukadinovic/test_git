package socialNetwork;

import java.util.ArrayList;

public class Newsfeed{
	 
	private ArrayList<Newsfeed>newsfeed;
	private String title;
	private String content;
	
	public Newsfeed() {
		
	}
	
	public Newsfeed(ArrayList<Newsfeed> newsfeed, String title, String content) {
		super();
		this.newsfeed = newsfeed;
		this.title = title;
		this.content = content;
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