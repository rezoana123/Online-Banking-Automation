import com.generic.AutomationPractice;
import com.utilpackage.Baseconfig;

public class TestRun {
	
	public static void main(String[] args) throws Exception {
		 Baseconfig obj = new Baseconfig();
		 obj.getconfig("URL");
		 obj.getconfig("PASSWORD");
		 obj.getconfig("USERNAME");
	} 
}
