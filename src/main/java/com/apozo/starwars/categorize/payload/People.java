
package com.apozo.starwars.categorize.payload;

import java.net.URI;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * People
 * <p>
 * A person within the Star Wars universe
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eye_color",
    "mass",
    "films",
    "species",
    "birth_year",
    "homeworld",
    "edited",
    "starships",
    "name",
    "created",
    "gender",
    "url",
    "vehicles",
    "skin_color",
    "height",
    "hair_color"
})
public class People {

    /**
     * The eye color of this person.
     * (Required)
     * 
     */
    @JsonProperty("eye_color")
    @JsonPropertyDescription("The eye color of this person.")
    private String eyeColor;
    /**
     * The mass of this person in kilograms.
     * (Required)
     * 
     */
    @JsonProperty("mass")
    @JsonPropertyDescription("The mass of this person in kilograms.")
    private String mass;
    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of urls of film resources that this person has been in.")
    private List<Object> films = null;
    /**
     * The url of the species resource that this person is.
     * (Required)
     * 
     */
    @JsonProperty("species")
    @JsonPropertyDescription("The url of the species resource that this person is.")
    private List<Object> species = null;
    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     * 
     */
    @JsonProperty("birth_year")
    @JsonPropertyDescription("The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).")
    private String birthYear;
    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     * 
     */
    @JsonProperty("homeworld")
    @JsonPropertyDescription("The url of the planet resource that this person was born on.")
    private String homeworld;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * An array of starship resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("starships")
    @JsonPropertyDescription("An array of starship resources that this person has piloted")
    private List<Object> starships = null;
    /**
     * The name of this person.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this person.")
    private String name;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * The gender of this person (if known).
     * (Required)
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The gender of this person (if known).")
    private String gender;
    /**
     * The url of this resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The url of this resource")
    private URI url;
    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("vehicles")
    @JsonPropertyDescription("An array of vehicle resources that this person has piloted")
    private List<Object> vehicles = null;
    /**
     * The skin color of this person.
     * (Required)
     * 
     */
    @JsonProperty("skin_color")
    @JsonPropertyDescription("The skin color of this person.")
    private String skinColor;
    /**
     * The height of this person in meters.
     * (Required)
     * 
     */
    @JsonProperty("height")
    @JsonPropertyDescription("The height of this person in meters.")
    private String height;
    /**
     * The hair color of this person.
     * (Required)
     * 
     */
    @JsonProperty("hair_color")
    @JsonPropertyDescription("The hair color of this person.")
    private String hairColor;

    /**
     * The eye color of this person.
     * (Required)
     * 
     */
    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * The eye color of this person.
     * (Required)
     * 
     */
    @JsonProperty("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     * 
     */
    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     * 
     */
    @JsonProperty("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     * 
     */
    @JsonProperty("species")
    public List<Object> getSpecies() {
        return species;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     * 
     */
    @JsonProperty("species")
    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     * 
     */
    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     * 
     */
    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     * 
     */
    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     * 
     */
    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    public Date getEdited() {
        return edited;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    public void setEdited(Date edited) {
        this.edited = edited;
    }

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("starships")
    public List<Object> getStarships() {
        return starships;
    }

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("starships")
    public void setStarships(List<Object> starships) {
        this.starships = starships;
    }

    /**
     * The name of this person.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this person.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public Date getCreated() {
        return created;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * The url of this resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * The url of this resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("vehicles")
    public List<Object> getVehicles() {
        return vehicles;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("vehicles")
    public void setVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * The skin color of this person.
     * (Required)
     * 
     */
    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    /**
     * The skin color of this person.
     * (Required)
     * 
     */
    @JsonProperty("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    /**
     * The height of this person in meters.
     * (Required)
     * 
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    /**
     * The height of this person in meters.
     * (Required)
     * 
     */
    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * The hair color of this person.
     * (Required)
     * 
     */
    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    /**
     * The hair color of this person.
     * (Required)
     * 
     */
    @JsonProperty("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "People{" +
                "eyeColor='" + eyeColor + '\'' +
                ", mass='" + mass + '\'' +
                ", films=" + films +
                ", species=" + species +
                ", birthYear='" + birthYear + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", edited=" + edited +
                ", starships=" + starships +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", gender='" + gender + '\'' +
                ", url=" + url +
                ", vehicles=" + vehicles +
                ", skinColor='" + skinColor + '\'' +
                ", height='" + height + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
