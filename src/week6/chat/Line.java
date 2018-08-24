package week6.chat;

import java.io.Serializable;

public class Line implements Serializable {
	private static final long serialVersionUID = 1L;
	String line;
	
	public Line(String line) {
		this.line = line;
	}
}
