package io.datajek.springbasics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    //use filter interface to select filter
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
