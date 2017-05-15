package io.moj.java.sdk.model;

/**
 * Created by alstiefe on 05.04.2017.
 *
 *
 *
 */
public class OAuthProviderClaim {

    private String immutableId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public String getImmutableId() {
        return immutableId;
    }

    public OAuthProviderClaim setImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public OAuthProviderClaim setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public OAuthProviderClaim setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public OAuthProviderClaim setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public OAuthProviderClaim setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
