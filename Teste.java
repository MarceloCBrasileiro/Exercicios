class Teste{

	public static void main(String args[]){
		Object[] vetor = new Object[10];
		Ponto Ponto1 = new Ponto(1,5);
		Ponto Ponto2 = new Ponto(2,3);
		Ponto Ponto3 = new Ponto(132,54);
		Ponto Ponto4 = new Ponto(112,5);
		Ponto Ponto5 = new Ponto(13,5);
		

		Editor Editor = new Editor();
		Quadrado Quadrado1 = new Quadrado(10);
		Quadrado Quadrado2 = new Quadrado(4);
		Quadrado Quadrado3 = new Quadrado(30);
		Quadrado Quadrado4 = new Quadrado(50);
		Quadrado Quadrado5 = new Quadrado(20);
		Circulo Circulo1 = new Circulo(Ponto1, 10);
		Circulo Circulo2 = new Circulo(Ponto2, 30);
		Circulo Circulo3 = new Circulo(Ponto3, 4);
		Circulo Circulo4 = new Circulo(Ponto4, 5);
		Circulo Circulo5 = new Circulo(Ponto5, 20);
		Quadrado1.Desenhar("preto");
		Quadrado3.Desenhar("azul");
		Quadrado4.Desenhar("laranja");
		Quadrado5.Desenhar("branco");
		Editor.Desenhar(Quadrado2, "cinza");
		vetor[0] = Quadrado1;
		vetor[1] = Quadrado2;
		vetor[2] = Quadrado3;
		vetor[3] = Quadrado4;
		vetor[4] = Quadrado5;
		vetor[5] = Circulo1;
		vetor[6] = Circulo2;
		vetor[7] = Circulo3;
		vetor[8] = Circulo4;
		vetor[9] = Circulo5;

		for(int i =0; i<10; i++){
			if (i<5){
				Quadrado Quadradoteste;
				Quadradoteste= (Quadrado)vetor[i];
				if(Quadradoteste.ChecarColorido() == true){
				System.out.println(Quadradoteste.CalcularArea());
			}
		}
			if (i>=5){
				Circulo Circuloteste;
				Circuloteste=(Circulo)vetor[i];
				if(Circuloteste.ChecarColorido() == true){
				System.out.println(Circuloteste.CalcularArea());
			}
		}



		}

		Editor.Apagar(Quadrado1);

		System.out.println(Quadrado1.CalcularArea());


	}
}