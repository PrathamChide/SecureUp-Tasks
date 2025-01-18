package ank_entities;

public class UpvoteDownvote {
    private int voteId;
    private int articleId;
    private int userId;
    private String voteType; // Upvote, Downvote
    private String voteDate;
    private boolean isActive;

    public void set_voteId(int voteId) {
        this.voteId = voteId;
    }

    public int get_voteId() {
        return voteId;
    }

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

    public void set_voteType(String voteType) {
        this.voteType = voteType;
    }

    public String get_voteType() {
        return voteType;
    }

    public void set_voteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public String get_voteDate() {
        return voteDate;
    }

    public void set_isActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean get_isActive() {
        return isActive;
    }

    // Main method for testing
    public static void main(String[] args) {
        UpvoteDownvote upvote = new UpvoteDownvote();
        upvote.set_voteId(1);
        upvote.set_articleId(101);
        upvote.set_userId(5001);
        upvote.set_voteType("Upvote");
        upvote.set_voteDate("2025-01-18");
        upvote.set_isActive(true);

        // Display UpvoteDownvote details
        System.out.println("Upvote/Downvote Details:");
        System.out.println("Vote ID: " + upvote.get_voteId());
        System.out.println("Article ID: " + upvote.get_articleId());
        System.out.println("User ID: " + upvote.get_userId());
        System.out.println("Vote Type: " + upvote.get_voteType());
        System.out.println("Vote Date: " + upvote.get_voteDate());
        System.out.println("Is Active: " + upvote.get_isActive());
    }
}
