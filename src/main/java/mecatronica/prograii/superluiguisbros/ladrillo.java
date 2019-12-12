package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ladrillo {
    int c = 0;
    int m = 0;
    int xa = 0;
    int n;
    int[] x;
    int[] y;
        
    private Juego game;
    
    public ladrillo(Juego game){
        this.game = game;
    }
    
    public void move() {
        for (int i = 0; i < n; i++) {
            x[i]=x[i]+xa;  
        }
        if (game.bloques.x[game.bloques.n-1] < 0) {
           game.nivel.nivel++;
        }
    }
    
    public void paint(Graphics2D g){
        if (c == 0) {
            switch (m){
                case 1 -> {
                    this.n = 61;
                    x = new int[62];
                    y = new int[62];
                    x[0]=3;x[1]=6;x[2]=7;x[3]=8;x[4]=8;x[5]=9;x[6]=10;x[7]=15;x[8]=15;x[9]=16;
                    x[10]=16;x[11]=20;x[12]=21;x[13]=22;x[14]=23;x[15]=24;x[16]=25;x[17]=26;
                    x[18]=27;x[19]=31;x[20]=32;x[21]=33;x[22]=34;x[23]=34;x[24]=41;x[25]=42;
                    x[26]=50;x[27]=53;x[28]=53;x[29]=56;x[30]=60;x[31]=63;x[32]=64;x[33]=65;
                    x[34]=69;x[35]=70;x[36]=71;x[37]=72;x[38]=75;x[39]=75;x[40]=76;x[41]=76;
                    x[42]=76;x[43]=77;x[44]=77;x[45]=77;x[46]=77;x[47]=78;x[48]=78;x[49]=78;
                    x[50]=78;x[51]=79;x[52]=79;x[53]=79;x[54]=79;x[55]=79;x[56]=80;x[57]=80;
                    x[58]=80;x[59]=80;x[60]=80;x[61]=80;
                    y[0]=3;y[1]=3;y[2]=3;y[3]=3;y[4]=7;y[5]=3;y[6]=3;y[7]=1;y[8]=2;y[9]=1;y[10]=2;
                    y[11]=3;y[12]=3;y[13]=3;y[14]=7;y[15]=7;y[16]=7;y[17]=7;y[18]=7;y[19]=7;
                    y[20]=7;y[21]=7;y[22]=3;y[23]=7;y[24]=5;y[25]=5;y[26]=3;y[27]=3;y[28]=7;
                    y[29]=3;y[30]=3;y[31]=7;y[32]=7;y[33]=7;y[34]=7;y[35]=7;y[36]=7;y[37]=7;
                    y[38]=1;y[39]=10;y[40]=1;y[41]=2;y[42]=10;y[43]=1;y[44]=2;y[45]=3;y[46]=10;
                    y[47]=1;y[48]=2;y[49]=3;y[50]=4;y[51]=1;y[52]=2;y[53]=3;y[54]=4;y[55]=5;
                    y[56]=1;y[57]=2;y[58]=3;y[59]=4;y[60]=5;y[61]=6;
                    c=1;
                    break;
                }
                case 2 -> {
                    this.n = 133;
                    x = new int[134];
                    y = new int[134];
                    x[0]=4; x[1]=4 ;x[2]=7; x[3]=7; x[4]=7; x[5]=15; x[6]=16; x[7]=16; x[8]=17; x[9]=17; x[10]=26; x[11]=27; 
                    x[12]=27; x[13]=28; x[14]=28; x[15]=28; x[16]=29; x[17]=29; x[18]=30; x[19]=35; x[20]=35; x[21]=36; x[22]=36;
                    x[23]=40; x[24]=40; x[25]=41; x[26]=41; x[27]=50; x[28]=51; x[29]=52; x[30]=53; x[31]=54; x[32]=60; x[33]=60;
                    x[34]=61; x[35]=61; x[36]=62; x[37]=62; x[38]=67; x[39]=68; x[40]=68; x[41]=69; x[42]=69; x[43]=69; x[44]=72;
                    x[45]=73; x[46]=74; x[47]=76; x[48]=76; x[49]=76; x[50]=77; x[51]=79; x[52]=79; x[53]=80; x[54]=80; x[55]=81;
                    x[56]=82; x[57]=82; x[58]=83; x[59]=83; x[60]=84; x[61]=84; x[62]=85; x[63]=86; x[64]=87; x[65]=88; x[66]=89;
                    x[67]=90; x[68]=90; x[69]=91; x[70]=91; x[71]=92; x[72]=92; x[73]=93; x[74]=93; x[75]=95; x[76]=96; x[77]=97;
                    x[78]=101; x[79]=102; x[80]=103; x[81]=104; x[82]=106; x[83]=107; x[84]=107; x[85]=107; x[86]=107; x[87]=107; x[88]=108;
                    x[89]=108; x[90]=108; x[91]=108; x[92]=109; x[93]=109; x[94]=109; x[95]=109; x[96]=109; x[97]=109; x[98]=109; x[99]=109;
                    x[100]=111; x[101]=112; x[102]=112; x[103]=113; x[104]=113; x[105]=115; x[106]=118; x[107]=119; x[108]=119; x[109]=119; x[110]=120;
                    x[111]=120; x[112]=120; x[113]=120; x[114]=120; x[115]=126; x[116]=129; x[117]=132; x[118]=135; x[119]=136; x[120]=136; x[121]=137;
                    x[122]=137; x[123]=137; x[124]=137; x[125]=137; x[126]=137; x[127]=137; x[128]=137; x[129]=137; x[130]=137; x[131]=137; x[132]=137;
                    x[133]=137;
                    y[0]=1; y[1]=3; y[2]=4; y[3]=5; y[4]=6; y[5]=1; y[6]=1; y[7]=2; y[8]=1; y[9]=2; y[10]=1; y[11]=1;
                    y[12]=2; y[13]=1; y[14]=2; y[15]=3; y[16]=1; y[17]=2; y[18]=1; y[19]=6; y[20]=7; y[21]=6; y[22]=7;
                    y[23]=1; y[24]=2; y[25]=1; y[26]=2; y[27]=1; y[28]=1; y[29]=1; y[30]=1; y[31]=1; y[32]=7; y[33]=8;
                    y[34]=8; y[35]=9; y[36]=7; y[37]=8; y[38]=1; y[39]=1; y[40]=2; y[41]=1; y[42]=2; y[43]=3; y[44]=5;
                    y[45]=5; y[46]=1; y[47]=5; y[48]=6; y[49]=7; y[50]=1; y[51]=10; y[52]=11; y[53]=10; y[54]=11; y[55]=1;
                    y[56]=1; y[57]=2; y[58]=1; y[59]=2; y[60]=1; y[61]=2; y[62]=2; y[63]=2; y[64]=2; y[65]=2; y[66]=2;
                    y[67]=1; y[68]=2; y[69]=1; y[70]=2; y[71]=1; y[72]=2; y[73]=1; y[74]=5; y[75]=7; y[76]=7; y[77]=7;
                    y[78]=1; y[79]=2; y[80]=3; y[81]=4; y[82]=6; y[83]=1; y[84]=2; y[85]=6; y[86]=7; y[87]=8; y[88]=1;
                    y[89]=2; y[90]=8; y[91]=9; y[92]=2; y[93]=10; y[94]=11; y[95]=12; y[96]=13; y[97]=14; y[98]=15; y[99]=16;
                    y[100]=2; y[101]=1; y[102]=2; y[103]=1; y[104]=2; y[105]=4; y[106]=6; y[107]=5; y[108]=6; y[109]=7; y[110]=4;
                    y[111]=5; y[112]=6; y[113]=7; y[114]=8; y[115]=6; y[116]=6; y[117]=6; y[118]=11; y[119]=11; y[120]=12; y[121]=1;
                    y[122]=2; y[123]=3; y[124]=4; y[125]=5; y[126]=6; y[127]=7; y[128]=8; y[129]=9; y[130]=10; y[131]=11; y[132]=12; y[133]=13;
                    c=1;
                    break;
                }
                case 3 -> {
                    this.n = 39;
                    x = new int[40];
                    y = new int[40];
                    x[0]=5;x[1]=6;x[2]=7;x[3]=15;x[4]=16;x[5]=19;x[6]=20;x[7]=21;
                    x[8]=22;x[9]=24;x[10]=25;x[11]=26;x[12]=27;x[13]=30;x[14]=35;
                    x[15]=40;x[16]=41;x[17]=42;x[18]=43;x[19]=63;x[20]=65;x[21]=70;
                    x[22]=73;x[23]=73;x[24]=75;x[25]=75;x[26]=75;x[27]=75;x[30]=80;
                    x[31]=81;x[32]=83;x[33]=96;x[34]=96;x[35]=97;x[36]=97;x[37]=97;
                    x[38]=98;x[38]=98;x[39]=98;
                    y[0]=4;y[1]=4;y[2]=4;y[3]=2;y[4]=2;y[5]=3;y[6]=3;y[7]=3;y[8]=3;
                    y[9]=4;y[10]=4;y[11]=4;y[12]=4;y[13]=2;y[14]=4;y[15]=1;y[16]=1;
                    y[17]=1;y[18]=1;y[19]=1;y[20]=1;y[21]=1;y[22]=1;y[23]=2;y[24]=1;
                    y[25]=2;y[26]=3;y[27]=4;y[30]=4;y[31]=4;y[32]=4;y[33]=1;y[34]=2;
                    y[35]=1;y[36]=2;y[37]=3;y[38]=1;y[38]=2;y[39]=3;
                    c=1;
                    break;
                }
                case 4 -> {
                    this.n = 99;
                    x = new int[100];
                    y = new int[100];
                    x[0]=1;x[1]=1;x[2]=1;x[3]=1;x[4]=1;x[5]=2;x[6]=2;x[7]=2;x[8]=2;x[9]=2;
                    x[10]=3;x[11]=3;x[12]=3;x[13]=3;x[14]=3;x[15]=4;x[16]=4;x[17]=4;
                    x[18]=4;x[19]=5;x[20]=5;x[21]=5;x[22]=6;x[23]=6;x[24]=7;x[25]=7;
                    x[26]=27;x[27]=27;x[28]=28;x[29]=28;x[30]=29;x[31]=29;x[32]=30;x[33]=30;
                    x[34]=33;x[35]=34;x[36]=37;x[37]=38;
                    x[38]=41;x[39]=41;x[40]=42;x[41]=42;x[42]=43;x[43]=43;x[44]=44;x[45]=44;x[46]=45;x[47]=45;x[48]=46;x[49]=46;
                    x[50]=47;x[51]=47;x[52]=48;x[53]=48;x[54]=42;x[55]=43;
                    x[56]=64;x[57]=64;x[58]=64;x[59]=65;x[60]=65;x[61]=65;x[62]=66;x[63]=66;x[64]=66;x[65]=67;x[66]=67;x[67]=67;
                    x[68]=78;x[69]=78;x[70]=78;x[71]=78;x[72]=78;x[73]=78;x[74]=78;
                    x[75]=79;x[76]=79;x[77]=79;x[78]=79;x[79]=79;x[80]=79;x[81]=79;
                    x[82]=80;x[83]=80;x[84]=80;x[85]=80;x[86]=80;x[87]=80;x[88]=80;
                    x[89]=68;x[90]=69;x[91]=70;x[92]=71;x[93]=72;x[94]=73;x[95]=74;x[96]=75;x[97]=76;x[98]=77;
                    y[0]=1;y[1]=2;y[2]=3;y[3]=4;y[4]=5;y[5]=1;y[6]=2;y[7]=3;y[8]=4;y[9]=5;
                    y[10]=1;y[11]=2;y[12]=3;y[13]=4;y[14]=5;y[15]=1;y[16]=2;y[17]=3;
                    y[18]=4;y[19]=1;y[20]=2;y[21]=3;y[22]=1;y[23]=2;y[24]=1;y[25]=2;
                    y[26]=1;y[27]=2;y[28]=1;y[29]=2;y[30]=1;y[31]=2;y[32]=1;y[33]=2;
                    y[34]=2;y[35]=2;y[36]=2;y[37]=2;
                    y[38]=1;y[39]=2;y[40]=1;y[41]=2;y[42]=1;y[43]=2;y[44]=1;y[45]=2;y[46]=1;y[47]=2;y[48]=1;y[49]=2;
                    y[50]=1;y[51]=2;y[52]=1;y[53]=2;y[54]=6;y[55]=6;
                    y[56]=1;y[57]=2;y[58]=3;y[59]=1;y[60]=2;y[61]=3;y[62]=1;y[63]=2;y[64]=3;y[65]=1;y[66]=2;y[67]=3;
                    y[68]=1;y[69]=2;y[70]=3;y[71]=4;y[72]=5;y[73]=11;y[74]=12;
                    y[75]=1;y[76]=2;y[77]=3;y[78]=4;y[79]=5;y[80]=11;y[81]=12;
                    y[82]=1;y[83]=2;y[84]=3;y[85]=4;y[86]=5;y[87]=11;y[88]=12;
                    y[89]=3;y[90]=3;y[91]=3;y[92]=3;y[93]=3;y[94]=3;y[95]=3;y[96]=3;y[97]=3;y[98]=3;
                    c=1;
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                x[i]=x[i]*16;
                y[i]=y[i]*16;
            }
        }
        for (int i = 0; i < n; i++) {
            try {
                g.drawImage(ImageIO.read(new File("entorno/arreglADO.png")), x[i], 409-y[i], game);
            } catch (IOException ex) {
                Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public int colision(luigui personaje){
        int colision = 0;
        for (int i = 0; i < n; i++) {
            if (personaje.x+16 == this.x[i] && personaje.Y+32>409-this.y[i] && personaje.Y<(409-this.y[i]+16)) {
                colision = 1;
            }
            if (personaje.Y+32==409-this.y[i] && personaje.x+16>this.x[i] && personaje.x<this.x[i]+16){
                colision = 2;
            }
            if (personaje.x==this.x[i]+16 && personaje.Y+32>409-this.y[i] && personaje.Y<409-this.y[i]+16){
                colision = 3;
            }
            if (personaje.Y==409-this.y[i]+16 && personaje.x+16>this.x[i] && personaje.x<this.x[i]+16){
                colision = 4;
            }
        }
        return colision;
    }
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xa = 0;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xa = -1;
        }
    }
}
