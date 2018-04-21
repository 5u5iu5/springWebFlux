
package com.apozo.starwars.categorize.payload;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "films",
    "species",
    "created",
    "starships",
    "eye_color",
    "name",
    "vehicles",
    "skin_color",
    "url",
    "homeworld",
    "height",
    "mass",
    "birth_year",
    "edited",
    "hair_color",
    "gender"
})
public class Properties {

    @JsonProperty("films")
    private Films films;
    @JsonProperty("species")
    private Species species;
    @JsonProperty("created")
    private Created created;
    @JsonProperty("starships")
    private Starships starships;
    @JsonProperty("eye_color")
    private EyeColor eyeColor;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("vehicles")
    private Vehicles vehicles;
    @JsonProperty("skin_color")
    private SkinColor skinColor;
    @JsonProperty("url")
    private Url url;
    @JsonProperty("homeworld")
    private Homeworld homeworld;
    @JsonProperty("height")
    private Height height;
    @JsonProperty("mass")
    private Mass mass;
    @JsonProperty("birth_year")
    private BirthYear birthYear;
    @JsonProperty("edited")
    private Edited edited;
    @JsonProperty("hair_color")
    private HairColor hairColor;
    @JsonProperty("gender")
    private Gender gender;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("films")
    public Films getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(Films films) {
        this.films = films;
    }

    @JsonProperty("species")
    public Species getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(Species species) {
        this.species = species;
    }

    @JsonProperty("created")
    public Created getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Created created) {
        this.created = created;
    }

    @JsonProperty("starships")
    public Starships getStarships() {
        return starships;
    }

    @JsonProperty("starships")
    public void setStarships(Starships starships) {
        this.starships = starships;
    }

    @JsonProperty("eye_color")
    public EyeColor getEyeColor() {
        return eyeColor;
    }

    @JsonProperty("eye_color")
    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("vehicles")
    public Vehicles getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    @JsonProperty("skin_color")
    public SkinColor getSkinColor() {
        return skinColor;
    }

    @JsonProperty("skin_color")
    public void setSkinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
    }

    @JsonProperty("url")
    public Url getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Url url) {
        this.url = url;
    }

    @JsonProperty("homeworld")
    public Homeworld getHomeworld() {
        return homeworld;
    }

    @JsonProperty("homeworld")
    public void setHomeworld(Homeworld homeworld) {
        this.homeworld = homeworld;
    }

    @JsonProperty("height")
    public Height getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Height height) {
        this.height = height;
    }

    @JsonProperty("mass")
    public Mass getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass(Mass mass) {
        this.mass = mass;
    }

    @JsonProperty("birth_year")
    public BirthYear getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(BirthYear birthYear) {
        this.birthYear = birthYear;
    }

    @JsonProperty("edited")
    public Edited getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(Edited edited) {
        this.edited = edited;
    }

    @JsonProperty("hair_color")
    public HairColor getHairColor() {
        return hairColor;
    }

    @JsonProperty("hair_color")
    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
