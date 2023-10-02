package md.tekwillacademy.exceptionsservicetask;

public class TextManager {

    public static int getTheTextLength(String inputString){
        return inputString.length();
    }

    public static int getTheTextLengthWithTryAndCatch(String inputString){
        try {
            return inputString.length();
        } catch (NullPointerException exceptionFromTheTryBlock){
            exceptionFromTheTryBlock.printStackTrace();
            return 0;
        }
    }

    public static int getTheTextLengthWithIf(String inputText){
        if (inputText == null){
            return 0;
        } else {
            return inputText.length();
        }
    }
}
