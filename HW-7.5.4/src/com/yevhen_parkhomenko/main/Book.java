package com.yevhen_parkhomenko.main;

public class Book implements IItem, IDiscount, IPromocode {
    public void setPrice(double price) { }
    public void applyDiscount(String discount) { }
    public void applyPromocode(String promocode) { }
}