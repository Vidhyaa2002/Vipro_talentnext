#include<stdio.h>
#include<string.h>
int removeigit(int input)
{
  int j=0,i;
  String s=Integer.toString(input1);
  if(s.equals(reverse(s)))
  {
   return -1;
  }
  else
  {
   int len=s.length();
   for(i=0;i<len;i++)
   {
    String part=s.substring(0,i) + s.substring(i+1, len );
    String reversed=reverse(part);
    if(part.equals(reversed))
    {
     j=(int)(s.charAt(i))-48;
     break;
    }
   }
   return j;
  }

 }
 public String reverse(String str)
 {
  String rev="";
  for(int i=str.length()-1;i>=0;i--)
  {
   rev=rev+str.charAt(i);
  }
  return rev;
 }