import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;


public class Main {




  public static  void main(String[] args)throws IOException {
    try{

 
  Scanner hello = new Scanner(System.in);




 int ne = hello.nextInt();
 boolean[] status = {false,false,false};

next:
 for(int j=0;j<ne;j++){
  char[] str = hello.next().toCharArray();
  boolean ans = true;
if(str.length==1){
  if(str[0]=='?'){
    System.out.print("a");
    
  }
  continue next;
}
 
 for(int i=0;i<str.length-1;i++){
   if(str[i]=='?'){
     
     if(str[i+1]!='?'){
              Arrays.fill(status, false);
              if(i>0)status[(int)str[i-1]-97]=true;
              status[(int)str[i+1]-97]=true;
              for(int k=0;k<3;k++){
                if(!status[k]){
                  str[i]=(char)(97+k);
                }
              }
     }else{
      if(i>0){
         if(str[i-1]=='a'){
         str[i]='b';
       }else if(str[i-1]=='b'){
         str[i]='c';
       }else{
         str[i]='a';
       }
      }else{
        str[i]='a';
      }
       

     }
     continue;
   }
   if(i==0)continue;
   
   if((str[i-1]==str[i])||(str[i]==str[i+1]))
   {
     ans = false;
     break;
   }
 }
 int te = str.length-1;
 if(str[te]=='?'){
   if(str[te-1]=='a'){
         str[te]='b';
       }else if(str[te-1]=='b'){
         str[te]='c';
       }else{
         str[te]='a';
       }
  
}

 if(ans){
   System.out.println(new String(str));

 }else{
   System.out.println("-1");
 }


 
 }

  


//  int ni = hello.nextInt();
 

 
//  for(int i=0;i<ni;i++){

    

 
 
// // //   // if(!(ans[0]>=65&&ans[0]<=90))
// // //   // ans[0]=(char)((int)ans[0]-32);
// // //   // System.out.println(new String(ans));
//   }
}
catch(Exception e){
			return;
		}}}


// static HashSet<String> st = new HashSet<>(); 
// static void subsequence(String str,String A,String B) 
//     { 
//         // iterate over the entire string 
//         for (int i = 0; i < str.length(); i++) { 
              
//             // iterate from the end of the string 
//             // to generate substrings 
//             for (int j = str.length(); j > i; j--) { 
//                 String sub_str = str.substring(i, j); 
                
     
//                 if (!st.contains(sub_str)) {
//                    if((sub_str.compareTo(A)>=0)&&(sub_str.compareTo(B)<=0))ans++;
//                     st.add(sub_str);} 
  
//                 // drop kth character in the substring 
//                 // and if its not in the set then recur 
//                 for (int k = 1; k < sub_str.length() - 1; k++) { 
//                     StringBuffer sb = new StringBuffer(sub_str); 
   
//                     // drop character from the string 
//                     sb.deleteCharAt(k); 
//                     if (!st.contains(sb)) 
//                         ; 
//                     subsequence(sb.toString(),A,B); 
//                 } 
//             } 
//         } 
//     }   

 // for(int i=0;i<n;i++){
  //   for(int j=i;j<=n;j++)
  //   {tempp++;
  //     String temp=message.substring(i,j);
  //     if((temp.compareTo(A)>=0)&&(temp.compareTo(B)<=0))
  //     ans++;
  //   }
  // }






