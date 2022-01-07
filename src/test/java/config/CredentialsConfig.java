package config;


import org.aeonbits.owner.Config;

@Config.Sources({"classpath:resources/configuration.properties"})
public interface CredentialsConfig extends Config {
    String username();
    String password();
    String homePageUrl();
}
