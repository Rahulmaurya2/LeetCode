int a=1; int b=1;
while(--n>=1){
a+=b;
b=a-b;
}
return a;