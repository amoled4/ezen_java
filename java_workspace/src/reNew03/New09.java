package reNew03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class New09 {

	public static void main(String[] args) {
		// https://arpeggiobasic.com/?cafe_mkt=ntbox_c01&cafe_prdNo=3679#anchorBoxName_3679
		URL url = null;
		BufferedReader input = null;
		String address = "https://arpeggiobasic.com/?cafe_mkt=ntbox_c01&cafe_prdNo=3679#anchorBoxName_36790";
		String line = "";
		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
