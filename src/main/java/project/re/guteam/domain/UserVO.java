package project.re.guteam.domain;

public class UserVO {
	private String userId;
	private String password;
	private int enabled;
	private String role;
	
	public UserVO() {}
	public UserVO(String userId, String password, int enabled, String role) {
		this.userId = userId;
		this.password = password;
		this.enabled = enabled;
		this.role = role;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", password=" + password + ", enabled=" + enabled + ", role=" + role + "]";
	}
	
	
}
