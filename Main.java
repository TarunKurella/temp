import java.util.*;
import java.io.*;
import java.math.*;


public class Main {

static int cn = 1;
static void median(int[] problems,int start,int end){
  int temp[]= Arrays.copyOfRange(problems, start, end+1);
   Arrays.sort(temp);
   
  int n = end-start+1;
  if((n%2)!=0){
  n=(n+1)/2;
  System.out.println(temp[n-1]);
  }
  else{
    System.out.println((temp[(n/2)-1]+temp[((n+2)/2)-1])/2);
  }
}
 



  public static  void main(String[] args)throws IOException {
    try{
  Scanner hello = new Scanner(System.in);
  while (hello.hasNextInt()) {
    System.out.println("Case "+cn+":");
    int tnp = hello.nextInt();//total no.of problems
    int[] problems = new int[tnp];
    for(int i=0;i<tnp;i++){
      problems[i]=hello.nextInt();
    }
    int nq= hello.nextInt(); // n0 of queries
    for(int j=0;j<nq;j++){
      int k1=hello.nextInt();
      int k2=hello.nextInt();
      median(problems,k1-1,k2-1);
    }
cn++;
    
}
  


  // int n = hello.nextInt();

  // for(int i=0;i<n;i++){
    

  //   }
    
   

 
  }
  

  // if(!(ans[0]>=65&&ans[0]<=90))
  // ans[0]=(char)((int)ans[0]-32);
  // System.out.println(new String(ans));

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






