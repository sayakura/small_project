import java.util.ArrayList;
import java.util.HashMap;

public class Split{
	public static String[] splitted(char c, String str){
		if(str.isEmpty()){
			String[] arr = {""};
			return arr;
		}// if 
		ArrayList<String> temp = new ArrayList<String>();
		String sTemp = "";
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) != c){
				sTemp += str.charAt(i);
			}else{
				if(!sTemp.isEmpty()){
					temp.add(sTemp);
					sTemp = "";
				}
			}//if
		}// for
		return temp.toArray(new String[temp.size()]);
	}// method
	public static String filter(String str, char[] arr){
		String result = "";
		for(int i = 0 ; i < str.length(); i++){
			for(int j = 0 ; j < arr.length; j++){
				if(str.charAt(i) == arr[j]){
					break;
				}else if(str.charAt(i) != arr[j] && j == arr.length -1){
					result += str.charAt(i);
				}
			}//for
		}//for
		return result;
	}
	public static void wordCount(String[] str){
		String s = "";
		for(String word : str){
			s += word+" ";
		}
		s = s.toLowerCase();
		str = splitted(' ',s);
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		int forCountting;
		for(int i = 0; i < str.length; i++){
			if(hashMap.containsKey(str[i])){
				forCountting = hashMap.get(str[i]) + 1;
				hashMap.put(str[i] , forCountting);
			}else{
				hashMap.put(str[i] , 1);
			}//if
		}//for
		for(String key : hashMap.keySet()){
			 System.out.println(key + ": " + hashMap.get(key));
		}
	}//method
}


/*
	public static String[] alphabeticalSorting(String[] strArr){
		String[] a ={""};
		return a;
	}
*/