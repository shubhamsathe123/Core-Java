
package FileHandling;
import java.io.File;


public class Basic {
public static void main(String[] args) {
	File f=new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\Onkar");
	System.out.println("can file read"+f.canWrite());
	System.out.println("file name"+f.getName());
	System.out.println("file path"+f.getPath());
	System.out.println("file lenght"+f.length());

}
}
