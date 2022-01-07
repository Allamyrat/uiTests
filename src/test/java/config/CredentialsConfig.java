package config;


import org.aeonbits.owner.Config;

@Config.Sources({"classpath:configuration.properties"})
public interface CredentialsConfig extends Config {
    @Key("homePageUrl")
    String homePageUrl();

    @Key("username")
    String username();

    @Key("password")
    String password();


}
