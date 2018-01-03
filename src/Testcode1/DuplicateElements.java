package Testcode1;

public class DuplicateElements {

	public static void main(String[] args) {
		String names[]={"java","javascript","Ruby","C","Phython","java"};
		
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
					System.out.println("Duplicate element will display::"+names[i]);
				}
			}
		}

	}

}
