package com.luocj.demo.ch1.disc;

public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        String title = "Sgt.Pepper's Lonely Hearts Club Band";
        String artists = "The Beatles";
        System.out.println("Playing " + title + " By " + artists);
    }
}
