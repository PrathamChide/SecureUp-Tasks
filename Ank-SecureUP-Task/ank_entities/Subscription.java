package ank_entities;

public class Subscription {
    private int subscriptionId;
    private int userId;
    private int categoryId;
    private String subscriptionDate;
    private boolean isActive;
    private String notificationPreference; // All Articles, Popular Articles, Weekly Digest
    private String lastCheckedDate;

    public void set_subscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int get_subscriptionId() {
        return subscriptionId;
    }

    public void set_userId(int userId) {
        this.userId = userId;
    }

    public int get_userId() {
        return userId;
    }

    public void set_categoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int get_categoryId() {
        return categoryId;
    }

    public void set_subscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public String get_subscriptionDate() {
        return subscriptionDate;
    }

    public void set_isActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean get_isActive() {
        return isActive;
    }

    public void set_notificationPreference(String notificationPreference) {
        this.notificationPreference = notificationPreference;
    }

    public String get_notificationPreference() {
        return notificationPreference;
    }

    public void set_lastCheckedDate(String lastCheckedDate) {
        this.lastCheckedDate = lastCheckedDate;
    }

    public String get_lastCheckedDate() {
        return lastCheckedDate;
    }

    // Main method for testing
    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.set_subscriptionId(1001);
        subscription.set_userId(5001);
        subscription.set_categoryId(3);
        subscription.set_subscriptionDate("2025-01-01");
        subscription.set_isActive(true);
        subscription.set_notificationPreference("Weekly Digest");
        subscription.set_lastCheckedDate("2025-01-17");

        // Display Subscription details
        System.out.println("Subscription Details:");
        System.out.println("Subscription ID: " + subscription.get_subscriptionId());
        System.out.println("User ID: " + subscription.get_userId());
        System.out.println("Category ID: " + subscription.get_categoryId());
        System.out.println("Subscription Date: " + subscription.get_subscriptionDate());
        System.out.println("Is Active: " + subscription.get_isActive());
        System.out.println("Notification Preference: " + subscription.get_notificationPreference());
        System.out.println("Last Checked Date: " + subscription.get_lastCheckedDate());
    }
}
