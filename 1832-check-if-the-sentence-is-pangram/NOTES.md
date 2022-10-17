public boolean checkIfPangram(String sentence) {
Set<Character> set = new HashSet<>();
for (int i = 0; i < sentence.length(); ++i)
set.add(sentence.charAt(i));
return set.size() == 26;
}
String result = String.join(delimiter, array);
char[] charArray = {'a', 'b', 'c'};
String str = String.valueOf(charArray);
class Solution {
public boolean checkIfPangram(String sentence) {
if (sentence.length() < 26) {
return false;
}
for (char i = 'a'; i <= 'z'; i++) {
if (sentence.indexOf(i) == -1) {
return false;
}
}
return true;
}
}