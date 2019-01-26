import java.awt.*;
import javax.swing.*;


class work_60050143 extends CG_as_1
{
	work_60050143(Graphics g)
	{		
//layer ice_set2
		draw_ice_color7(g);

//layer ice_set1
		draw_ice_color10(g);
		draw_ice_color6(g);
//layer text
		draw_60050143(g);
		draw_60050165(g);
	}
//layer ice_set2
	private void draw_60050143(Graphics g){
		int color=14;
		int size =5;
		int margin=50; 
		//min:265 max:340
//60050143
		//6
	Bresenham(g, set_CG(color), 200, 340, 200, 280,size);
	Bresenham(g, set_CG(color), 200, 300, 240, 300,size);
	Bresenham(g, set_CG(color), 200, 340, 240, 340,size);
	Bresenham(g, set_CG(color), 200, 280, 215, 265,size);
	Bresenham(g, set_CG(color), 240, 265, 215, 265,size);
	Bresenham(g, set_CG(color), 240, 340, 240, 300,size);
		//0
		Bresenham(g, set_CG(color), 260, 265, 285, 265,size);
		Bresenham(g, set_CG(color), 259, 266,257,337,size);
		Bresenham(g, set_CG(color), 286, 266,289,337,size);
		Bresenham(g, set_CG(color), 260, 340, 285, 340,size);
		//0
		Bresenham(g, set_CG(color), 260+margin, 265, 285+margin, 265,size);
		Bresenham(g, set_CG(color), 259+margin, 266,257+margin,337,size);
		Bresenham(g, set_CG(color), 286+margin, 266,289+margin,337,size);
		Bresenham(g, set_CG(color), 260+margin, 340, 285+margin, 340,size); 
		//5
		Bresenham(g,  set_CG(color) ,355,265 ,390,265,size );
		Bresenham(g,  set_CG(color) ,355,265 ,355,310,size );
		Bresenham(g,  set_CG(color) ,355,310 ,390,310,size );
		Bresenham(g,  set_CG(color) ,390,340 ,390,310,size );
		Bresenham(g,  set_CG(color) ,355,340 ,390,340,size );
		//0
		Bresenham(g, set_CG(color), 355+margin, 265, 375+margin, 265,size);
		Bresenham(g, set_CG(color), 354+margin, 266,353+margin,337,size);
		Bresenham(g, set_CG(color), 378+margin, 266,379+margin,337,size);
		Bresenham(g, set_CG(color), 355+margin, 340, 375+margin, 340,size);
			//1
			Bresenham(g, set_CG(color), 401+margin, 265, 401+margin, 340,size);
			//4
			Bresenham(g, set_CG(color), 420+margin, 265, 420+margin, 310,size);	
			Bresenham(g, set_CG(color), 420+margin, 310, 440+margin, 310,size);			
			Bresenham(g, set_CG(color), 440+margin, 265, 440+margin, 340,size);	
			Bresenham(g, set_CG(color), 420+margin, 265, 420+margin, 310,size);	
			Bresenham(g, set_CG(color), 420+margin, 310, 440+margin, 310,size);			
			Bresenham(g, set_CG(color), 440+margin, 265, 440+margin, 340,size);	
			//3 
				Bresenham(g, set_CG(color), 455+margin, 265, 480+margin, 265,size);	
				Bresenham(g, set_CG(color), 455+margin, 310, 480+margin, 310,size);			
				Bresenham(g, set_CG(color), 455+margin, 340, 480+margin, 340,size);	
				Bresenham(g, set_CG(color), 480+margin, 265, 480+margin, 340,size);	
	
			}
			private void draw_60050165(Graphics g){
				int color=14;
				int size =5;
				int margin=50;
				int margin_top=100; 
		//60050165
				//6
			Bresenham(g, set_CG(color), 200, 340+margin_top, 200, 280+margin_top,size);
			Bresenham(g, set_CG(color), 200, 300+margin_top, 240, 300+margin_top,size);
			Bresenham(g, set_CG(color), 200, 340+margin_top, 240, 340+margin_top,size);
			Bresenham(g, set_CG(color), 200, 280+margin_top, 215, 265+margin_top,size);
			Bresenham(g, set_CG(color), 240, 265+margin_top, 215, 265+margin_top,size);
			Bresenham(g, set_CG(color), 240, 340+margin_top, 240, 300+margin_top,size);
				//0
				Bresenham(g, set_CG(color), 260, 265+margin_top, 285, 265+margin_top,size);
				Bresenham(g, set_CG(color), 259, 266+margin_top,257,337+margin_top,size);
				Bresenham(g, set_CG(color), 286, 266+margin_top,289,337+margin_top,size);
				Bresenham(g, set_CG(color), 260, 340+margin_top, 285, 340+margin_top,size);
				//0
				Bresenham(g, set_CG(color), 260+margin, 265+margin_top, 285+margin, 265+margin_top,size);
				Bresenham(g, set_CG(color), 259+margin, 266+margin_top,257+margin,337+margin_top,size);
				Bresenham(g, set_CG(color), 286+margin, 266+margin_top,289+margin,337+margin_top,size);
				Bresenham(g, set_CG(color), 260+margin, 340+margin_top, 285+margin, 340+margin_top,size); 
				//5
				Bresenham(g,  set_CG(color) ,355,265+margin_top ,390,265+margin_top,size );
				Bresenham(g,  set_CG(color) ,355,265+margin_top ,355,310+margin_top,size );
				Bresenham(g,  set_CG(color) ,355,310+margin_top ,390,310+margin_top,size );
				Bresenham(g,  set_CG(color) ,390,340+margin_top ,390,310+margin_top,size );
				Bresenham(g,  set_CG(color) ,355,340+margin_top,390,340+margin_top,size );
				//0
				Bresenham(g, set_CG(color), 355+margin, 265+margin_top, 375+margin, 265+margin_top,size);
				Bresenham(g, set_CG(color), 354+margin, 266+margin_top,353+margin,337+margin_top,size);
				Bresenham(g, set_CG(color), 378+margin, 266+margin_top,379+margin,337+margin_top,size);
				Bresenham(g, set_CG(color), 355+margin, 340+margin_top, 375+margin, 340+margin_top,size);
					//1
					Bresenham(g, set_CG(color), 401+margin, 265+margin_top, 401+margin, 340+margin_top,size);
					
					//6
					Bresenham(g, set_CG(color), 420+margin, 340+margin_top, 420+margin, 280+margin_top,size);
			Bresenham(g, set_CG(color), 420+margin, 300+margin_top, 450+margin, 300+margin_top,size);
			Bresenham(g, set_CG(color), 420+margin, 340+margin_top, 450+margin, 340+margin_top,size);
			Bresenham(g, set_CG(color), 420+margin, 280+margin_top, 435+margin, 265+margin_top,size);
			Bresenham(g, set_CG(color), 450+margin, 265+margin_top, 435+margin, 265+margin_top,size);
			Bresenham(g, set_CG(color), 450+margin, 340+margin_top, 450+margin, 300+margin_top,size);
				
					//5
						Bresenham(g, set_CG(color), 455+margin+10, 265+margin_top, 480+margin+10, 265+margin_top,size);	
						Bresenham(g, set_CG(color), 455+margin+10, 310+margin_top, 480+margin+10, 310+margin_top,size);			
						Bresenham(g, set_CG(color), 455+margin+10, 340+margin_top, 480+margin+10, 340+margin_top,size);	
						Bresenham(g, set_CG(color), 455+margin+10, 265+margin_top, 455+margin+10, 310+margin_top,size);
						Bresenham(g, set_CG(color), 480+margin+10, 340+margin_top, 480+margin+10, 310+margin_top,size);	
					
			
					}
	private void draw_ice_color7(Graphics g){
		int color =7;
		//top
		fillcolorX(g, set_CG(color), 0, 277, 6, 258,0);
		fillcolorX(g, set_CG(color), 6, 258, 17, 251,0);
		fillcolorX(g, set_CG(color), 25, 40, 35, 350,0);
		fillcolorX(g, set_CG(color), 31, 214, 17, 251,0);
		fillcolorX(g, set_CG(color), 33, 218, 17, 251,0);
		fillcolorX(g, set_CG(color), 33, 218, 37, 204,0);
		fillcolorX(g, set_CG(color), 37, 204, 44, 188,0);
		fillcolorX(g, set_CG(color), 57, 240, 44, 188,0);
		fillcolorX(g, set_CG(color), 57, 240, 54, 331,0);
		fillcolorX(g, set_CG(color), 55, 350, 78, 320,0);
		fillcolorX(g, set_CG(color), 102, 378, 78, 320,0);
		fillcolorX(g, set_CG(color), 102, 345, 125, 320,0);
		fillcolorX(g, set_CG(color), 130, 300, 125, 289,0);
		fillcolorX(g, set_CG(color), 130, 300, 156, 200,0);
		fillcolorX(g, set_CG(color), 250, 160, 156, 200,0);
		fillcolorX(g, set_CG(color), 250, 145, 289, 137,0);
		fillcolorX(g, set_CG(color), 310, 110, 289, 137,0);
		fillcolorX(g, set_CG(color), 310, 110, 360, 145,0);
		fillcolorX(g, set_CG(color), 380, 270, 360, 145,0);
		fillcolorX(g, set_CG(color), 366, 180, 450, 102,0);
		fillcolorX(g, set_CG(color), 490, 170, 430, 102,0);
		fillcolorX(g, set_CG(color), 490, 170, 513, 432,0);
		fillcolorX(g, set_CG(color), 490, 170, 540, 500,0);
		fillcolorX(g, set_CG(color), 589, 140, 540, 478,0);
		fillcolorX(g, set_CG(color), 578, 200, 600, 243,0);
		
		
		//bottom
		fillcolorX(g, set_CG(color), 42, 435, 32, 562,600);
		fillcolorX(g, set_CG(color), 41, 452, 54, 331,600);
		fillcolorX(g, set_CG(color), 55, 320, 115, 320,600);
		fillcolorX(g, set_CG(color), 20, 40, 15, 200,600);
		
		fillcolorX(g, set_CG(color), 220, 600, 310, 530,600);
		fillcolorX(g, set_CG(color), 367, 478, 310, 567,600);
		fillcolorX(g, set_CG(color), 367, 500, 390, 530,600);
		fillcolorX(g, set_CG(color), 430, 589, 390, 540,600);
		fillcolorX(g, set_CG(color), 530, 328, 570, 378,600);
		fillcolorX(g, set_CG(color), 589, 456, 570, 368,600);
		

		fillcolorX(g, set_CG(color), 580, 570, 600, 300,600);

		
		
	}
	
	
	//layer ice_set1

