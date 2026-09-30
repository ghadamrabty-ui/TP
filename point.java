package tp2;

public class point {	

	    private int Abs;
	    private int Ord;

	    void initialize(int a, int b) {
	        Abs = a;
	        Ord = b;
	    }
	    point(int a, int b){
	    	Abs=a;
	    	Ord=b;		
	    }
	   
	    	
	   	point (int a){
	    	Abs = a;
	    	Ord = 2*a;
	    }
	    void trans_horiz(int d) {
	    	Abs +=d;
	    }
	    void trans_vert(int d) {
	    	Abs +=d;
	    }
	    void translation(int x) {
	    	Abs+= x;
	    	Ord += x;
	    }
	    
	    
	    
	    
        void affiche() {
        	System.out.println("Abs=" + Abs);
        	System.out.println("Ord=" + Ord);
        }
 public class Test{       
        
 public static void main(String[] args) {
	        point p;
	        point p1;
	        p = new point(2);
	        p1 = new point(1,2);
	        p.affiche();
	        p1.affiche();
	        p.translation(2);
	        p1.translation(2);
	        p.affiche();
	        p1.affiche();
 
	        
 }}}

