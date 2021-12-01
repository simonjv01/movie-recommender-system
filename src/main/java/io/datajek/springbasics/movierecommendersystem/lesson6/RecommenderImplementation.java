package io.datajek.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select filter
    @Autowired
    @Qualifier("CF")
    private Filter filter;

//    public RecommenderImplementation(Filter filter)
//    {
//        super();
//        this.filter = filter;
//    }

    public String[] recommendMovies (String Movie)
    {
        //print the name of interface implementation being used
        System.out.println("Name of filter in use: " + filter + "\n");

        return filter.getRecommendations("Finding Dory");
    }
}
