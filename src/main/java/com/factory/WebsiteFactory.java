package com.factory;

public class WebsiteFactory {
    public static Website getWebsite(String siteType){
        switch (siteType){
            case "blog": {
                return new Blog();
            }
            case "shop": {
                return new Shop();
            }
            default : {
                return null;
            }
        }
    }
    //So now we have our basic factory method and where we're getting this method from, we have our factory that calls
    //based off these types, but our true method is occurring, in our factory method pattern, is occurring in the Blog
    //Class in the createWebsite() method that's over written form our Website Class itself. That's what makes this a
    //bit more complicated of a pattern because there are a couple of moving pieces to it.
}
