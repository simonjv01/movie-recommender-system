package io.datajek.springbasics.movierecommendersystem.lesson4;


public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie)
    {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
