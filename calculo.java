package imc.ensinoja.com.clculodoimc;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;





public class calculo {


    public float p;
    public float a;
    public float c;


    public void enviar(View view){
    //capturando peso e altura
    EditText peso = (EditText) view.findViewById ( R.id.peso );
    EditText altura = (EditText) view.findViewById ( R.id.altura );


    // capturando resultado
   




    //convertendo



    //convertendo peso e altura
    p = Float.parseFloat ( peso.getText ().toString () );
    a = Float.parseFloat ( altura.getText ().toString () );
    
}






    public void resultado(View view){
        TextView res = (TextView) view.findViewById ( R.id.resultado );

        c = p / a;


        if (c < 17) {


            res.setText ( " Melhor opção: Gasolina" );



        }
        else{
            res.setText ( " Alccol" );
        }



    }

    public float getA() {
        return a;
    }

    public float getC() {
        return c;
    }

    public float getP() {
        return p;
    }


    public void setA(float a) {
        this.a = a;
    }


    public void setC(float c) {
        this.c = c;
    }


    public void setP(float p) {
        this.p = p;
    }
    
    
    
    
}
