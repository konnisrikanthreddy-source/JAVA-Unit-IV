package concepts;

public class StringExploring {

	public static void main(String[] args) {
		String s1="SRIT W"; // One way
		String s2=new String("Warangal"); //Another way
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('R'));
		System.out.println(s1.indexOf('x')); // If no such character returns -1
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2)); //s1==s2 compares references not constants
		System.out.println("Java".equalsIgnoreCase("java"));
		String s3=s1.concat(s2); //s3=SRIT WWarangal
		System.out.println(s3);
		System.out.println(s3.substring(5));
		System.out.println(s3.substring(3,7));
        System.out.println(s3.startsWith("SRIT"));
        System.out.println(s3.endsWith("WWWarangal"));
        String s4="  I am learning JAVA  ";
        System.out.println(s4.contains("JAVA"));
        System.out.println(s4.trim());
        System.out.println(s4); //Strings are immutable
        System.out.println(s4.replace('A', 'O'));
        System.out.println(s4.replace("JAVA", "Python"));
        String s5="Java,C,Python";
        String[] lang=s5.split(",");
        System.out.println(lang[0]);
        String s6="Java";
        char[] ch=s6.toCharArray();
        System.out.println(ch[0]);
        System.out.println(s6.isEmpty());
	}
}
