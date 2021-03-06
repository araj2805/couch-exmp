package com.ojhasons.myappp.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Properties specific to Couch Exmp.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
//@Configuration
public class ApplicationProperties {

    private Couchbase couchbase;

    public Couchbase getCouchbase() {
        return couchbase;
    }

    public void setCouchbase(Couchbase couchbase) {
        this.couchbase = couchbase;
    }
}
