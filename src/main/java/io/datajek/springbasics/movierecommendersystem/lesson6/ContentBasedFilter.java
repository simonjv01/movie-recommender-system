package io.datajek.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie)
    {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
