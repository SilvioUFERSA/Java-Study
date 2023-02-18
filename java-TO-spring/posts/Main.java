import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;


public class Main{

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Post p1 = new Post(sdf.parse("21/06/2018 10:14:30"), "Viagem incrive", "aproveitei muito", 5);
	
		Comment c1 = new Comment("tu é pika");
		Comment c2 = new Comment("aproveite ai");
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.print(p1);
		
		sc.close();
		
	}
	
}