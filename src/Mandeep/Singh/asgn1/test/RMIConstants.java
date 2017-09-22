package Mandeep.Singh.asgn1.test;

public class RMIConstants {
	// IP address of server is not required on server 
	// "127.0.0.1"means "localhost"
	public static final String HOST_IP="10.28.37.139";
	// port on which RMI registry is listening 
	//(fixed by server)
	public static final int RPORT = 5555;
	// name used to bind CourseCatalogobject to RMI registry 
	public static final String CID= "courseCatalog";
}
