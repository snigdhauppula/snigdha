package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v=new Veena();
        v.play();
        Saxophone s=new Saxophone();
        s.play();
        Playable p1,p2;
        p1=new Veena();
        p2=new Saxophone();
        p1.play();
        p2.play();
	}

}
