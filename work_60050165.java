import java.awt.*;
import javax.swing.*;
class work_60050165 extends CG_as_1{
	work_60050165(Graphics g){		
		plot(g,set_CG(9),0,0,600,600);//frist background
	    background_layer1_color1(g);
		background_layer1_color2(g);
		background_layer1_color3(g);
		icefloor_layer1_color12_8(g);
		icepole_color9(g);
	}//consutor
    private void background_layer1_color1(Graphics g){ //draw and fillcolor background_layer1
		int color =1; //background_layer1_color1
		   fillcolorX(g, set_CG(color), 166,120,400,120,400);
           fillcolorX(g, set_CG(color), 400,120,600,200,400);
		   fillcolorX(g, set_CG(color), 165,120,-200,300,400);
    }//method background_layer1_color1
    private void background_layer1_color2(Graphics g){ //draw and fillcolor background_layer2
		int color =2; //background_layer1_color2
		   fillcolorX(g, set_CG(color), 166,180,390,180,400);
           fillcolorX(g, set_CG(color), 390,180,600,260,400);
		   fillcolorX(g, set_CG(color), 165,180,-200,360,400);

    }//method background_layer1_color2
	private void background_layer1_color3(Graphics g){ //draw and fillcolor background_layer3
		int color =3; //background_layer1_color3
           fillcolorX(g, set_CG(color), 166,240,390,240,420);
		   fillcolorX(g, set_CG(color), 390,240,600,320,420);
		   fillcolorX(g, set_CG(color), 165,240,-200,420,420);
    }//method background_layer1_color3
	private void icefloor_layer1_color12_8(Graphics g){ //draw and fillcolor icefloor
		int color1 =12; //icefloor_layer1_color12
		int color2 =8;  //icefloor_layer1_color8
		   fillcolorX(g, set_CG(color1), 0,420,600,420,600);
		   fillcolorX(g, set_CG(color2), 0,440,600,440,600);
    }//method icefloor_color12_8
	private void icepole_color9(Graphics g){ //draw and fillcolor icepole
		int color =9;// icepole_color9
		fillcolorX(g, set_CG(color), 130,120,165,120,420);
		fillcolorX(g, set_CG(color), 395,120,430,120,420);
    }//method icepole_color9
}//class
