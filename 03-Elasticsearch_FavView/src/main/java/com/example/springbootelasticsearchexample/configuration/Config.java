//package com.example.springbootelasticsearchexample.configuration;
//
//
//import org.elasticsearch.client.RestClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManagerFactory;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.security.*;
//import java.security.cert.Certificate;
//import java.security.cert.CertificateException;
//import java.security.cert.CertificateFactory;
//
//@Configuration
//class ElasitcSearchConfig extends ElasticsearchConfiguration {
//
//    @Value("${spring.elasticsearch.client.certificate}")
//    private String certificateBase64;
//
//    @Override
//	public ClientConfiguration clientConfiguration() {
//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .usingSsl(getSSLContext())
//                .withBasicAuth("elastic", "changeme")
//                .build();
//        return clientConfiguration;
//    }
//
//    private SSLContext getSSLContext() {
//    	
//        byte[] decode = Base64.getdecoder.decode(certificateBase64);
//
//        CertificateFactory cf = CertificateFactory.getInstance("X.509");
//
//        Certificate ca;
//        try (InputStream certificateInputStream = new ByteArrayInputStream(decode)) {
//            ca = cf.generateCertificate(certificateInputStream);
//        }
//
//        String keyStoreType = KeyStore.getDefaultType();
//        KeyStore keyStore = KeyStore.getInstance(keyStoreType);
//        keyStore.load(null, null);
//        keyStore.setCertificateEntry("ca", ca);
//
//        String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
//        TrustManagerFactory tmf = 
//   TrustManagerFactory.getInstance(tmfAlgorithm);
//        tmf.init(keyStore);
//
//        SSLContext context = SSLContext.getInstance("TLS");
//        context.init(null, tmf.getTrustManagers(), null);
//        return context;
//    }
//
//}