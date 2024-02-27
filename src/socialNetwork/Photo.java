package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Photo extends Newsfeed{
	
	
	private String dataName;
	
	
	
	public Photo () {
		super();
}

	public Photo(ArrayList<Newsfeed> newsfeed, String title, String content, String name, 
			String dataName, String photo, LocalDateTime Date, String like, String comment) {
		super(newsfeed, title, content);
		
		this.name = name;
		this.dataName = dataName;
		this.photo = photo;
		this.Date = Date;		
		this.like = like;
		this.comment = comment;
	}
	
	
	}
