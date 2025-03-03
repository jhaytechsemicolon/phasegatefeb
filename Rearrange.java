public class Rearrange {

public static String characters(string data, char alpha){
index = 0;	
String output = " ";
for (int count = 0; count <= data.lenth(); count ++){
	if(data.charAt(count) != alpha){
	index++;

return index;
}else{
	 break;
 }
}

for(int count = index; count>= 0; count--){
	output += data.chartAt(count);
}

for(int count = index+1; count <= data.length; count++){
	output += data.charAt(count);
}

}


public static void main(String...args){
 String data = "abcdef";
char ch = 'd';
System.out.println(characters(data,d));
 }
}