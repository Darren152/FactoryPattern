package com.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();// What we have are holders for the pages that we are going to create.

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();//This is the crux of teh factory method pattern. So all of the concrete classes,
    //that implement this base class, are going to go through and override this method to generate those.

    public List<Page> getPages() {
        return pages;
    }
}
