class Solution {
    public boolean squareIsWhite(String cd) {
        char lt=cd.charAt(0);
        int digit=cd.charAt(1)-'0';
        if(lt=='a'|| lt=='c'||lt=='e'||lt=='g'){
          return digit%2==0;
        }else{
          return digit%2==1;
        }
    }
}