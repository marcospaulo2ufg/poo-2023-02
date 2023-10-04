/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TestaLivro
{
	public static void main(String[] args) {
		Livro livro1 = new Livro("Ouse argumentar: Comunicação assertiva para sua voz ser ouvida","Maytê Carvalho",2022,"Planeta");
		Livro livro2 = new Livro("O homem mais rico da Babilônia"," George S Clason",2017,"HarperCollins");
		Livro livro3 = new Livro("A psicologia financeira: lições atemporais sobre fortuna, ganância e felicidade","Morgan Housel",2021,"HarperCollins");
		
		System.out.println(livro1);
		System.out.println(livro2);
		System.out.println(livro3);

	}
}
