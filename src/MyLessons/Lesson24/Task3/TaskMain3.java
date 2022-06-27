package MyLessons.Lesson24.Task3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskMain3 {
    public static void main(String[] args) {
        System.out.println(replaceOop("Object-oriented programming is a programming language " +
                "model organized around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming bla."));

    }

    static String replaceOop(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        Pattern pattern = Pattern.compile("object-oriented programming");
        Matcher matcher = pattern.matcher(str.toLowerCase());
        int index = 1;
        while(matcher.find()){
            if((index%2) == 0){
                stringBuilder.replace(matcher.start(), matcher.end(), "OOP");
            }
            index++;
        }
        str = stringBuilder.toString();
        return str;
    }


}
