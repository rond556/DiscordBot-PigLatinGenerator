public class VowelUtils {
        public static Boolean hasVowels(String word) {
            String wordLowerCase = word.toLowerCase();
            if(wordLowerCase.indexOf('a') == -1 &&
                    wordLowerCase.indexOf('e') == -1 &&
                    wordLowerCase.indexOf('i') == -1 &&
                    wordLowerCase.indexOf('o') == -1 &&
                    wordLowerCase.indexOf('u') == -1){
                return false;
            }
            return true;
        }

        public static Integer getIndexOfFirstVowel(String word) {
            String wordLowerCase = word.toLowerCase();
            for(int i = 0; i < wordLowerCase.length(); i++){
                if(wordLowerCase.charAt(i) == 'a'||
                        wordLowerCase.charAt(i) == 'e'||
                        wordLowerCase.charAt(i) == 'i'||
                        wordLowerCase.charAt(i) == 'o'||
                        wordLowerCase.charAt(i) == 'u'){
                    return i;
                }
            }
            return -1;
        }


        public static Boolean startsWithVowel(String word) {
            String wordLowerCase = word.toLowerCase();
            return (wordLowerCase.charAt(0) == 'a'||
                    wordLowerCase.charAt(0) == 'e'||
                    wordLowerCase.charAt(0) == 'i'||
                    wordLowerCase.charAt(0) == 'o'||
                    wordLowerCase.charAt(0) == 'u');
        }

        public static Boolean isVowel(Character character) {
            return "AEIOUaeiou".indexOf(character) != -1;
        }
}
