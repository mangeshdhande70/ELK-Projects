//package com.example.springbootelasticsearchexample.configuration;
//
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.example.springbootelasticsearchexample.repo")
//@ComponentScan(basePackages = "com.siolbca.services")
//public class SSLConfiguration {
//    @Bean
//    public RestHighLevelClient createSimpleElasticClient() throws Exception {
//        try {
//            final CredentialsProvider credentialsProvider =
//                    new BasicCredentialsProvider();
//                credentialsProvider.setCredentials(AuthScope.ANY,
//                    new UsernamePasswordCredentials("elastic","G0D1g6TurJ79pcxr1065pU0U"));
//                
//            SSLContextBuilder sslBuilder = SSLContexts.custom()
//                    .loadTrustMaterial(null, (x509Certificates, s) -> true);
//                    final SSLContext sslContext = sslBuilder.build();
//            RestHighLevelClient client = new RestHighLevelClient(RestClient
//                    .builder(new HttpHost("elasticsearch-siol-es-http.siolbca-dev.svc.cluster.local", 9200, "https")) 
////port number is given as 443 since its https schema
//                    .setHttpClientConfigCallback(new HttpClientConfigCallback() {
//                        @Override
//                        public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//                            return httpClientBuilder
//                                     .setSSLContext(sslContext)
//                                     .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
//                                     .setDefaultCredentialsProvider(credentialsProvider);
//                        }
//                    })
//                    .setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
//                        @Override
//                        public RequestConfig.Builder customizeRequestConfig(
//                                RequestConfig.Builder requestConfigBuilder) {
//                            return requestConfigBuilder.setConnectTimeout(5000)
//                                    .setSocketTimeout(120000);
//                        }
//                    }));
//            System.out.println("elasticsearch client created");
//            return client;
//        } catch (Exception e) {
//            System.out.println(e);
//            throw new Exception("Could not create an elasticsearch client!!");
//        }
//    }
//    
//}
