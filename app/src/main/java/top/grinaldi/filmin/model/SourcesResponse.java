package top.grinaldi.filmin.model;

import java.util.List;

/**
 * Created by Rehan on 14/05/2017.
 */

public class SourcesResponse {
    public String page;
    public List<Source> results;
    String url = "https://api.themoviedb.org/3/movie/now_playing?api_key=d4bee1442fda04e0b421566f1a54e4ae";
}
