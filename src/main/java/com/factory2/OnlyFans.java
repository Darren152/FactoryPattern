package com.factory2;

public class OnlyFans extends Website2{

    @Override
    public void createWebsite2() {
        pages.add(new HomePage());
        pages.add(new DMPage());
        pages.add(new ProfilePage());
        pages.add(new ImagePage());
        pages.add(new VideoPage());
        pages.add(new ExplicitPage());
    }
}
