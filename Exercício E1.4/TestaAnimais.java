/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TestaAnimais
{
	public static void main(String[] args) {
	    int NUM_ANIMAIS = 3;
	    
	    Animal[] animais = new Animal[NUM_ANIMAIS];
		animais[0] = new Boi();	
		animais[1] = new Sapo();
		animais[2] = new Cachorro();
		
		for (Animal animal : animais) {
		    animal.som();
		}
	}
}
