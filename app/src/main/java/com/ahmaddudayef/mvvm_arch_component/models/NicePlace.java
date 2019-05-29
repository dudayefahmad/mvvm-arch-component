package com.ahmaddudayef.mvvm_arch_component.models;

/**
 * Created by Ahmad Dudayef on 5/29/2019.
 */
public class NicePlace {
    private String title;
    private String imageUrl;

    public NicePlace(String imageUrl, String title) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public NicePlace() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
