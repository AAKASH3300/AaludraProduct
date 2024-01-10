package com.products.Aaludra.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Products" )
public class Product {
    private String module;
    private String about;
    private String advantages;
    private int price;

    public Product() {
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "module='" + module + '\'' +
                ", about='" + about + '\'' +
                ", advantages='" + advantages + '\'' +
                ", price=" + price +
                '}';
    }
}
