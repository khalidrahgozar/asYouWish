package justForPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyPhone {
	public static void main (String[] args) {
ArrayList <Integer> name = new ArrayList<Integer>();
name.add(1);
name.add(2);
name.add(3);
System.out.println(name);
name.set(2, 34);
System.out.println(name);
String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
String replaced=given.replaceAll("[a-zA-Z]", "");
int alphaChar=given.length()-replaced.length();
System.out.println(alphaChar);
String khalid = "hello wattan";
System.out.println(khalid.concat("evergreen"));
StringBuffer emad = new StringBuffer(khalid);
System.out.println(emad.reverse());
int [] a= {12,24,2,4,1};
Arrays.sort(a);
System.out.println(Arrays.toString(a));
String x = "hello";
String y = "hello";
if(x.equals(y)) {System.out.println(x + " equal to : " + y);
		
	}else {System.out.println(x + " not equal to :" + y);

}
	}
}
