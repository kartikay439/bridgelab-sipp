import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
public static void main(String[] args) {
	String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
	
	Pattern p = Pattern.compile(regex);
	
	Matcher emailMatcher = p.matcher("a@gmail.com");
	
	while(emailMatcher.find()) {
		System.out.println("Matched: "+emailMatcher.group());
	}
}
} 