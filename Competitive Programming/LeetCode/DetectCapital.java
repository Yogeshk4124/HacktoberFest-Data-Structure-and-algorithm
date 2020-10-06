public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        // lets do it by counts
        int lowercaseCount = 0, uppercaseCount = 0, lowercase = 0;
        char ch[] = word.toCharArray();
        if (Character.isUpperCase(ch[0])) {
            uppercaseCount++;
            for (int i = 1; i < ch.length; i++) {
                if (Character.isUpperCase(ch[i])) {
                    uppercaseCount++;
                } else if (Character.isLowerCase(ch[i])) {
                    lowercase++;
                }
            }
        } else if (Character.isLowerCase(ch[0])) {
            lowercaseCount++;
            for (int i = 1; i < ch.length; i++) {
                if (!Character.isLowerCase(ch[i])) {
                    return false;
                } else {
                    lowercaseCount++;
                }
            }
        }

        if (lowercaseCount == word.length() || uppercaseCount == word.length()
                || (uppercaseCount == 1 && lowercase == word.length() - 1)) {
            return true;
        }

        return false;
    }

}

class DetectCapitalDemo {
    public static void main(String[] args) {
        String word = "j";
        DetectCapital dc = new DetectCapital();
        System.out.println(dc.detectCapitalUse(word));
    }
}