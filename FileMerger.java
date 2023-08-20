import java.io.* ;
class FileMerger {
	public static void main(String args[]) throws IOException{
		Console cn = System.console();
		System.out.print("Specify File To Be Retrived : ") ;
		String a1 = cn.readLine();
		FileOutputStream fo = new FileOutputStream(a1);
		int ch, i = 1 ;
		String s = a1.replace(".",i+".");
		File fs = new File(s);
		while(fs.exists()){				
			FileInputStream fi = new FileInputStream(fs);
			while((ch=fi.read()) != -1){
					fo.write(ch);
			}
			fi.close();
			File nf = new File(s);
			nf.delete();
			i++;
			s = a1.replace(".",i+".");
			fs = new File(s);
		}
		fo.close();
	}
}
