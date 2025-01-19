package Entites;

public class Message {
	 private int messageID;
	    private int senderID;
	    private int receiverID;
	    private String messageContent;
	    private String sentDate;
	    private boolean readStatus;
	    private String messageType;
	    private Integer responseMessageID;

	    // Getters and Setters
	    public int getMessageID() {
	        return messageID;
	    }

	    public void setMessageID(int messageID) {
	        this.messageID = messageID;
	    }

	    public int getSenderID() {
	        return senderID;
	    }

	    public void setSenderID(int senderID) {
	        this.senderID = senderID;
	    }

	    public int getReceiverID() {
	        return receiverID;
	    }

	    public void setReceiverID(int receiverID) {
	        this.receiverID = receiverID;
	    }

	    public String getMessageContent() {
	        return messageContent;
	    }

	    public void setMessageContent(String messageContent) {
	        this.messageContent = messageContent;
	    }

	    public String getSentDate() {
	        return sentDate;
	    }

	    public void setSentDate(String sentDate) {
	        this.sentDate = sentDate;
	    }

	    public boolean isReadStatus() {
	        return readStatus;
	    }

	    public void setReadStatus(boolean readStatus) {
	        this.readStatus = readStatus;
	    }

	    public String getMessageType() {
	        return messageType;
	    }

	    public void setMessageType(String messageType) {
	        this.messageType = messageType;
	    }

	    public Integer getResponseMessageID() {
	        return responseMessageID;
	    }

	    public void setResponseMessageID(Integer responseMessageID) {
	        this.responseMessageID = responseMessageID;
	    }

}
