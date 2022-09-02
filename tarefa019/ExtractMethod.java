import java.util.List;

// não refatorado

class TrianguloRetangulo {
    double lado1;
    double lado2;

    public double calcularPerimetro(){
        double hipotenusa, quad1, quad2;
        quad1 = lado1*lado1;
        quad2 = lado2*lado2;

        hipotenusa = Math.sqrt(quad1+quad2);

        return lado1+lado2+hipotenusa;
        
        
    }
}

//refatorado

class TrianguloRetanguloRefatorado {
    double lado1;
    double lado2;

    public double calcularPerimetro(){
        

        return lado1+lado2+this.calculaHipotenusa(lado1, lado2);
        
        
    }

    public double calculaHipotenusa(double lado1, double lado2){
        double hipotenusa, quad1, quad2;
        quad1 = lado1*lado1;
        quad2 = lado2*lado2;

        hipotenusa = Math.sqrt(quad1+quad2);
        return hipotenusa;

    }
}

