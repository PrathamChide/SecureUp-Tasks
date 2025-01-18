package beans;

public class AdmitAction {
		private int actionID; 
		private int userID;
		private int targetID; 
		private String action_Type; 
		private String comments;
		private String action_Date;
		
		
		public int get_actionID() 
		{
			return actionID;
		}
		public void set_actionID(int actionID) 
		{
			this.actionID = actionID;
		}
		public int get_userID() 
		{
			return userID;
		}
		public void set_userID(int userID) 
		{
			this.userID = userID;
		}
		public int get_targetID() 
		{
			return targetID;
		}
		public void set_targetID(int targetID) 
		{
			this.targetID = targetID;
		}
		public String ge_aAction_Type() 
		{
			return action_Type;
		}
		public void set_action_Type(String action_Type) 
		{
			this.action_Type = action_Type;
		}
		public String get_comments() 
		{
			return comments;
		}
		public void set_comments(String comments) 
		{
			this.comments = comments;
		}
		public String get_action_Date() 
		{
			return action_Date;
		}
		public void set_action_Date(String action_Date) 
		{
			this.action_Date = action_Date;
		}
		
}
