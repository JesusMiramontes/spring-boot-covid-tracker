package com.miramontes.covidcasestracker.models;

import lombok.Data;

@Data
public class LocationStat {
    private String state;
    private String country;
    private Integer latestTotalCases;
    private Integer diffFromPrevDayCases;
}
