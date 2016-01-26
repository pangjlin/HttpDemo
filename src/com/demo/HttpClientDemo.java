package com.demo;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClientDemo {
	public static void main(String[] args) throws IOException{
		HttpClient client = new DefaultHttpClient();
		HttpGet httpget = new HttpGet("http://www.baidu.com/");
		System.out.println("executing request:" + httpget.getURI());
//		System.out.println(httpget);
		
		HttpResponse response = client.execute(httpget);
		
//		System.out.println(response.getStatusLine().getStatusCode());
//		System.out.println(response.getStatusLine().getReasonPhrase());
		
		HttpEntity entity = response.getEntity();
		System.out.println("----------");
		System.out.println(response.getStatusLine().toString());
		if (entity != null){
			System.out.println("Response content length:" + entity.getContentLength());
//			System.out.println("Response content:" + EntityUtils.toString(entity));
			System.out.println(entity.getContentType());
		}
		System.out.println("----------");
		httpget.releaseConnection();
	}

}
