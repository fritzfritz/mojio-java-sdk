package io.moj.java.sdk.model;

/**
 * Created by alstiefe on 05.04.2017.
 */
public class OAuthProvider {

    private String providerName;
    private String description;
    private String tenantId;

    private Boolean deleted;

    private OAuthProviderClaim claims;
    private OAuthProviderAuthorization authorization;

    public String getProviderName() {
        return providerName;
    }

    public OAuthProvider setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OAuthProvider setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public OAuthProvider setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public OAuthProvider setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public OAuthProviderClaim getClaims() {
        return claims;
    }

    public OAuthProvider setClaims(OAuthProviderClaim claims) {
        this.claims = claims;
        return this;
    }

    public OAuthProviderAuthorization getAuthorization() {
        return authorization;
    }

    public OAuthProvider setAuthorization(OAuthProviderAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
}
