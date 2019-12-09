public class Oppg419 extends EasyGraphics{
	public static void main(String[] args){
		launch(args);
	}

	public void run(){
		final int HEIGHT = 600;
		final int WIDTH = 500; //jeg liker gyldnesnittet (HEIGHT = WIDTH/1.618) men må caste mot (int).
		final int TABS = HEIGHT/16;
		final int MARGIN = WIDTH/6;
		int lånebeløp = 250000; //ta input ( int n = Integer.parseInt(JOptionPane.showInputDialog("tast lånebeløp i hele kr: "));
		int antallÅr = 10;
		double[] rente = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5};
		makeWindow("title", WIDTH, HEIGHT);
		drawString("Lånebeløp: " + lånebeløp + "kr", MARGIN, TABS);
		drawString("Rente", MARGIN, TABS+TABS);
		drawString("Pr. mnd", MARGIN*2, TABS*2);
		drawString("Pr. år", MARGIN*3, TABS*2);
		drawString("Total", MARGIN*4, TABS*2);
		drawLine(MARGIN, (int)(TABS*2.5), WIDTH-MARGIN, (int)(TABS*2.5));
		int posY = TABS*3;
		int posX = MARGIN;
		for (double r : rente){
			drawString("" + r, posX, posY);
			posX += MARGIN;
			drawString(""+(int)(yearly(lånebeløp, antallÅr, r)/12), posX, posY);
			posX += MARGIN;
			drawString(""+(int)(yearly(lånebeløp, antallÅr, r)), posX, posY);
			posX += MARGIN;
			drawString(""+(int)(verdi(lånebeløp, antallÅr, r)), posX, posY);
			posX = MARGIN;
			posY += TABS;
		}
	}

	public double verdi(int total, int length, double r){
		r = r/100;
		return (total*(Math.pow(1+r,length)));
	}

	public double yearly(int total, int length, double r){
		r = r/100;
		double a = (r*total*(Math.pow(1+r,length)));
		double b = (Math.pow(1+r,length)-1);
		return a/b;
	}
}
