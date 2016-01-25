package com.demo;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientDemo {
	public static void main(String[] args) throws IOException{
		HttpClient client = new DefaultHttpClient();
		HttpGet httpget = new HttpGet("http://news.baidu.com/");
		System.out.println(httpget);
		HttpResponse response = client.execute(httpget);
//		System.out.println(response.getStatusLine().getStatusCode());
//		System.out.println(response.getStatusLine().getReasonPhrase());
		System.out.println(response.getStatusLine().toString());
		System.out.println("----------");
		httpget.releaseConnection();
	}

}
