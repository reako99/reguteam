package project.re.guteam.domain;

public class UserInfoVO {
	private String userId;
	private String nickname;
	private String phone;
	private String email;
	private String userImageName;
	private int cash;
	public UserInfoVO() {
	}
	public UserInfoVO(String userId, String nickname, String phone, String email, String userImageName, int cash) {
		super();
		this.userId = userId;
		this.nickname = nickname;
		this.phone = phone;
		this.email = email;
		this.userImageName = userImageName;
		this.cash = cash;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserImageName() {
		return userImageName;
	}
	public void setUserImageName(String userImageName) {
		this.userImageName = userImageName;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	@Override
	public String toString() {
		return "UserInfoVO [userId=" + userId + ", nickname=" + nickname + ", phone=" + phone + ", email=" + email
				+ ", userImageName=" + userImageName + ", cash=" + cash + "]";
	}
	
	
}
