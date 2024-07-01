package Human;

public class Body {
    int a=15;// those global variable used anywhere
    int b=16;
    int c;
    int d;
    
    void e() {
    	
    	int g=100; //it's local variable because it inside the method ,can use only in method
    	System.out.println(g);
    	System.out.println("jasmine");
    }
    
    void y() {
    	int z=a+b;
    	System.out.println(z);
    	int m=b-a;
    	System.out.println(m);
    	
    	System.out.println(a*b);
    	boolean j=a>b;
    	System.out.println(j);
    }
    
    void z() {
    	c=10;
    	d=20;
    	System.out.println(d-c);
    }
    
    boolean hello=3>5;
    boolean hi=5>4;
    
    void izyan() {
    	
    	System.out.println(hello);
    	System.out.println(hi);
 
   }
    
    // parameter
    
    void v(int i,int j,int k) {
    	int u=i+j+k;
    	System.out.println(u);
    	System.out.println(i);
    	System.out.println(k);
    	
    	
    }
    
    
    String myname="jasmine pingky"; //when text or name use String put variable inside double cotation( normal)
    void printname() {
    	System.out.println(myname);
    	
    }
    
    void printname1(String i,String j) {   //it's parameter cuz value is unknown 
    	System.out.println(i.concat(j));   //variable is text or name thats why string used
    	                                    //add or pringting two text together used Concat
    }
    
    
    
    // returntype
    
    //in return type always write return in end of the method
    
    
    int buffalo(int a,int b,int c) {  //parameter value unknown
    	return a+b+c;
    }
    
    
    String florida(String n,String m) {
    	return n.concat(m);
    }
    
    
    double kail(double p,double k) {
    	return k-p;
    	
    }
    
    boolean jiji(boolean g,boolean j) {
    	return j;
    	
    }
    
    
    char kiki() {
    	return 'Z';
    	
    }

    
    boolean nini () {
    	return 5>4;   //its not parameter
    }
    
}
