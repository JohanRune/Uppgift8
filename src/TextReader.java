import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Johan Rune
 * Date: 2020-10-08
 * Time: 10:31
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class TextReader<arrayCreator> {

    //LinkedList<String> tempString = new LinkedList<String>();
    List<Double> temp = new LinkedList<Double>();
    final String tempPath = "temp.txt";

    //jag såg
    //
    // i facit för att lösa detta.
    public List<Double> arrayCreator(String tempPath){
        List<Double> allMeasurments = new ArrayList<>();
        //String tempLine;

        try {
            Scanner scanner = new Scanner(new File(tempPath));
            //tempLine = scanner.nextLine();
            while (scanner.hasNextDouble()){ //denna rad hämtade jag från facit. Jag borde tänkt ut lösning själv.
                //temp.add(Double.parseDouble(toPunkt(scanner.nextLine())));
                allMeasurments.add(Double.parseDouble(toPunkt(scanner.nextLine())));
            }

            /*
       public List<Double> arrayCreator(String tempPath){
        List<Double> allMeasurments = new ArrayList<>();
        String tempLine;
        try {
            BufferedReader bufIn = new BufferedReader(new FileReader
                    (tempPath));
    //med BufferedReader kan vi läsa en rad i taget
            while((tempLine = bufIn.readLine()) != null){
                temp.add(Double.parseDouble(toPunkt(tempLine))); //ska inte vara temp utan allMeasurments.
            }
        }
        catch (Exception e){
            System.out.println("Något gick fel");
        }
        return temp; //ska inte vara temp utan allMeasurments.
            }*/

        }
        catch (Exception e){
            System.out.println("Något gick fel");
        }
//        return temp;
            return allMeasurments;
    }

    public String toPunkt(String s){
        return s.replace(",", ".");
    }



    public double highestTemp (List<Double> temp){
        double highest = -Double.MAX_VALUE;

        for (int i = 0; i < temp.size(); i++) {
            highest = Math.max(highest, temp.get(i));
        }
        return highest;
    }


    public double lowestTemp (List<Double> temp){
        double lowest = Double.MAX_VALUE;

        for (int i = 0; i < temp.size(); i++) {
            lowest = Math.min(lowest, temp.get(i));
        }
        return lowest;
    }

    public void print (){
    StringBuilder sb = new StringBuilder();
        sb.append("Max ").append(highestTemp(temp)).append(", min " + lowestTemp(temp)).append("\nmedel ").append(averageTemp(temp));
        System.out.println(sb);
    }


    public void mainProgram() {
        temp = arrayCreator(tempPath);
        print();
    }


    public double averageTemp(List<Double> temp) {
        double sum = 0;
        for (double d : temp) {
            sum = sum + d;
        }
        return sum / temp.size();
    }
}
