package feladat04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FajlKezeles {
	
	
	public List<Csatorna> fajlBeolvas(String fajlnev, String elvalaszto) throws IOException {
		
		List<Csatorna> csatornak = new ArrayList<Csatorna>();
			
		// TODO fájlból olvasás; példányosítás; listában tárolás
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev),"UTF-8"));
		
		
		while(br.ready()) {
			
			String[] csvSor = br.readLine().split(elvalaszto);
			
			csatornak.add(new Csatorna(csvSor[0],
									   csvSor[1],
									   csvSor[2],
					  Integer.parseInt(csvSor[3]),
					 Integer.parseInt(csvSor[4])));
			
			
			
		}
		
		br.close();
		return csatornak;
		
	}

	/*public void fajlbaIr(List<Csatorna> csatornak2010Utan, String fajlnev, String elvalaszto) throws IOException {


		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(fajlnev),"UTF-8");
		out.write("csatorna\n");
		
		
		for(Csatorna csatorna : csatornak2010Utan) {
			
			out.write(csatorna + "\n");
			
		}
		
		out.close();
		
		
		
	} */

	
	
	

	
	

}
