
public class voice {
	public static void main(String[] args){
	Audio audio = Audio.getInstance();
	InputStream sound  = audio.getAudio("I am a bus", Language.ENGLISH);
	audio.play(sound);
	}
}
