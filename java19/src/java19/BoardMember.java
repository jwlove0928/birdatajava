package java19;

public class BoardMember {
	
	String title;
	String content;
	String user;
	String pw;

	public BoardMember(String title, String content, String user, String pw) {
		this.title = title;
		this.content = content;
		this.user = user;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "BoardMember [title=" + title + ", content=" + content + ", user=" + user + ", pw=" + pw + "]";
	}

}
