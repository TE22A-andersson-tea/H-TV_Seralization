import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TvMain{
    private ArrayList<TvSeries> shows = new ArrayList<>();
    
    public TvMain(){
    Scanner sc = new Scanner(System.in);

    //File myObj = new File("myTvSeries.ser");

    readFromFile();

    }
   
    private void readFromFile(){
        TvSeries tvSeries1 = null;
        TvSeries tvSeries2 = null;
        
        try {
            FileInputStream fileIn = new FileInputStream("myTvSeries.ser"); //resposible for reading from the file
            ObjectInputStream objectIn = new ObjectInputStream(fileIn); //Responsible for building the objects

            //read from file
            //shows = (ArrayList<TvSeries>) objectIn.readObject();
            tvSeries1 = (TvSeries)objectIn.readObject();
            tvSeries2 = (TvSeries)objectIn.readObject();
            

            //close the streams
            fileIn.close();
            objectIn.close();

        } catch (IOException error){
            System.out.println("Could not read that...");
        } catch (ClassNotFoundException e){
            System.out.println("That class does not exist");
        }

        //shows.printInfo();
        try {
            shows.get(0).printInfo();
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("There are no shows");
        }

        tvSeries1.printInfo();
        tvSeries2.printInfo();
    }


    public void write2File(){
        TvSeries tvSeries1 = new TvSeries("TV1");
        TvSeries tvSeries2 = new TvSeries("TV2");

        try {
            FileOutputStream fileOut = new FileOutputStream("myTvSeries.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(shows);

            fileOut.close();
            objectOut.close();

            System.out.println("I have written");
        } catch (IOException error) {
            System.out.println("Could not write to file");
        }
    }
}

