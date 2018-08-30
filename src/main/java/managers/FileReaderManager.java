package managers;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReader = new FileReaderManager();
	private static ConfigFileReader config;
	private static JsonDataReader jsonDataReader;
	
	public static FileReaderManager getInstance() {
		return fileReader;
	}
	
	public ConfigFileReader getConfigReader() {
		return(config == null) ? config = new ConfigFileReader() : config;
	}
	
	public JsonDataReader getJsonReader() {
		return(jsonDataReader == null) ? jsonDataReader = new JsonDataReader() : jsonDataReader;
	}

}
