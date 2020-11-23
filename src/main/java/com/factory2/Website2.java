package com.factory2;

import java.util.ArrayList;
import java.util.List;

public abstract class Website2 {

    protected List<Page2> pages = new ArrayList<>();// What we have are holders for the pages that we are going to create.

    public Website2(){
        this.createWebsite2();
    }

    public abstract void createWebsite2();//This is the crux of the factory method pattern. So all of the concrete classes,
    //that implement this base class, are going to go through and override this method to generate those.

    public List<Page2> getPages2(){
        return pages;
    }
}
