
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class TvSeries implements Serializable{
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating = 0;
    Scanner sc = new Scanner(System.in);


   /*  TvSeries(String name, int rating){
        this.name = name;
        this.rating = rating;
        episodes.add(1);
    }*/

    public TvSeries() {
        System.out.println("What is the name of the TV series? ");
        String inName = sc.nextLine();
    }

    public TvSeries(String inName) {
        name = inName;
    }

    public void addEpisodes(int numOfEpisodes, int season){
        episodes.add(1,1);
    }

    public void changeRating(int newRating){
        System.out.println("What would you like to rate the series? ");
        newRating = sc.nextInt();
        rating = newRating;
    }

    public void printInfo(){
        System.out.println("Name: " + name + "\nRating: " + rating + "\nEpisodes " + episodes);
        
    }


    
}

