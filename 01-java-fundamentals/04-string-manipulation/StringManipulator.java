public class StringManipulator{
    public String trimAndConcat(String firstWord, String secondWord) {
        firstWord = firstWord.trim();
        secondWord = secondWord.trim();
        return firstWord.concat(secondWord);
    }
    public Integer getIndexOrNull(String str, char letter) {
        if (str.indexOf(letter) >= 0){
            return str.indexOf(letter);
        } else {
            return null;
        }
    }
    public String concatSubstring(String str1, int c, int d, String str2){
        str1 = str1.substring(c, d);
        return str1.concat(str2);
    }
}