import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadTestFile {
    public static void main(String[] args) throws Exception {
        String resultDirName = "C:\\Users\\MohammodH\\OneDrive - Magenic\\Documents\\Result File\\";
        String resultFileName = resultDirName + "org.example.test.JMAQSSoapWebServiceDriverTest.TIBCOTestWithParsing - 2020-11-18-15-58-52-2480.txt";
        String resultString = "";
        String tcId = "";

        BufferedReader br = new BufferedReader(new FileReader(resultFileName));


        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("Test Passed")) {
                resultString = "PASS";
                System.out.println(resultString);
            } else if (line.contains("Test Failed")) {
                resultString = "FAIL";
                System.out.println(resultString);
            } else if (line.contains("Test Case ID:")) {
                String[] tokens = line.split(":");
                tcId = tokens[2].trim();
            }
            //System.out.println(line);
        }

        if (tcId.isEmpty()) {
            throw new Exception("Did not find test case ID value in file " + resultFileName);
        }

        if (resultString.isEmpty()) {
            throw new Exception("Did not find test result value in file " + resultFileName);
        }
    }
}
