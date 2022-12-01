int ans=0;
for(int key: map.keySet()){
ans = gcd(ans, map.get(key));
}
return ans>=2 ? true : false;
​
}
public int gcd(int a, int b){
if(b==0){
return a ;
}
return gcd(b, a%b);
}
}
​