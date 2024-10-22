import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TvMain{
    private ArrayList<TvSeries> shows = new ArrayList<>();
   
    public void readFromFile(){
        TvSeries tvSeries1 = null;
        TvSeries tvSeries2 = null;
        
        
        try {
            FileInputStream fileIn = new FileInputStream("myTvSeries.ser"); //resposible for reading from the file
            ObjectInputStream objectIn = new ObjectInputStream(fileIn); //Responsible for building the objects

            //read from file
            tvSeries1 = (TvSeries) objectIn.readObject();
            tvSeries2 = (TvSeries) objectIn.readObject();

            //close the streams
            fileIn.close();
            objectIn.close();
        } catch (Exception error){
            System.out.println("Could not read that...");
        }

        tvSeries1.printInfo();
        tvSeries2.printInfo();
    }


    public void write2File(){

    }
}

