package beans;

public class Comments {
	
	 private int commentID; 
	 private int articleID; 
	 private int userID; 
	 private String content;
	 private String commentDate;
	 private int likeCount;
	 private int dislikeCount;
	 private boolean isApproved; 
	 private int parentCommentID;
	 private boolean isDeleted;

	 //Setter and Getter methods
	 
	 public void set_commentID(int commentID) 
		{
			this.commentID = commentID;
		}
	 
	 public int get_commentID() 
	 	{
			return commentID;
	 	}
	 
	 public void set_articleID(int articleID)
	 	{
		 	this.articleID = articleID;
	 	}
	 
	 public int get_articleID()
	 	{
		 	return articleID;
	 	}
	 
	 public void set_userID(int userID)
	 	{
		 	this.userID = userID;
	 	}
	 
	 public int get_userID()
	 	{
		 	return userID;
	 	}
	 
	 public void set_content(String content)
	 	{
		  	this.content = content;
	 	}
	 
	 public String get_content()
	 	{
		 	return content;
	 	}
	 
	 public void set_commentDate(String commentDate)
	 	{
		 	this.commentDate = commentDate;
	 	}
	 
	 public String get_commentDate()
	 	{
		 	return commentDate;
	 	}
	 
	 public void set_likeCount(int likeCount)
	 	{
		 	this.likeCount = likeCount;
	 	}
	 
	 public int get_likeCount() 
	 	{
		 	return likeCount;
	 	}
	 
	 public void set_dislikeCount(int dislikeCount)
	 	{
		  this. dislikeCount =  dislikeCount;
	 	}
	 
	 public int get_dislikeCount()
	 	{
		 return  dislikeCount;
	 	}
	 
	 public void set_isApproved( boolean isApproved)
	 	{
		 this.isApproved = isApproved;
	 	}
	 
	 public boolean get_isApproved()
	 	{
		 	return isApproved;
	 	}	
	 
	 public void set_parentCommentID(int parentCommentID)
	 	{
		  	this.parentCommentID = parentCommentID;
	 	}
	 
	 public int get_parentCommentID()
	 	{
		 	return parentCommentID;
	 	}
	 
	 public void set_isDeleted(boolean isDeleted)
	 	{
		 	this.isDeleted = isDeleted;
	 	}
	 
	 public boolean isDeleted()
	 	{
		 	return isDeleted;
	 	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
