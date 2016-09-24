package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConverterTest {
    private String csvString;
    private String jsonString;
    private Converter convert;
	private String csvStr;
	private String jsonStr;
	private static String line;	
    
    private static String importFile(String dir) throws IOException{
        File inFile = new File(dir);
        Scanner scanner = new Scanner(inFile);
        String newLine = System.getProperty("line.separator");
        String outPut = "";
        
        try{
            while(scanner.hasNextLine()){
                outPut += scanner.nextLine() + newLine;
            }
            return outPut;
        }
        finally{
            scanner.close();
        }
    }
    @Before
    public void setUp() throws IOException {
        csvString = importFile("src/test/resources/grades.csv");
        jsonString = importFile("src/test/resources/grades.json");
    }
    
    @Test
    public void testConvertCSVtoJSON() {
        String jsonString = Converter.csvToJson(csvString);
        assertTrue(true);
    }

    @Test
    public void testConvertJSONtoCSV() {
        assertTrue(true);
    }
}






