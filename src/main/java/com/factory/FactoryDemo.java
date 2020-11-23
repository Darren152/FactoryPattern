package com.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("blog");

        System.out.println(site.getPages());// This will display the pages available to the blog website.

        site = WebsiteFactory.getWebsite("shop");

        System.out.println(site.getPages());//This will display the pages available to the shop website.
    }

}
