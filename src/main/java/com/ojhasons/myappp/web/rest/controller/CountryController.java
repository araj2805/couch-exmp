package com.ojhasons.myappp.web.rest.controller;

import com.ojhasons.myappp.model.Country;
import com.ojhasons.myappp.model.ErrorResponse;
import com.ojhasons.myappp.service.CountryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;



    @ApiOperation("Country Details")
    @GetMapping("/country/{countryCode}/details")
    public ResponseEntity<?> fetchCountryDetails (@PathVariable(value = "countryCode") String countryCode) throws Exception
    {
        Country country;
        ErrorResponse errorResponse;

        try {

            country = countryService.fetchCountryDetailsService(countryCode);

        }
        catch (Exception e)
        {
            errorResponse = new ErrorResponse();
            errorResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            errorResponse.setMessage("Error in fetching data or error in couchbase connection");
            return ResponseEntity.badRequest().body(errorResponse);
        }
        return ResponseEntity.ok(country);
    }
}
