public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    /* Code the cutInHalf method that returns the first half of the word input. */
    public static String cutInHalf(String word) {
        int len = word.length() / 2;
        return word.substring(0, len);
    }
}