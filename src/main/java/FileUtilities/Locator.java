package FileUtilities;

public class Locator {
	public final String email;
	public final String pass;
	
public Locator()
{
	email=PropertiesFile.getProperty("email");
	pass=PropertiesFile.getProperty("pass");
	
}
}