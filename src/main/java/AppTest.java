import org.apache.commons.validator.routines.UrlValidator;

public class AppTest {
    public static void main(String[] args) {
        if(UrlValidator.getInstance().isValid("http://example.com/path/to/resource?")){
            System.out.println("Path is valid");
        }
    }
}
