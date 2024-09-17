package hws.example.e184;

import java.util.ArrayList;
import java.util.List;

public class E184CountryList {

    public static List<String> removeCountriesStartingWithA(List<String> countries) {
        countries.removeIf(country -> country.startsWith("A"));
        return countries;
    }

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Argentina");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");

        List<String> updatedCountries = removeCountriesStartingWithA(countries);
        System.out.println("Updated country list: " + updatedCountries);
    }
    }

