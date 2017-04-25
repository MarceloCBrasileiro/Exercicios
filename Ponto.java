class Ponto{
	float x;
	float y;
	Ponto(float x, float y){
		this.x = x;
		this.y = y;
	}
	void moverPonto(float dx,float dy){
		this.x +=dx;
		this.y +=dy;
	}


}