	private void draw_ice_color6(Graphics g){
		//draw and fillcolor ice_color 6
		int color =6;
		//top ice_color 6
			fillcolorX(g, set_CG(color), 0, 80, 27, 35,0);
			fillcolorX(g, set_CG(color), 48, 30, 27, 35,0);	
			fillcolorX(g, set_CG(color), 48, 30, 62, 15,0);	
			fillcolorX(g, set_CG(color), 95, 73, 62, 15,0);	
			fillcolorX(g, set_CG(color), 95, 73, 134, 173,0);		
			fillcolorX(g, set_CG(color), 163, 230, 134, 173,0);		
			fillcolorX(g, set_CG(color), 163, 230, 134, 173,0);	
			fillcolorX(g, set_CG(color), 163, 230, 143, 159,0);
			fillcolorX(g, set_CG(color), 144, 117, 143, 159,0);
			fillcolorX(g, set_CG(color), 144, 117, 152, 50,0);				
			fillcolorX(g, set_CG(color), 160, 67, 152, 50,0);
			fillcolorX(g, set_CG(color), 160, 67, 160, 79,0);		
			fillcolorX(g, set_CG(color), 196, 161, 160, 79,0);
			fillcolorX(g, set_CG(color), 196, 161, 224, 230,0);
			fillcolorX(g, set_CG(color), 225, 127, 224, 230,0);
			fillcolorX(g, set_CG(color), 225, 127, 239, 71,0);
			fillcolorX(g, set_CG(color), 324,30, 239, 71,0);
			fillcolorX(g, set_CG(color), 324,30, 331, 23,0);
			fillcolorX(g, set_CG(color), 359,47, 331, 23,0);
			fillcolorX(g, set_CG(color), 359,47, 370, 113,0);
			fillcolorX(g, set_CG(color), 384,189, 370, 113,0);
			fillcolorX(g, set_CG(color), 384,189, 392, 153,0);
			fillcolorX(g, set_CG(color), 390,128, 392, 153,0);
			fillcolorX(g, set_CG(color), 390,128, 403, 76,0);
			fillcolorX(g, set_CG(color), 418,40, 403, 76,0);
			fillcolorX(g, set_CG(color), 418,40, 455, 102,0);
			fillcolorX(g, set_CG(color), 478,147, 455, 102,0);
			fillcolorX(g, set_CG(color), 478,147, 507, 222,0);
			fillcolorX(g, set_CG(color), 514,168, 507, 222,0);
			fillcolorX(g, set_CG(color), 514,168, 532, 78,0);
			fillcolorX(g, set_CG(color), 600,167, 532, 78,0);
			
			//bottom ice_color 6
			fillcolorX(g, set_CG(color), 0,409, 34, 493,600);
			fillcolorX(g, set_CG(color), 45,542, 34, 493,600);
		
			fillcolorX(g, set_CG(color), 70,493, 80,432,600);
			fillcolorX(g, set_CG(color), 73,501, 45, 542,600);
			fillcolorX(g, set_CG(color), 73,501, 82, 474,600);

			fillcolorX(g, set_CG(color), 102,392, 82, 474,600);
			fillcolorX(g, set_CG(color), 102,392, 112,310,600);
			fillcolorX(g, set_CG(color), 102,392, 120, 376,600);
			fillcolorX(g, set_CG(color), 125,360, 120, 376,600);
			fillcolorX(g, set_CG(color), 125,360, 140, 345,400,350);
			fillcolorX(g, set_CG(color), 140,345, 155, 330,357,310);
			fillcolorX(g, set_CG(color), 120,450, 142,487,600);
			fillcolorX(g, set_CG(color), 156,496, 142,487,600);
			fillcolorX(g, set_CG(color), 156,496, 171,529,600);
		
			fillcolorX(g, set_CG(color), 171,529, 264, 600,600);
			fillcolorX(g, set_CG(color), 295,570, 264, 600,600);
			fillcolorX(g, set_CG(color), 295,570, 306, 551,600);
			fillcolorX(g, set_CG(color), 319,595, 306, 551,600);
			fillcolorX(g, set_CG(color), 405,600, 430, 564,600);
			fillcolorX(g, set_CG(color), 467,522, 430, 564,600);
			fillcolorX(g, set_CG(color), 467,522, 482, 483,600);
			fillcolorX(g, set_CG(color), 492,466, 482, 483,600);
			fillcolorX(g, set_CG(color), 492,466, 502, 429,600);
			fillcolorX(g, set_CG(color), 512,399, 502, 429,600);
			fillcolorX(g, set_CG(color), 512,399, 527, 468,600);
			fillcolorX(g, set_CG(color), 534,507, 527, 468,600);
			fillcolorX(g, set_CG(color), 550,536, 527, 468,600);
			fillcolorX(g, set_CG(color), 550,536, 580,503,600);
			fillcolorX(g, set_CG(color), 603,482, 580,503,600);


		}
		private void draw_ice_color10(Graphics g){
			//draw and fillcolor ice_color 10
			int color =10;
			//top ice_color 10
				fillcolorX(g, set_CG(color), 0, 93, 27, 43,0);
				fillcolorX(g, set_CG(color), 48, 30+8, 27,43,0);	
				fillcolorX(g, set_CG(color), 48, 30+8, 62, 15+8,0);	
				fillcolorX(g, set_CG(color), 167,230+8, 143+3, 159+8,0);
				fillcolorX(g, set_CG(color), 144, 117+8, 143, 159+8,0);
				fillcolorX(g, set_CG(color), 144, 117+8, 152, 50+8,0);				
				fillcolorX(g, set_CG(color), 160, 67+8, 152, 50+8,0);
				fillcolorX(g, set_CG(color), 225+8, 127+8, 224, 230+8,0);
				fillcolorX(g, set_CG(color), 225, 127+8, 239+8, 71+8,0);
				fillcolorX(g, set_CG(color), 324+8,30+8, 239, 71+8,0);
				fillcolorX(g, set_CG(color), 324,30+8, 331+8, 23+8,0);
				fillcolorX(g, set_CG(color), 359+8,47+8, 331, 23+8,0);
				fillcolorX(g, set_CG(color), 384,189+8, 392+8, 153+8,0);
				fillcolorX(g, set_CG(color), 390+8,128+8, 392, 153+8,0);
				fillcolorX(g, set_CG(color), 390,128+8, 403+8, 76+8,0);
				fillcolorX(g, set_CG(color), 418+8,40+8, 403, 76+8,0);
				fillcolorX(g, set_CG(color), 514+8,168+8, 507, 222+8,0);
				fillcolorX(g, set_CG(color), 514,168+8, 532+8, 78+8,0);

				
				//bottom ice_color 10
				fillcolorX(g, set_CG(color), 0,409, 34, 493,600);
				fillcolorX(g, set_CG(color), 45,542, 34, 493,600);
			
				fillcolorX(g, set_CG(color), 73,493, 83,432,600);
				fillcolorX(g, set_CG(color), 73,501, 45, 542,600);
			 
	
				fillcolorX(g, set_CG(color), 102+4,392+4, 82, 474+4,600);
				fillcolorX(g, set_CG(color), 102,392+6, 112+2,310+6,600);
				fillcolorX(g, set_CG(color), 102+8,392+8, 120+20, 376+8,600);
				fillcolorX(g, set_CG(color), 125,360+8, 142, 345+8,410,352);
				fillcolorX(g, set_CG(color), 140,345+10, 155, 330+10,357+10,310);
				
				fillcolorX(g, set_CG(color), 120+8,450+8, 142+30,487+8,600);
				fillcolorX(g, set_CG(color), 156+20,496+8, 142+8,487+8,600);
				fillcolorX(g, set_CG(color), 156+8,496+8, 171+20,529+8,600);
			
				fillcolorX(g, set_CG(color), 171+20,529+8, 264+8, 600+8,600);


				fillcolorX(g, set_CG(color), 319+3,595, 306+3, 551,600);

				fillcolorX(g, set_CG(color), 512+3,399+8, 527+8, 468+8,600);
				fillcolorX(g, set_CG(color), 534+20,507+8, 527+8, 468+8,600);
				fillcolorX(g, set_CG(color), 550+30,536+8, 527+10, 468+8,600);

	
	
			}	
			
	
}
