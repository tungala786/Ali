package loops;

public class LabelledForLoop {

	public static void main(String[] args) {
		outer:
		for(int i=1;i<4;i++) {
			inner:
			for(int j=1;j<4;j++) {
				System.out.println(i+" "+j);
				if(i==2 && j==2)break outer;
			}
		}

	}

}
