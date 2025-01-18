package beans;

public class Category {
	 private int categoryID;
	 private String name;
	 private String description;
	 private int parentCategoryID;
	 private String creationDate;
	 private int numberOfArticles;
	 private boolean isActive; 
	 private String displayOrder;
	 private String lastUpdated;
	 private String imageURL;
	 
	 // //Setter and Getter methods
	 
	 public void set_categoryID(int categoryID) // categoryID is a formal parameter
		{
			this.categoryID = categoryID;
		}
	 
	 public int get_categoryID() 
	 	{
			return categoryID;
	 	}
	 
	 public void set_name(String name) 
	 {
		 this.name = name;
	 }
	 
	 public String get_name()
	 {
		 return name;
	 }
	 
	 public void set_description(String description) 
	 {
		 this.description = description;
	 }
	 
	 public String get_description()
	 {
		 return description;
	 }
	 
	 
	 public void set_parentCategoryID(int parentCategoryID) 
	 {
		this.parentCategoryID = parentCategoryID; 
	 }
	 
	 public int get_parentCategoryID() 
	 	{
			return parentCategoryID;
	 	}
	 
	 public void set_creationDate(String creationDate)
	 {
		 this.creationDate = creationDate;
	 }
	 
	 public String get_creationDate()
	 {
		 return creationDate;
	 }
	 
	 public void set_numberOfArticles(int numberOfArticles)
	 {
		 this.numberOfArticles = numberOfArticles;
	 }
	 
	 public int get_numberOfArticles()
	 {
		 return numberOfArticles;
	 }
	 
	 public void set_isActive(boolean isActive)
	 {
		 this.isActive = isActive;
	 }
	 
	 public boolean get_isActive()
	 {
		 return isActive;
	 }
	 
	 public void set_displayOrder( String displayOrder)
	 {
		 this.displayOrder = displayOrder;
	 }
	 
	 public String get_displayOrder() 
	 {
		return displayOrder; 
	 }
	 
	 public void set_lastUpdated(String lastUpdated)
	 {
		 this.lastUpdated = lastUpdated;
	 }
	 
	 public String get_lastUpdated()
	 {
		 return lastUpdated;
	 }
	 
	 public void set_imageURL(String imageURL)
	 {
		 this. imageURL = imageURL;
	 }
	 
	 public String get_imageURL()
	 {
		 return imageURL;
	 }	
}



































