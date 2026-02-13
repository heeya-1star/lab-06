package com.example.listycity;


/**
 * This is a class that defines a city with its name and province
 * as a string
 *
 */

public class City implements Comparable<City>  {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns name of city
     * @return
     *      Return the name of city as string
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns name of city's province
     * @return
     *      Return the name of province as string
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This returns a int to use to compare when sorting
     * @return
     *      int comparing index
     */

    @Override
    public int compareTo(City o) {
         City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}



