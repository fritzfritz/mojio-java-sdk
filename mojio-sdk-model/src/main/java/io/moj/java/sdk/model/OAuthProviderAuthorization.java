package io.moj.java.sdk.model;

/**
 * Created by alstiefe on 05.04.2017.
 */
public class OAuthProviderAuthorization {

    private String type;
    private String source;
    private String validateAud;

    public String getType() {
        return type;
    }

    public OAuthProviderAuthorization setType(String type) {
        this.type = type;
        return this;
    }

    public String getSource() {
        return source;
    }

    public OAuthProviderAuthorization setSource(String source) {
        this.source = source;
        return this;
    }

    public String getValidateAud() {
        return validateAud;
    }

    public OAuthProviderAuthorization setValidateAud(String validateAud) {
        this.validateAud = validateAud;
        return this;
    }
}
