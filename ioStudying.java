import java.io.*;
import java.net.*;
public class ioStudying{
	public static void main(String[] args) throws IOException{
		// File f = new File("dir.txt");
		// f.createNewFile();
		// BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		// String wocao = "wozhenshirilegou!";
		// bw.write(wocao);
		// bw.close();
		URL url = new URL("http://www.pornhub.com/view_video.php?viewkey=ph56958068ec439");
		InputStream a = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(a));

		File file = new File("crack.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		while(br.readLine() != null){
			bw.write(br.readLine());
		}

		


		a.close();
		br.close();
		bw.close();
	
	}
}