package com.ojhasons.myappp.repository;

import com.ojhasons.myappp.model.Country;
import com.ojhasons.myappp.repository.N1qlCouchbaseRepository;

public interface CountryRepository extends N1qlCouchbaseRepository<Country,String> {
}
