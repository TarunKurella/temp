import java.util.*;

import java.math.*;


public class Main {
 
  public static  void main(String[] args) {
  Scanner hello = new Scanner(System.in);
  int n = hello.nextInt();
  int count = 0;
  int[] rates = {1,2,4,8,16,32,64,128,256,512,1024,2048};
  for(int i=0;i<n;i++){
 int temp = hello.nextInt();
 while(temp>0){
   for(int j=11;j>=0;j--){
     if(temp>=rates[j]){
       temp=temp-rates[j];count++;j++;
     }
   }
 }
 System.out.println(count);
 count=0;
  }

  // if(!(ans[0]>=65&&ans[0]<=90))
  // ans[0]=(char)((int)ans[0]-32);
  // System.out.println(new String(ans));

}}







