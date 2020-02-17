package com.ojhasons.myappp.model;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.Objects;

@Document
public class Country {


    private String id;

    @Field("gdp")
    private Integer gdp;

    @Field("updated")
    private String updated;

    @Field("region-number")
    private String regionNumber;

    @Field("name")
    private String name;

    @Field("type")
    private String type;

    @Field("population")
    private Long population;

    @Field("countryCode")
    private String countryCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getGdp() {
        return gdp;
    }

    public void setGdp(Integer gdp) {
        this.gdp = gdp;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getRegionNumber() {
        return regionNumber;
    }

    public void setRegionNumber(String regionNumber) {
        this.regionNumber = regionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
            "id='" + id + '\'' +
            ", gdp=" + gdp +
            ", updated='" + updated + '\'' +
            ", regionNumber='" + regionNumber + '\'' +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", population=" + population +
            ", countryCode='" + countryCode + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) &&
            Objects.equals(gdp, country.gdp) &&
            Objects.equals(updated, country.updated) &&
            Objects.equals(regionNumber, country.regionNumber) &&
            Objects.equals(name, country.name) &&
            Objects.equals(type, country.type) &&
            Objects.equals(population, country.population) &&
            Objects.equals(countryCode, country.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gdp, updated, regionNumber, name, type, population, countryCode);
    }
}
