package ex02_List;

public class User {
	String id;
	String pw;
	
	public User() { 
		
	}
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}


	
	
	
	
	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}

	// getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	

}
