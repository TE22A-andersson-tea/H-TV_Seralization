
import java.util.ArrayList;

public class TvSeries {
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating = 0;


    TvSeries(String name, int rating){
        this.name = name;
        this.rating = rating;
        episodes.add(1);
    }

    TvSeries(String Inname) {
        

    }

    public void addEpisodes(int numOfEpisodes, int season){

    }

    public void changeRating(){

    }

    public void printInfo(){
        System.out.println("Name: " + name + "\nRating: " + rating + "\nEpisodes " + episodes);
        
    }


    
}

