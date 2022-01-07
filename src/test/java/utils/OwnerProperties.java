package utils;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("properties")
public class OwnerProperties {
    public static CredentialsConfig credentials=
            ConfigFactory.create(CredentialsConfig.class, System.getProperties());

    @Test
    public void check(){
        System.out.println(credentials.homePageUrl());
        System.out.println(credentials.password());
        System.out.println(credentials.username());
    }

}
