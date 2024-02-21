package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {


    public static Properties prop;
    //File propretiesfile  =  new File(System.getProperty())
     String propertiesPath = "C://Users//anis//IdeaProjects//AnisAzwaw2024//src//main//resources//ConfigFile.properties";


    public void getPropertie(){
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(propertiesPath);
        prop.load(fis);
        }
        catch (Exception e){
            e.getStackTrace();
            System.out.println("could't read the file");
        }


        }


    }

