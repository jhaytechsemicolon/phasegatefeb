public class stringAppear{
	public static void main(String[] args){
	String data1 = "abcdefry";
	char ch = 'f';
	String output = "";

	int index= 0;

	for(int count=0; count<data1.length(); count++){
	if(data1.charAt(count) !=ch){
	index++;
} else {
	break;
}
	
}
	

	for(int count =index;count>=0; count--){
	output += data1.charAt(count);
}	

	for(int count =index+1; count <data1.length(); count++ ){
	output += data1.charAt(count);
}

	System.out.println(output);

}
}