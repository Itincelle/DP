package singleton;

public class DbSingleton {
	private static DbSingleton instance = null;
	private DbSingleton() {
		if(instance!=null) throw new RuntimeException("use getInstance methode for instanciation");
		
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) instance= new DbSingleton();
		return instance;
	}
	

}
