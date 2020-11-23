package com.factory2;

public class WebsiteFactory2 {
    public static Website2 getWebsite(WebsiteType2 siteType){ //Using WebsiteType2 to allow us to use Enums.
        switch(siteType){
            case ONLYFANS: {//Enum instead of string
                return new OnlyFans();
            }
            case LINKEDIN: {//Enum instead of string
                return new LinkedIn();
            }
            default: {
                return null;
            }
        }
    }
    //So now we have our basic factory method and where we're getting this method from, we have our factory that calls
    //based off these types, but our true method is occurring, in our factory method pattern, is occurring in the Blog
    //Class in the createWebsite() method that's over written form our Website Class itself. That's what makes this a
    //bit more complicated of a pattern because there are a couple of moving pieces to it.
}
