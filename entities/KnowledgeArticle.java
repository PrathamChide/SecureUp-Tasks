package entities;

public class KnowledgeArticle {
	private int articleId;
	private int userId;
	private String title;
	private String content;
	private String tags;
	private int categoryId;
	private String publicationDate;
	private String lastModifiedDate;
	private String status;
	private int viewsCount;
	private int upvotesCount;
	private int downvotesCount;
	private int commentCount;
	private boolean isFeatured;
	private boolean isApproved;
	private String articleType;
	
	public void set_articleId(int articleId) {
		this.articleId = articleId;
	}
	
	public int get_articleId() {
		return articleId;
	}
	
	public void set_userId(int userId) {
		this.userId = userId;
	}
	
	public int get_userId() {
		return userId;
	}
	
	public void set_title(String title) {
		this.title = title;
	}
	
	public String get_title() {
		return title;
	}
	
	public void set_content(String content) {
		this.content = content;
	}
	
	public String get_content() {
		return content;
	}
	
	public void set_tags(String tags) {
		this.tags = tags;
	}
	
	public String get_tags() {
		return tags;
	}
	
	public void set_categoryId(int catergoryId) {
		this.categoryId = catergoryId;
	}
	
	public int get_categoryId() {
		return categoryId;
	}
	
	public void set_publicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public String get_publicationDate() {
		return publicationDate;
	}
	
	public void set_lastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	public String get_lastModifiedDate() {
		return lastModifiedDate;
	}
	
	public void set_status(String status) {
		this.status = status;
	}
	
	public String get_status() {
		return status;
	}
	
	public void set_viewsCount(int viewsCount) {
		this.viewsCount = viewsCount;
	}
	
	public int get_viewsCount() {
		return viewsCount;
	}
	
	public void set_upvotesCount(int upvotesCount) {
		this.upvotesCount = upvotesCount;
	}
	
	public int get_upvotesCount() {
		return upvotesCount;
	}
	
	public void set_downvotesCount(int downvotesCount) {
		this.downvotesCount = downvotesCount;
	}
	
	public int get_downvotesCount() {
		return downvotesCount;
	}
	
	public void set_commentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	
	public int get_commentCount() {
		return commentCount;
	}
	
	public void set_isFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}
	
	public boolean get_isFeatured() {
		return isFeatured;
	}
	
	public void set_isApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
	public boolean get_isApproved() {
		return isApproved;
	}
	
	public void set_articleType(String articleType) {
		this.articleType = articleType;
	}
	
	public String get_articleType() {
		return articleType;
	}
	

}
