package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class that holds city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns a whether the city is in list or not
     * @return
     *      Return a boolean of city existing in list
     */
    public boolean hasCity(City city){
        for (int i = 0; i < cities.size(); i++){
            if(city == cities.get(i)){
                return true;
            }

        }

    return false;
    }

    /**
     * This deletes city from list if it is in list
     *
     */

    public void delete(City city){
        if(hasCity(city) == true){
            for(int i = cities.size()-1; i > 0; i--){
                if(city == cities.get(i)){
                    cities.remove(i);

                }
            }
        }else{
            // throw exception
            throw new IllegalArgumentException();
            // Not most accurate, but we can not delete something that doesn't exist
            // so illegal argument

        }



    }

    /**
     * This returns the number of cities in the list
     * @return
     *      Return the number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }

}
