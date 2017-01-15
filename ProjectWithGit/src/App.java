import javax.swing.JFrame;

public class App{
	
	public static void main(String args[]){
	//creates frame
		ProjectWithGit project=new ProjectWithGit();
		project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		project.setSize(1000,1000);
		project.setVisible(true);
		System.out.println("Testing");
	}
	
}