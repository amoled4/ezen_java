package reNew03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class New08 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// Network
		// IP주소 : 실질적인 사이트의 주소
		InetAddress ip = null;
		ip = InetAddress.getByName("www.naver.com");
		System.out.println("getHostAddress : " + ip.getHostAddress());  // 223.130.195.200
		System.out.println("getHostName : " + ip.getHostName());        // www.naver.com
		System.out.println("toString : " + ip.toString());              // www.naver.com/223.130.195.200
		
		URL url = new URL("https://n.news.naver.com/article/666/0000010603?cds=news_media_pc&type=editn");
		System.out.println(url.getAuthority());  // n.news.naver.com
		System.out.println(url.getContent());    // sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@1a18644
		System.out.println(url.getPort());       // -1
		System.out.println(url.getProtocol());   // n.news.naver.com
		System.out.println(url.getQuery());      // cds=news_media_pc&type=editn
		System.out.println(url.getHost());       // n.news.naver.com
		System.out.println(url.getPath());       // /article/666/0000010603

	}

}
