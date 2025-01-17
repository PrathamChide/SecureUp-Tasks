package entities;

public class User {
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private int contactNumber;
	private String profilePicture;
	private String dateOfBirth;
	private String address;
	private String userRole;
	private String bio;
	private String registeredDate;
	private String lastLogin;
	private String accountStatus;
	private int reputationScore;
	private int followersCount;
	
	public User(){
		
	}
	
	public void set_userId(int userId) {
		this.userId = userId;
	}
	
	public int get_userId() {
		return userId;
	}
	
	public void set_fullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String get_fullName(){
		return fullName;
	}
	
	public void set_email(String email) {
		this.email = email;
	}
	
	public String get_email() {
		return email;
	}
	
	public void set_password(String password) {
		this.password = password;
	}
	
	public String get_password() {
		return password;
	}
	
	public void set_contactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public int get_contactNumber() {
		return contactNumber;
	}
	
	public void set_profilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	public String get_profilePicture() {
		return profilePicture;
	}
	
	public void set_dateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String get_dateOfBirth() {
		return dateOfBirth;
	}
	
	public void set_address(String address) {
		this.address = address;
	}
	
	public String get_address() {
		return address;
	}
	
	public void set_userRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String get_userRole() {
		return userRole;
	}
	
	public void set_bio(String bio) {
		this.bio = bio;
	}
	
	public String get_bio() {
		return bio;
	}
	
	public void set_registeredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	public String get_registeredDate() {
		return registeredDate;
	}
	
	public void set_lastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	public String get_lastLogin() {
		return lastLogin;
	}
	
	public void set_accountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	public String get_accountStatus() {
		return accountStatus;
	}
	
	public void set_reputationScore(int reputationScore) {
		this.reputationScore = reputationScore;
	}
	
	public int get_reputationScore() {
		return reputationScore;
	}
	
	public void set_followersCount(int followersCount) {
		this.followersCount = followersCount;
	}
	
	public int get_followersCount() {
		return followersCount;
	}
	
	

}
