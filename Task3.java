import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task3{
public static void main(String[] args){
Pattern compile=Pattern.compile("[a-z]{7}[.][a-z]{1}@gmail[.][a-z]{3}");
Matcher matcher=compile.matcher("jayasri.t@gmail.com");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
