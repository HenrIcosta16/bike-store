package com.example.bikestore.config;

import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.ssl.SSLContextBuilder;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Configuration
public class ElasticsearchConfig {

    @Bean
    public RestClient restClient() {
       /* return RestClient.builder(
            new HttpHost("localhost", 9200, "https"))
        .setHttpClientConfigCallback(httpClientBuilder -> {
            try {
                return httpClientBuilder
                    .setSSLContext(SSLContextBuilder.create()
                        .loadTrustMaterial((chain, authType) -> true)
                        .build())
                    .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
            } catch (NoSuchAlgorithmException | KeyStoreException | KeyManagementException e) {
                throw new RuntimeException("Failed to configure SSL", e);
            }
        })
        .build();*/
        return RestClient.builder(
                new HttpHost("localhost", 9200, "http"))         
            .build();
    }
}
