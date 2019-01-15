package com.evrencoskun.tableviewsample.model;

public class ServiceRequest {

    private int size;
    private int page;

    public ServiceRequest(int size, int page) {
        this.size = size;
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public int getPage() {
        return page;
    }
}
