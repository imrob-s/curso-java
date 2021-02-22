package entities;

public class Rent {
	private String name, email;
	private int room;
	
	public Rent(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return room
				+ ": " 
				+ name 
				+ ", " 
				+ email;
	}
	
	
}
