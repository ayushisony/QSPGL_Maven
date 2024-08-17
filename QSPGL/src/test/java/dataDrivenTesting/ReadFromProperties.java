package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		Properties property = new Properties();
		property.load(fis);
		String url =property.getProperty("url");
		String un =property.getProperty("username");
		String pw =property.getProperty("password");
		System.out.println(url + "\n"+ un+"\t"+ pw);

	}

}
