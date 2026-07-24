package com.example;

public class PlacementService {
    // ref
    private PlacementApi placementApi;

    // constructor with attribute
    public PlacementService(PlacementApi placementApi) {
        this.placementApi = placementApi;
    }

    // method
    public String checkStatus(String rollno) {
        return placementApi.getStudents(rollno);
    }
}
