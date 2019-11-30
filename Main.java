import java.util.*;

import java.math.*;


public class Main {


static String mutate(String old,int k,char b){
  StringBuffer temp = new StringBuffer(old);
  temp.setCharAt(k,b);
  return temp.toString();
}

static void count(char[] strand,int start,int end){
  int A=0,G=0,T=0,C=0; 
  for(int i=start;i<=end;i++){
   switch(strand[i]){
     case 'A' :A++;break;
     case 'G' :G++;break;
     case 'T' :T++;break;
     case 'C' :C++;break;          
   }
  }
  System.out.println(A+" "+G+" "+T+" "+C);

}
 
  public static  void main(String[] args) {
  Scanner hello = new Scanner(System.in);
  ArrayList<String> genes = new ArrayList<String>();
  genes.add("000");
  
  //taking input genes
  int n = hello.nextInt();
  for(int i=0;i<n;i++){
   genes.add(hello.next());
  }
   
  //performing operations
   n = hello.nextInt();
  for(int i=0;i<n;i++){
    String key = hello.next();
    switch(key){
      case "MUTATE": int dno=hello.nextInt(); // dna no.
                int pno=hello.nextInt(); // position no.
                char b=hello.next().charAt(0); //base to replace 
                genes.set(dno,mutate(genes.get(dno),pno,b));
                break;
      case "CROSS" : int dno1=hello.nextInt(); 
                int dno2=hello.nextInt();
                int k1=hello.nextInt();
                int k2=hello.nextInt();
                System.out.println("called cross for"+dno1+" and offset k2"+k2);
                break;
      case "COUNT" : int dno3=hello.nextInt(); 
                int k3=hello.nextInt();
                int k4=hello.nextInt(); 
                count(genes.get(dno3).toCharArray(),k3,k4);


    }
   

 
  }
  

  // if(!(ans[0]>=65&&ans[0]<=90))
  // ans[0]=(char)((int)ans[0]-32);
  // System.out.println(new String(ans));

}}







