package dataSwitchStudy;

public class DbExecutor {

	static Database CreateDatabase(String dbname) {
		Database db = null;
		switch(dbname) {
		case "MySQL" : 
			db = new MySQL();
			break;
		case "Oracle" :
			db = new Oracle();
			break;
		}
		return db;
	}
	
	
	public static void main(String[] args) {
		
		Database db = CreateDatabase("MySQL");
		db.open();
		Database db2 = CreateDatabase("Oracle");
		db2.open();
	}

}
