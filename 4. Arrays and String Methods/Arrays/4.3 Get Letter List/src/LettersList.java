public class LettersList
{
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    /* Complete the getLettersList method that get the list of letters in the input word. */
    public static String[] getLettersList(String phrase) {
        String[] letters = new String[phrase.length()];
        for (int i = 0; i < phrase.length(); i++) {
            letters[i] = phrase.substring(i, i + 1);
        }
        return letters;
    }
}
