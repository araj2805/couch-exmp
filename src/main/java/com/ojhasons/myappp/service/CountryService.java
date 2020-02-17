package com.ojhasons.myappp.service;

import com.ojhasons.myappp.dao.CountryDao;
import com.ojhasons.myappp.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public Country fetchCountryDetailsService(String countryCode) throws Exception {

        Country country = countryDao.fetchCountryDetailsDao(countryCode);

        if(country == null)
        {
            throw new Exception("ERROR IN FETCHING DATA FROM DAO!! EXCEPTION ARISES");
        }

        return country;
    }
}
