package utils;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;

@Tag("properties")
public class OwnerProperties {
    public static CredentialsConfig credentials=
            ConfigFactory.create(CredentialsConfig.class);
}