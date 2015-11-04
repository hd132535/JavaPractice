package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://fc06.deviantart.net/fs71/i/2015/029/9/4/fnatic_2_0_wallpaper_logo___league_of_legends_by_aynoe-d8fvhal.png";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")) {
				
				//파일에 write하기
				byte[] buf = new byte[100];
				int result;
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
