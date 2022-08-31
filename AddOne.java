//Given an array which represents a number, add 1 to the array. Suppose an array contain elements [1, 2, 3, 4] then 
//the array represents decimal number 1234 and hence adding 1 to this would result 1235. So new array will be [1, 2, 3, 5].

import java.util.*;

public class AddOne{
public static void main(String[] args){
	int[] arr1 = {1,9,2,9}; 
	int carry=0;
	for(int i=arr1.length-1;i>=0;i--){
		if(i==arr1.length-1 && arr1[i]<9){
			arr1[i]+=1;
		}else if((i==arr1.length-1 ||carry==1)&& arr1[i]==9){
			arr1[i]=0;
			carry=1;
		}else if(arr1[i]<9 && carry==1){
			arr1[i]+=1;
			carry=0;
		}else{
			continue;
		}
		}
	
	for(int i=0;i<arr1.length;i++)
		System.out.print(arr1[i]);
}
}