package triangle;

public class triangle {
	
	
	public int triangles(int a, int b, int c){
		if (a+b<=c||a+c<=b||b+c<=a){
			return 0;
		}else if(a==b&&b==c){
			return 1;
		}else if(a==b||b==c||a==c){
			return 2;
		}else{
			return 3;
		}

		
	}

	

}