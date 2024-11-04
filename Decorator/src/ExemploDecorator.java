
public class ExemploDecorator {
	public static void main(String[] args) {
		Bebida cafe = new Cafe();
		
		// adicionando leite, açúcar, chocolate e chantilly.
		cafe = new LeiteDecorator(cafe);
		cafe = new AcucarDecorator(cafe);
		cafe = new ChocolateDecorator(cafe);
		cafe = new ChantillyDecorator(cafe);
		
		System.out.println("Bebidas: " + cafe.obterDescricao());
		System.out.println("Custo Total: R$" + cafe.obterCusto());
	}
}
