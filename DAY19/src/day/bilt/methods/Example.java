package day.bilt.methods;

public class Example {

	public static void main(String[] args) 
	{
		String s="mississippi";
		String s6="india is my country i speak to hindi";
		
		
		
		
		System.out.println(s.charAt(2));
		System.out.println(s.contains("issi"));
		System.out.println(s.length());
		System.out.println(s.startsWith("issi"));
		System.out.println(s.endsWith("ippi"));
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf("is"));
		System.out.println(s.lastIndexOf("ipp"));
		System.out.println(s.lastIndexOf('i'));
		String s1=s.replace('m','s');
		System.out.println(s1);
		String s2=s.replace("is","vc");
		System.out.println(s2);
		s=s.toUpperCase();
		System.out.println(s);
		s=s.toLowerCase();
		System.out.println(s);
		String s7=s6.trim();
		System.out.println(s7);
		String[] ar=s6.split(" ");
		for(int i=1;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		char[] c=s6.toCharArray();
		System.out.println(c);
		int startsIndex=5;
		int endsIndex=12;
		String substring=s6.substring(startsIndex,endsIndex);
		System.out.println(substring);
		int startIndex=6;
		String substring2=s6.substring(startIndex);
		
		System.out.println(substring2);
		


		
	}

}
