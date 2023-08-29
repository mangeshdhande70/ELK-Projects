//package com.example.springbootelasticsearchexample.configuration;
//
//import org.apache.http.HttpHost;
//import org.apache.http.auth.AuthScope;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.client.CredentialsProvider;
//import org.apache.http.impl.client.BasicCredentialsProvider;
//import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
//import org.apache.http.ssl.SSLContextBuilder;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestClientBuilder.HttpClientConfigCallback;
//import org.elasticsearch.client.RestClientBuilder.RequestConfigCallback;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.SSLException;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.security.*;
//import java.security.cert.CertificateException;
//
//@Configuration
//public class CustomElasticsearchConfiguration {
//
//    @Value("${elasticsearch.host}")
//    private String elasticsearchHost;
//
//    @Value("${elasticsearch.port}")
//    private int elasticsearchPort;
//
//    @Value("${elasticsearch.ssl.enabled}")
//    private boolean sslEnabled;
//
//    @Value("${elasticsearch.ssl.keystore.path}")
//    private String keystorePath;
//
//    @Value("${elasticsearch.ssl.keystore.password}")
//    private String keystorePassword;
//
//    @Value("${elasticsearch.ssl.truststore.path}")
//    private String truststorePath;
//
//    @Value("${elasticsearch.ssl.truststore.password}")
//    private String truststorePassword;
//
//    @Value("${elasticsearch.username}")
//    private String username;
//
//    @Value("${elasticsearch.password}")
//    private String password;
//
//    @Bean
//    public RestClient elasticsearchClient() {
//        RestClientBuilder builder = RestClient.builder(new HttpHost(elasticsearchHost, elasticsearchPort));
//
//        // Configure SSL/TLS if enabled
//        if (sslEnabled) {
//            try {
//            	
//            	
//            	 SSLContextBuilder.create().loadKeyMaterial(null, null);
//                SSLContext sslContext = SSLContextBuilder.create()
//                		.loadKeyMaterial(new FileInputStream(keystorePath), keystorePassword.toCharArray())
//                        .loadTrustMaterial(new FileInputStream(truststorePath), truststorePassword.toCharArray())
//                        .build();
//
//                builder.setHttpClientConfigCallback(new HttpClientConfigCallback() {
//                    @Override
//                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//                        return httpClientBuilder.setSSLContext(sslContext);
//                    }
//                });
//            } catch (NoSuchAlgorithmException | KeyStoreException | IOException | CertificateException | UnrecoverableKeyException | KeyManagementException e) {
//                // Handle SSL configuration exception
//                throw new IllegalStateException("Failed to configure SSL for Elasticsearch.", e);
//            }
//        }
//
//        // Configure authentication if username and password are provided
//        if (username != null && password != null) {
//            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
//
//            builder.setHttpClientConfigCallback(new HttpClientConfigCallback() {
//                @Override
//                public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//                    return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//                }
//            });
//        }
//
//        return builder.build();
//    }
//}