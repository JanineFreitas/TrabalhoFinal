package questao2;

public class Numbers implements IntegerSet {
	private boolean[] conjunto;
	
	public Numbers(){
		conjunto = new boolean[101];
	}
	
	@Override
	public void add(Integer n) {
		try{	
			this.conjunto[n] = true;
			System.out.println(n + " adicionado a Numbers");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(n + " FORA DO LIMITE: Conjunto apenas entre 0 e 100");
		}
	}

	@Override
	public void remove(Integer n) {
		try{
			this.conjunto[n] = false;
			System.out.println(n + " removido de Numbers");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(n + " FORA DO LIMITE: Conjunto apenas entre 0 e 100");
		}
	}

	@Override
	public IntegerSet union(IntegerSet set) {
		boolean[] unionConjunto = new boolean[conjunto.length];
		boolean[] setConjunto 	= set.getConjunto();
		
		for(int i = 0; i < this.conjunto.length; i++) {
			if(this.conjunto[i] == true || setConjunto[i] == true){
				unionConjunto[i] = true;
			}
		}
		
		IntegerSet unionNumbers = new Numbers();
		unionNumbers.setConjunto(unionConjunto);
		imprimirConjunto("Union", unionConjunto);
		return unionNumbers;
	}

	@Override
	public IntegerSet intersection(IntegerSet set) {
		boolean[] intersectionConjunto 	= new boolean[conjunto.length];
		boolean[] setConjunto 			= set.getConjunto();
		
		for(int i = 0; i < this.conjunto.length; i++) {
			if(this.conjunto[i] == true && setConjunto[i] == true){
				intersectionConjunto[i] = true;
			}
		}
		
		IntegerSet intersectionNumbers = new Numbers();
		intersectionNumbers.setConjunto(intersectionConjunto);
		imprimirConjunto("Intersection", intersectionConjunto);
		return intersectionNumbers;
	}

	@Override
	public IntegerSet diff(IntegerSet set) {
		boolean[] diffConjunto 	= this.conjunto;
		boolean[] setConjunto 	= set.getConjunto();
		
		for(int i = 0; i < this.conjunto.length; i++) {
			if(this.conjunto[i] == true && setConjunto[i] == true){
				diffConjunto[i] = false;
			}
		}
		
		IntegerSet diffNumbers = new Numbers();
		diffNumbers.setConjunto(diffConjunto);
		imprimirConjunto("Diff", diffConjunto);
		return diffNumbers;
	}
	
	public boolean[] getConjunto(){
		return this.conjunto;
	}
	
	public void setConjunto(boolean[] conjunto){
		this.conjunto = conjunto;
	}
	
	public static void imprimirConjunto(String name, boolean[] numeros){
		System.out.println("Conjunto " + name + ": ");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == true){
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();
	}
}
