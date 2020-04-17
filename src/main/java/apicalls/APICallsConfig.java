package apicalls;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class APICallsConfig {

    @Value("${server.port:1709}")
    private String port;

    @Value("${server.context:/covid}")
    private String context;

    final static Logger logger = LoggerFactory.getLogger(APICallsConfig.class);

    public static final String HTTP_CLIENT = "http_client";
    public static final String DELAY = "delay";

    @Bean
    public WebSecurityConfigurerAdapter webSecurity() {
        return new WebSecurityConfigurerAdapter() {

            @Override
            protected void configure(HttpSecurity http) throws Exception {
                http.headers().addHeaderWriter(
                        new StaticHeadersWriter("Access-Control-Allow-Origin", "*"));


            }
        };
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        logger.info("Setting custom configuration for Mainstay:");
        logger.info("Setting port to:", port);
        logger.info("Setting context to:", context);
        factory.setPort(Integer.valueOf(port));
        factory.setContextPath(context);
        return factory;
    }

    /**
     * @returns port as String
     */
    public String getPort() {
        return port;
    }

    /**
     * set application port
     *
     * @param port: String
     */
    public void setPort(String port) {
        this.port = port;
    }


    @Bean(name = HTTP_CLIENT)
    @Lazy
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HttpClient httpClient() {
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials basicCredentials = new UsernamePasswordCredentials("HGMEE", "45789");
        provider.setCredentials(AuthScope.ANY, basicCredentials);
        return HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
    }
}
