import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;

class SimpleIO{
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://www.pornhub.com");
		InputStream b = url.openStream();
		InputStreamReader rd = new InputStreamReader(b);
		BufferedReader br = new BufferedReader(rd);
		File file = new File("website.txt");
		if(file.exists()){
			file.delete();
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		while(br.readLine() != null){
			 bw.write(br.readLine());
		}
		// ArrayList<String> temp = new ArrayList<String>();
		// for (int i = 0; i < website.length() ;i++ ) {
		// 	int http = website.indexOf("http");
		// 	int gif = website.indexOf("gif");
		// 	String a = "";
		// 	for(int j = http; j < gif+3; j++){
		// 		a += website.charAt(j);
		// 	}
		// 	temp.add(a);
		// }
		// System.out.println(Arrays.toString(temp));
		// for(String s : temp){
		// 	System.out.println(s);
		// }
		System.out.println("hello world");
		br.close();
		rd.close();
		b.close();
		bw.close();
	}
}