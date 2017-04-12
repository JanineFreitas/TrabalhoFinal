package questao2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Progama Janine Freitas e Vitor Herbert");
		
		System.out.println("Adições a i1");
		IntegerSet i1 = new Numbers();
		i1.add(1);
		i1.add(100);
		i1.add(52);
		i1.add(88);
		i1.add(55);
		i1.add(56);
		Numbers.imprimirConjunto("i1", i1.getConjunto());
		
		System.out.println("Remoções de i1");
		i1.remove(100);
		i1.remove(88);
		Numbers.imprimirConjunto("i1", i1.getConjunto());
		
		System.out.println("Adições a i2");
		IntegerSet i2 = new Numbers();
		i2.add(1);
		i2.add(100);
		i2.add(33);
		i2.add(56);
		
		System.out.println();
		Numbers.imprimirConjunto("i1", i1.getConjunto());
		Numbers.imprimirConjunto("i2", i2.getConjunto());
		
		i1.union(i2);
		i1.intersection(i2);
		i1.diff(i2);
	}

}
