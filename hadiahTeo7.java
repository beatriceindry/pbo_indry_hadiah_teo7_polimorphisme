import java.util.Scanner;
class hadiahTeo7{
	public static void main(String[] args){
		phi a = new phi();
		r b = new r();
		x c = new x();
		volume d = new volume();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Jari-jari bola = ");
		d.r = input.nextDouble();
		d.phi = 3.14;
		d.x = 4.0/3.0;
		d.volume();
	}
}