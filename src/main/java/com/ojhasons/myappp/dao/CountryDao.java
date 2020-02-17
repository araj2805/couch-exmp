package com.ojhasons.myappp.dao;

import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.query.N1qlQuery;
import com.ojhasons.myappp.model.Country;
import com.ojhasons.myappp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDao {

    @Autowired
    private CountryRepository countryRepository;


    public Country fetchCountryDetailsDao(String countryCode) {

        String statement = "select c.*,meta().id as _ID,meta().cas as _CAS from couchmusic c where c.type = $type and c.countryCode = $countryCode";
        JsonObject jsonObject = JsonObject.create().put("type","country").put("countryCode",countryCode);

        N1qlQuery n1qlQuery =  N1qlQuery.parameterized(statement,jsonObject);

        List<Country> countryList = countryRepository.getCouchbaseOperations().findByN1QL(n1qlQuery, Country.class);

        System.err.println(countryList.get(0));


        return countryList.get(0);
    }
}
