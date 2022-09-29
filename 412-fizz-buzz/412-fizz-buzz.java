class Solution {
    public List<String> fizzBuzz(int n) {
        int i=0; 
      List<String> list= new ArrayList<>();
      while(i<n){
        i++;
        if(i%3==0 && i%5==0){
          list.add("FizzBuzz");
        } else if(i%5==0){
          list.add("Buzz");
        } else if(i%3==0){
          list.add("Fizz");
        } else{ 
          String s = Integer.toString(i);
          list.add(s);
        }
      }
      return list;
    }
}