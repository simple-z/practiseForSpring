package com.smart.oxm.xstream.objectstreams;

import com.smart.domain.LoginLog;
import com.smart.domain.User;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.*;

import java.io.*;
import java.util.Date;

public class ObjectStreamSample {
	private static  XStream xstream;
	static{
		xstream = new XStream();
	}
	//XMLת��ΪJAVA����
	public User xmlToObject()throws Exception{
		//1.������Ҫͨ�����������������������ҪFileReader��BufferedReader
		FileReader fr=new FileReader("D:\\masterSpring\\chapter14\\out\\ ObjectStreamSample.xml");
		BufferedReader br=new BufferedReader(fr);
		//2.��������������
		ObjectInputStream input = xstream.createObjectInputStream(br);
		//3.��������ͨ��ObjectInputStream�е�readObject()�����������XML�ļ��ж�ȡ������
		User user=(User)input.readObject();
		return user;
 
	}
	// ��ʼ��ת������
	public static User getUser() {
		LoginLog log1 = new LoginLog();
		LoginLog log2 = new LoginLog();
		log1.setIp("192.168.1.91");
		log1.setLoginDate(new Date());
		log2.setIp("192.168.1.92");
		log2.setLoginDate(new Date());
        User user = new User();
        user.setUserId(1);
        user.setUserName("xstream");
        user.addLoginLog(log1);
        user.addLoginLog(log2);
        return user;
	}
	//JAVA����ת��ΪXML
	public void objectToXml()throws Exception{
		User user = getUser();
		PrintWriter pw=new PrintWriter("D:\\masterSpring\\chapter14\\out\\ObjectStreamSample.xml");
		
		//����һ��PrintWriter�������������
		PrettyPrintWriter ppw=new PrettyPrintWriter(pw);
		ObjectOutputStream out = xstream.createObjectOutputStream(ppw);
		out.writeObject(user);
		out.close();
	}
	
	public static void main(String[] args)throws Exception {
		ObjectStreamSample converter = new ObjectStreamSample();
	    converter.objectToXml();
		User u = converter.xmlToObject();
		for (LoginLog log : u.getLogs()) {
			if (log != null) {
				System.out.println("����IP: " + log.getIp());
				System.out.println("����ʱ��: " + log.getLoginDate());
			}
		}

	}
}
