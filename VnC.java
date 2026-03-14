public class VnC {
       
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                           ch=='O' || ch=='U');
    }
      static boolean isconsonent(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='B' || ch=='C' || ch=='D' ||
                           ch=='F' || ch=='G' || ch == 'H'
                       || ch == 'J');
    }
    static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) 
                ++count;
        return count;
    }
     static int countconso(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isconsonent(str.charAt(i))) 
                ++count;
        return count;
    }
     
    public static void main(String args[])
    {
        String str = "jabe";
     
        // Total numbers of Vowel
        System.out.println("The string consist "+ countVowels(str) + " vowels" + " and " + countconso(str) + " consonent" );
    }
}
