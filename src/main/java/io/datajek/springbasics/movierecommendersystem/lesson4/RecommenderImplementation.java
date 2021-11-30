package io.datajek.springbasics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select filter
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter)
    {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies (String Movie)
    {
        //print the name of interface implementation being used
        System.out.println("Name of filter in use: " + filter + "\n");

        return filter.getRecommendations("Finding Dory");
    }
}
