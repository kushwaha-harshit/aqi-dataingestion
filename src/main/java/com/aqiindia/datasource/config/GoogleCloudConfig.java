package com.aqiindia.datasource.config;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoogleCloudConfig {

    @Bean
    public Storage cloudStorage(){
        return StorageOptions.getDefaultInstance().getService();
    }

}
