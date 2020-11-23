package com.factory2;

public class LinkedIn extends Website2{
    @Override
    public void createWebsite2() {
        pages.add(new ContactMePage());
        pages.add(new HomePage());
        pages.add(new ProfilePage());
        pages.add(new ResumePage());
    }
}
