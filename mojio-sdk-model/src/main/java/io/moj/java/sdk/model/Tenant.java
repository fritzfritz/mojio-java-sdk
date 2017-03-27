package io.moj.java.sdk.model;

/**
 * Created by alstiefe on 21.03.2017.
 */
public class Tenant extends AbstractMojioObject {
    public static final String NAME = "Name";
    public static final String DESCRIPTION = "Description";
    public static final String USERS = "Users";
    public static final String TAGS = "Tags";

    private String Name;
    private String Description;
    private String[] Users;
    private String[] Tags;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String[] getUsers() {
        return Users;
    }

    public void setUsers(String[] users) {
        Users = users;
    }

    public String[] getTags() {
        return Tags;
    }

    public void setTags(String[] tags) {
        Tags = tags;
    }
}
