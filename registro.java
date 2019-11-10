public class registro{
    public static void main(String[] args){
	prisionero twitch = new prosionero();
	prisionero bubba = twitch;
	bubba.nombre = "Bubba";
	bubba.altura = 2.08;
	bubba.sentencia = 4;
	bubba.nombre = "Twitch";
	bubba.altura = 1.73;
	bubba.sentencia = 3;
	bubba.mensaje();
	twitch.mensaje();
	System.out.println(bubba == twitch);
	System.out.println(bubba);
	System.out.println(twitch);
    }
}