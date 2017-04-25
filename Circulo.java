class Circulo extends Figura{
	float raio;
	Boolean colorido = false;
	Ponto Ponto1;
	
	
	Circulo(Ponto ponto, float raio){
		this.Ponto1 = ponto;
		this.raio = raio;
		this.colorido = false;
		
	}
	public void mover(float dx, float dy){
		this.Ponto1.moverPonto(dx,dy);
	
	}
	public float CalcularArea(){
		return ((float) Math.PI)*(raio*raio);
	}
	public void Desenhar(String x){
		System.out.println("O Circulo nao pode ser colorido.");

	}
	boolean ChecarColorido(){
		return this.colorido;
	}

   

}