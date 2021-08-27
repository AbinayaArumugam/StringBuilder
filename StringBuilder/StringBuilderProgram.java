package stringbuilder;
import java.util.Scanner;
   
public class StringBuilderProgram  {  
                                         //Getting integer input
public static int integerInput() {
Scanner in = new Scanner(System.in);
int input = in.nextInt();
return input;
}

                                      //Getting String input
public static String stringInput() {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the String: ");
String str = sc.next();
return str;
}
                                   //Getting String Array Input
public static String[] arrayInput(int numberOfStrings) {
System.out .println("Enter Strings: ");
Scanner sc1=new Scanner(System.in);
String[] strArr= new String[numberOfStrings];
for(int i=0;i<numberOfStrings;i++){
strArr[i]=sc1.next();
}
return strArr;
}
                                             //find length without string
public static int findLength() {
StringBuilder sb = new StringBuilder();
int length = sb.length();
return length;
}

                                              //find length with string
public static StringBuilder findLengthWithString(String str){
StringBuilder sb = new StringBuilder(str);
return sb;
}
                                              //Adding 4 String
public static StringBuilder addStringWith(String str,String[] strArr){
StringBuilder sb = new StringBuilder(str);
for(int i=0;i<strArr.length;i++) {
sb.append("#");
sb.append(strArr[i]);
}
  return sb;
  }   
                                        //Adding String with space
 public static StringBuilder addStringWithSpace(String[] arr) {
 StringBuilder sb = new StringBuilder();
 for(int i=0;i<arr.length;i++) {
 sb.append(arr[i]);
 sb.append(" ");
 }
 
 return sb;
 }
                                 //Insert String in between
 public static StringBuilder insertStringInbetween(String[] strArr,String insertStr) {
 StringBuilder sb = new StringBuilder();
for(int i=0;i<strArr.length;i++) {
sb.append(strArr[i]);
sb.append(" ");
}
 int index=sb.indexOf(" ");
 sb.insert(index+1,insertStr+" ");
 return sb;
 }     
                                //Delete first String
public static StringBuilder deleteString(String[] strArr) {
StringBuilder sb = new StringBuilder();
for(int i=0;i<strArr.length;i++) {
sb.append(strArr[i]);
sb.append(" ");
}
 int index=sb.indexOf(" ");
 sb.delete(0,index);   
 return sb;
 }                          
                                             //replace space with '-'
public static StringBuilder replaceString(String[] strArr,String replaceChar) {
StringBuilder sb = new StringBuilder();
for(int i=0;i<strArr.length;i++) {

sb.append(strArr[i]);
sb.append(" ");
} 
int index = sb.indexOf(" ");
 sb.replace(index,index+1,replaceChar);   
return sb;
}
                                            //Reverse String
public static StringBuilder reverseString(String[] strArr) {
StringBuilder sb = new StringBuilder();
for(int i=0;i<strArr.length;i++) {
sb.append(strArr[i]);
sb.append(" ");
} 
sb.reverse();
return sb;
}
                                        //Delete character with index
public static StringBuilder deleteCharacters(String strArr,int startIndex,int endIndex) {
StringBuilder sb = new StringBuilder();
sb.append(strArr);
if(sb.length()>=10){
if(startIndex<endIndex) {
sb.delete(startIndex,endIndex);
}else {
System.out.println("Invaid Input. Check the Index value");
}
} else {
 System.out.println("character length should be minimum 10");
}
return sb;
}
                                           //Replace the character with index
public static StringBuilder replaceCharactersWith(String strArr,int startIndex,int endIndex,String replaceStr) {
StringBuilder sb = new StringBuilder();
sb.append(strArr);
if(sb.length()>=10) {
 if((startIndex<endIndex)&& (endIndex-startIndex)==replaceStr.length()){
sb.replace(startIndex,endIndex,replaceStr);
} else {
System.out.println("Invaid Input. Check the Index value");
} 
}else {
System.out.println("Length of the String should be minimum 10 characters");
}
return sb;
}
                                                  //find the first index of #
public static int findFirstIndex(String[] arr,String insertChar){
StringBuilder sb = new StringBuilder();
for(int i=0;i<arr.length;i++) {
sb.append(arr[i]);
sb.append(insertChar);
}
System.out.println("Final String: " + sb);
System.out.println("Length of the String: "+sb.length());
int index = sb.indexOf(insertChar);
return index;
}  
                                               //find the last index of #                                                                                                           
public static int findLastIndex(String[] arr,String insertChar){
StringBuilder sb = new StringBuilder();
for(int i=0;i<arr.length;i++) {
sb.append(arr[i]);
sb.append(insertChar);
}
System.out.println("Final String: " + sb);
System.out.println("Length of the String: "+sb.length());
int index = sb.lastIndexOf(insertChar);
return index;
}                                                                                                 
                                             //Main Method
public static void main(String[] args) {
 System.out.println("Enter the question No: ");
 int questionNo = integerInput();
switch(questionNo) {
case 1:
System.out.println("Length without String: " + findLength());
String getInput =stringInput();
StringBuilder sb1=findLengthWithString(getInput);
System.out.println("Final String: "+sb1);
System.out.println("Length of the String: "+ sb1.length());
break;
case 2:
String str2 =stringInput();
System.out.println("Length of the string: "+str2.length());
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr2 = arrayInput(integerInput());
System.out.println("Length of string array: " + arr2.length);
StringBuilder ssb1 = addStringWith(str2,arr2);
System.out.println("Final String: "+ ssb1);
System.out.println("Length of the Final String: "+ ssb1.length());
break;
case 3:
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr3 = arrayInput(integerInput());
System.out.println("Length of string array: " + arr3.length);
String insertStr = stringInput();
StringBuilder ssb3 = insertStringInbetween(arr3,insertStr);
System.out.println("Final String: " + ssb3);
System.out.println("Length of Final String with space: "+ssb3.length());
break;
case 4:
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr4 = arrayInput(integerInput());
StringBuilder sb4=addStringWithSpace(arr4);
System.out.println(" String: " + sb4);
System.out.println("Length of String with space: "+sb4.length());
StringBuilder ssb4=deleteString(arr4);
System.out.println("Final String: "+ssb4);
System.out.println("Length of Final String : "+ssb4.length());
break;
case 5:
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr5 = arrayInput(integerInput());
StringBuilder sb5 = addStringWithSpace(arr5);
System.out.println("String: " + sb5);
System.out.println("Length of String: "+sb5.length());
String replaceChar5=stringInput();
StringBuilder ssb5 =replaceString(arr5,replaceChar5);
System.out.println("Final String: "+ssb5);
System.out.println("Length of Final String: "+ssb5.length());
break;
case 6:
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr6 = arrayInput(integerInput());
StringBuilder sb6 =addStringWithSpace(arr6);
System.out.println("String: " + sb6);
System.out.println("Length of String : "+sb6.length());
StringBuilder ssb6=reverseString(arr6);
System.out.println("Final String: "+ ssb6);
System.out.println("Length of Final String: "+ssb6.length());
break;
case 7:
System.out.println("Enter the String with minimum 10 character");
String str7 =stringInput();
StringBuilder sb7 = findLengthWithString(str7);
System.out.println("String: "+ sb7);
System.out.println("Length of String: "+sb7.length());
System.out.println("Enter the start index andend index: ");
int startIndex7=integerInput();
int endIndex7=integerInput();
StringBuilder ssb7 = deleteCharacters(str7,startIndex7,endIndex7);
System.out.println("Final String: "+ssb7);
System.out.println("Length of Final String: "+ssb7.length());
break;
case 8:
System.out.println("Enter the String with minimum 10 character");
String str8 = stringInput();
StringBuilder sb8 =findLengthWithString(str8);
System.out.println("String: " +sb8);
System.out.println("Length of String: "+sb8.length());
String replaceStr = stringInput();
System.out.println("Enter the start index andend index: ");
int startIndex=integerInput();
int endIndex=integerInput();
StringBuilder ssb8 = replaceCharactersWith(str8,startIndex,endIndex,replaceStr);
System.out.println("Final String: "+ssb8);
System.out.println("Length of String: "+ssb8.length());
break;
case 9:
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr9 = arrayInput(integerInput());
String insertChar9 = stringInput();
System.out.println("Index of first character:" + findFirstIndex(arr9,insertChar9));
break;
case 10:
System.out.println("Enter the Number of Strings to be inserted: ");
String[] arr10 = arrayInput(integerInput());
String insertChar10= stringInput();
System.out.println("Index of last character:" + findLastIndex(arr10,insertChar10));
break;
default :
System.out.println("Invalid");
}
}
}

