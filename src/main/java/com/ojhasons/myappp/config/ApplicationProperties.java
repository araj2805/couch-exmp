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

   /* private Couchbase couchbase;

    public Couchbase getCouchbase() {
        return couchbase;
    }

    public void setCouchbase(Couchbase couchbase) {
        this.couchbase = couchbase;
    }

    public static class Couchbase
    {
        private String userName;

        private String password;

        private String hostname;

        private String bucket;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }
    }*/
}
