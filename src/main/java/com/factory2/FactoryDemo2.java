package com.factory2;

import com.factory.Website;

public class FactoryDemo2 {

    public static void main(String[] args) {
        Website2 site = WebsiteFactory2.getWebsite(WebsiteType2.LINKEDIN); //Changed from a string literal to an enum.

        System.out.println(site.getPages2());//This will display the pages available to the "linkedIn" website.

        site = WebsiteFactory2.getWebsite(WebsiteType2.ONLYFANS); //Changed from a string literal to an enum.

        System.out.println(site.getPages2());//This will display the pages available to the "onlyFans" website.
    }
}
