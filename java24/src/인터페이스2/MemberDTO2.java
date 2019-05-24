package 인터페이스2;

public class MemberDTO2 {
	
	private String id;
	private String pw;
	private String tel;
	private String address;
	
	@Override
	public String toString() {
		return "MemberDTO2 [id=" + id + ", pw=" + pw + ", tel=" + tel + ", address=" + address + "]";
	}
	
	public MemberDTO2(String id, String pw, String tel, String address) {
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
