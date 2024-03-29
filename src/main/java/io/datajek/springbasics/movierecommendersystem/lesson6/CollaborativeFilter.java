package io.datajek.springbasics.movierecommendersystem.lesson6;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie)
    {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
