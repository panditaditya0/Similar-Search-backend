package com.apndt.similarImage.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class ImageData {
    public UUID ab_id;
    @Id
    @JsonProperty("product_id")
    public Long productId;
    @JsonProperty("link")
    public String redirectLink;
    public String title;
    public String brand;
    @JsonProperty("image_link")
    public String imageLink;
    public String description;
    public String gender;
    public String color;
    public String product_type;

    public ImageData(){

    }

    public ImageData(UUID uuid, Long productId, String redirect_link, String title, String brand, String image_link, String description, String gender, String color, String product_type) {
        this.ab_id = uuid;
        this.productId = productId;
        this.redirectLink = redirect_link;
        this.title = title;
        this.brand = brand;
        this.imageLink = image_link;
        this.description = description;
        this.gender = gender;
        this.color = color;
        this.product_type = product_type;
    }

    public UUID getAb_id() {
        return ab_id;
    }

    public void setAb_id(UUID uuid) {
        this.ab_id = uuid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getRedirect_link() {
        return redirectLink;
    }

    public void setRedirect_link(String redirect_link) {
        this.redirectLink = redirect_link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage_link() {
        return imageLink;
    }

    public void setImage_link(String image_link) {
        this.imageLink = image_link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
}
