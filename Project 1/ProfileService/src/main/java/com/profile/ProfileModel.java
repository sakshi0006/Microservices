package com.profile;

import java.util.List;

public class ProfileModel {

    private int profileId;
    List<String> posts;
    List<String> notifications;

    public ProfileModel(int profileId, List<String> posts, List<String> notifications) {
        this.profileId = profileId;
        this.posts = posts;
        this.notifications = notifications;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(List<String> posts) {
        this.posts = posts;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

    @Override
    public String toString() {
        return "ProfileModel{" +
                "profileId=" + profileId +
                ", posts=" + posts +
                ", notifications=" + notifications +
                '}';
    }
}
