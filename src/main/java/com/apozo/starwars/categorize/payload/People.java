package com.apozo.starwars.categorize.payload;

import java.net.URI;
import java.util.Date;
import java.util.List;

public class People{
    /**
     * The eye color of this person.
     * (Required)
     *
     */
    private String eyeColor;
    /**
     * The mass of this person in kilograms.
     * (Required)
     *
     */
    private String mass;
    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     *
     */
    private List<Object> films = null;
    /**
     * The url of the species resource that this person is.
     * (Required)
     *
     */
    private List<Object> species = null;
    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     *
     */
    private String birthYear;
    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     *
     */
    private String homeworld;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     *
     */
    private Date edited;
    /**
     * An array of starship resources that this person has piloted
     * (Required)
     *
     */
    private List<Object> starships = null;
    /**
     * The name of this person.
     * (Required)
     *
     */
    private String name;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     *
     */
    private Date created;
    /**
     * The gender of this person (if known).
     * (Required)
     *
     */
    private String gender;
    /**
     * The url of this resource
     * (Required)
     *
     */
    private URI url;
    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     *
     */
    private List<Object> vehicles = null;
    /**
     * The skin color of this person.
     * (Required)
     *
     */
    private String skinColor;
    /**
     * The height of this person in meters.
     * (Required)
     *
     */
    private String height;
    /**
     * The hair color of this person.
     * (Required)
     *
     */
    private String hairColor;

    /**
     * The eye color of this person.
     * (Required)
     *
     */
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * The eye color of this person.
     * (Required)
     *
     */
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     *
     */
    public String getMass() {
        return mass;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     *
     */
    public void setMass(String mass) {
        this.mass = mass;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     *
     */
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     *
     */
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     *
     */
    public List<Object> getSpecies() {
        return species;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     *
     */
    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     *
     */
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     *
     */
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     *
     */
    public String getHomeworld() {
        return homeworld;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     *
     */
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     *
     */
    public Date getEdited() {
        return edited;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     *
     */
    public void setEdited(Date edited) {
        this.edited = edited;
    }

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     *
     */
    public List<Object> getStarships() {
        return starships;
    }

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     *
     */
    public void setStarships(List<Object> starships) {
        this.starships = starships;
    }

    /**
     * The name of this person.
     * (Required)
     *
     */
    public String getName() {
        return name;
    }

    /**
     * The name of this person.
     * (Required)
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     *
     */
    public Date getCreated() {
        return created;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     *
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     *
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * The url of this resource
     * (Required)
     *
     */
    public URI getUrl() {
        return url;
    }

    /**
     * The url of this resource
     * (Required)
     *
     */
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     *
     */
    public List<Object> getVehicles() {
        return vehicles;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     *
     */
    public void setVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * The skin color of this person.
     * (Required)
     *
     */
    public String getSkinColor() {
        return skinColor;
    }

    /**
     * The skin color of this person.
     * (Required)
     *
     */
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    /**
     * The height of this person in meters.
     * (Required)
     *
     */
    public String getHeight() {
        return height;
    }

    /**
     * The height of this person in meters.
     * (Required)
     *
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * The hair color of this person.
     * (Required)
     *
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * The hair color of this person.
     * (Required)
     *
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}