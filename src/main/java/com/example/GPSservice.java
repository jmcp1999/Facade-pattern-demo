package com.example;

public class GPSservice implements MobileService {
    @Override
    public void start() {
        System.out.println("GPS Service started");
    }

    @Override
    public void close() {
        System.out.println("GPS Service closed");
    }
}
