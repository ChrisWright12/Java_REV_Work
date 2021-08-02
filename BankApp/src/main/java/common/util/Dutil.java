package common.util;



import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dutil {
	
	private static final Logger logger = LogManager.getLogger(Dutil.class);
	
	private static Dutil _instance;
	private Connection conn = null;
	
	private Dutil() {
		
	}
	
	public static Dutil getInstance() {
		if(_instance == null) {
			_instance = new Dutil();
		}
		return _instance;
	}
	
	public Connection getConnection() throws Exception {
		if(this.conn == null) {
			
			String configFilePath = System.getProperty(util.CONFIG_FILE);
			
			logger.info("Reading config file in location: "+configFilePath);
			
			try(FileInputStream fis = new FileInputStream(configFilePath)){
				
				Properties props = new Properties();
				props.load(fis);
				
				this.conn = DriverManager.getConnection(props.getProperty(util.DB_URL),
						props.getProperty(util.DB_USER),
						props.getProperty(util.DB_PASSWORD));
				
			} catch (Exception e) {
				logger.warn("Unable to get database connection",e);
				throw e;
			}
			
		}
		return this.conn;
	}

	

}
