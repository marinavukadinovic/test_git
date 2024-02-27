package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class News extends Newsfeed{

	
	
	private String text; 

	
	public News() {
		super();
	}
	
	public News(ArrayList<Newsfeed> newsfeed, String title, String content, String name, String test,LocalDateTime Date, String like, String comment) {
		super(title,content, name, date, like, comment);

	
		this.text = text;
	}
	
	
	
	public String getText() {
		return text;
	}
	public void setText (String text) {
		this.text = text;
	}
}