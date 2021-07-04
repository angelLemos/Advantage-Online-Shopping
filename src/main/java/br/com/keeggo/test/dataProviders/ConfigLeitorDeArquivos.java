package br.com.keeggo.test.dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigLeitorDeArquivos {
	
	private Properties prop;
	private final String local= "configs//Configuracao.properties";

	public ConfigLeitorDeArquivos(){
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(local));
		 prop = new Properties();
		 try {
		 prop.load(reader);
		 reader.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Configuracao.properties não encontrado em " + local);
		 } 
		 }
	
	public String getUrl() {
		 String url = prop.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("url não especificada no arquivo Configuracao.properties.");
		 }
		 
}
