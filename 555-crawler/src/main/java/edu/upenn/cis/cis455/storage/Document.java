package edu.upenn.cis.cis455.storage;

/**
 * Document class
 * @author Kevin Chen
 *
 */

public class Document {
    String url;  
    String content;
    String type;
    int id;

	public Document(String url, String content, String type) {
		this.url = url;
		this.content = content;
		this.type = type;
	}
	
	public Document(int id, String url, String content, String type) {
		this.id = id;
		this.url = url;
		this.content = content;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return url;
	}
}
