package beans;

public class Article_Report 
{
	private int reportID;
	private int articleID; 
	private int userID;
	private String reportType; 
	private String reportDescription;
	private String reportDate;
	private boolean isReviewed;
	private String resolvedBy; 
	private String resolution_Notes;
	
	
	public int get_reportID() 
	{
		return reportID;
	}
	public void set_reportID(int reportID) 
	{
		this.reportID = reportID;
	}
	public int get_articleID() 
	{
		return articleID;
	}
	public void set_articleID(int articleID) 
	{
		this.articleID = articleID;
	}
	public int getUserID() 
	{
		return UserID;
	}
	public void set_userID(int userID) 
	{
		this.userID = userID;
	}
	public String get_reportType() 
	{
		return reportType;
	}
	public void set_reportType(String reportType) 
	{
		this.reportType = reportType;
	}
	public String get_reportDescription() 
	{
		return reportDescription;
	}
	public void set_reportDescription(String reportDescription) 
	{
		this.reportDescription = reportDescription;
	}
	public String get_reportDate() 
	{
		return reportDate;
	}
	public void set_reportDate(String reportDate) 
	{
		this.reportDate = reportDate;
	}
	public boolean is_isReviewed() 
	{
		return isReviewed;
	}
	public void set_isReviewed(boolean isReviewed) 
	{
		this.isReviewed = isReviewed;
	}
	public String get_resolvedBy() 
	{
		return resolvedBy;
	}
	public void set_resolvedBy(String resolvedBy) 
	{
		this.resolvedBy = resolvedBy;
	}
	public String get_resolution_Notes() 
	{
		return resolution_Notes;
	}
	public void set_resolution_Notes(String resolution_Notes) 
	{
		this.resolution_Notes = resolution_Notes;
	}
	
	

}
