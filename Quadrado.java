

class Quadrado extends Figura{
	float lado;
	String cor;
	Boolean colorido;
	Ponto Ponto1;
	Ponto Ponto2;
	Ponto Ponto3;
	Ponto Ponto4;
	
	
	Quadrado(float lado){
		this.Ponto1 = new Ponto(0,0);
		this.Ponto2 = new Ponto(0,lado);
		this.Ponto3 = new Ponto(lado,0);
		this.Ponto4 = new Ponto(lado,lado);
		this.colorido = false;
		this.lado = lado;
		
	}
	public void mover(float dx, float dy){
		this.Ponto1.moverPonto(dx,dy);
		this.Ponto2.moverPonto(dx,dy);
		this.Ponto3.moverPonto(dx,dy);
		this.Ponto4.moverPonto(dx,dy);
		
	
	}
	public float CalcularArea(){
		return this.lado*this.lado;
	}
	public void Desenhar(String x){
		this.colorido=true;
		this.cor =x;

	}
	boolean ChecarColorido(){
		return this.colorido;
	}

   

}
