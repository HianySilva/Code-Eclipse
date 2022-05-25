package projeto;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class App {
		public static void main(String[]args) {
			
			ArrayList<Carro> carros=new ArrayList<Carro>();
			ArrayList<Moto> motos=new ArrayList<Moto>();
			
			String marca;
			String modelo;
			String ano;
			String cor;
			int contador = 1;
			int alterar;
			String formatado;
			int opcao;
			
			Scanner in = new Scanner(System.in);
			
			while(true) {
				System.out.println("------ MENU PRINCIPAL ------");
				System.out.println("1 - Criar Novo Objeto:");
				System.out.println("2 - Consultar Objeto");
				System.out.println("3 - Alterar Objeto");
				System.out.println("4 - Excluir Objeto");
				System.out.println("5 - Sair");
				System.out.println("-----------------------------");
				
				System.out.println("Digite sua opção: ");
				opcao =in.nextInt();
				
				if(opcao==1) {
					System.out.println("Criar novo objeto:");
					System.out.println("Digite 1 para criar o Carro:");
					System.out.println("Digite 2 para criar a Moto:");
					System.out.println("Digite sua opção: ");
					opcao=in.nextInt();
					
					
					if(opcao==1) {
						String nome= "Carro";
						System.out.println("Digite a marca:");
						marca=in.next();
						System.out.println("Digite o modelo:");
						modelo=in.next();
						System.out.println("Digite o ano:");
						ano=in.next();
						System.out.println("Digite a cor:");
						cor=in.next();
						Carro c =new Carro(marca, modelo, ano, cor, false, 0);
						carros.add(c);
					
					}else if(opcao==2) {
						System.out.println("Digite a marca:");
						marca=in.next();
						System.out.println("Digite o modelo:");
						modelo=in.next();
						System.out.println("Digite o ano:");
						ano=in.next();
						System.out.println("Digite a cor:");
						cor=in.next();
						Moto m=new Moto(marca, modelo, ano, cor, false, 0);
						motos.add(m);
						
					}
				}else if(opcao == 2) {
					//Se o tamanho do array motos for 0 ele irá mostrar a mesagem:
					if(motos.size() == 0) {
						System.out.println("---- Objetos motos criados ----");
						System.out.println("Ainda não foi criado nenhum objeto moto!");
						System.out.println();
					}else {
						//Se o array for maior que zero ele será Mostrado:
						System.out.println("-----------------");
						System.out.println("Total de motos criadas: " + motos.size());
						System.out.println("-----------------");
						for (Moto item : motos) {
							System.out.println("Marca: " + item.getMarca());
							System.out.println("Modelo: " + item.getModelo());
							System.out.println("Ano: " + item.getAno());
							System.out.println("Cor: " + item.getCor());
							System.out.println("--------------------------");
						}
					}
					//A mesma lógica para mostrar os objetos carro criados:
					if(carros.size() == 0) {
						System.out.println("---- Objetos Carros criados ----");
						System.out.println("Ainda não foi criado nenhum objeto Carro!");
						System.out.println();
					}else {
						//Se o array for maior que zero ele será Mostrado:
						System.out.println("-----------------");
						System.out.println("Total de Carros criados: " + carros.size());
						System.out.println("-----------------");
						//o item é uma  variavel de controle:
						for (Carro item : carros) {
							System.out.println("Marca: " + item.getMarca());
							System.out.println("Modelo: " + item.getModelo());
							System.out.println("Ano: " + item.getAno());
							System.out.println("Cor: " + item.getCor());
							System.out.println("--------------------------");
						}
					}
					
				}else if(opcao == 3) {
					System.out.println();
					System.out.println("Deseja alterar um objeto carro ou moto?");
					System.out.println("(1) - Para alterar um carro");
					System.out.println("(2) - Para alterar uma moto");
					opcao = in.nextInt();
					if(opcao == 1) {
						System.out.println("------ Lista de Carros ------");
						for (Carro item : carros) {
							System.out.println("Digite " + contador + " para alterar esse objeto");
							formatado = "Marca: " + item.getMarca() + "\n Modelo:" + item.getModelo() 
							+ "\n Ano: " + item.getAno() + "\n Cor: " + item.getCor();
							System.out.println(formatado);
							contador++;
						}
						System.out.println("Digite o valor do objeto que deseja alterar: ");
						
						//Pegando posição do objeto que será alterado:
						opcao = in.nextInt();
						//Como o array começa em zero, precisamos subtrair por -1 para pegar a posição correta:
						alterar = opcao - 1;
				
						System.out.println("------ Digite o que deseja alterar ------");
						System.out.println("(1) Para alterar Marca");
						System.out.println("(2) Para alterar Modelo");
						System.out.println("(3) Para alterar Ano");
						System.out.println("(4) Para alterar Cor");
						opcao = in.nextInt();
						
						//Condicionais de alteração:
						if(opcao == 1) {
							System.out.println("Digite o nova marca:");
							//Pegando novo valor:
							marca = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							carros.get(alterar).setMarca(marca);
						}else if(opcao == 2) {
							System.out.println("Digite o novo modelo: ");
							//Pegando novo valor:
							modelo = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							carros.get(alterar).setModelo(modelo);
						}else if(opcao == 3) {
							System.out.println("Digite o novo ano: ");
							//Pegando novo valor:
							ano = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							carros.get(alterar).setAno(ano);
						}else if(opcao == 4) {
							System.out.println("Digite a nova cor: ");
							//Pegando novo valor:
							cor = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							carros.get(alterar).setCor(cor);
						}else {
							System.out.println("Valor digitado é inválido!");
						}
					}else if(opcao == 2) {
						System.out.println("------ Lista de Motos ------");
						for (Moto item : motos) {
							System.out.println("Digite " + contador + " para alterar esse objeto");
							formatado = "Marca: " + item.getMarca() + "\n Modelo:" + item.getModelo() 
							+ "\n Ano: " + item.getAno() + "\n Cor: " + item.getCor();
							System.out.println(formatado);
							contador++;
						}
						System.out.println("Digite o valor do obejto que deseja alterar: ");
						
						//Pegando posição do objeto que será alterado:
						opcao = in.nextInt();
						//Como o array começa em zero, precisamos subtrair por -1 para pegar a posição correta:
						alterar = opcao - 1;
				
						System.out.println("------ Digite o que deseja alterar ------");
						System.out.println("(1) Para alterar Marca");
						System.out.println("(2) Para alterar Modelo");
						System.out.println("(3) Para alterar Ano");
						System.out.println("(4) Para alterar Cor");
						opcao = in.nextInt();
						
						//Condicionais de alteração:
						if(opcao == 1) {
							System.out.println("Digite o nova marca:");
							//Pegando novo valor:
							marca = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							motos.get(alterar).setMarca(marca);
						}else if(opcao == 2) {
							System.out.println("Digite o novo modelo: ");
							//Pegando novo valor:
							modelo = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							motos.get(alterar).setModelo(modelo);
						}else if(opcao == 3) {
							System.out.println("Digite o novo ano: ");
							//Pegando novo valor:
							ano = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							motos.get(alterar).setAno(ano);
						}else if(opcao == 4) {
							System.out.println("Digite a nova cor: ");
							//Pegando novo valor:
							cor = in.next();
							//Pegando o obejto dentro do array pelo seu index e adicionando novo valor:
							motos.get(alterar).setCor(cor);
						}else {
							System.out.println("Valor digitado é inválido!");
						}
						
					}
					//É preciso voltar o contador para seu valor inicial para uma  nova rodada no while:
					contador = 1;
				}else if(opcao == 4) {
					System.out.println("------ Exclusão ------");
					System.out.println("(1) - Para excluir um carro");
					System.out.println("(2) - Para excluir uma moto");
					opcao = in.nextInt();
					if(opcao == 1) {
						System.out.println("------ Digite o objeto que deseja excluir ------");
						
						//Listando objetos carros criados:
						for (Carro item : carros) {
							System.out.println("-----------------------------------");
							System.out.println("Digite "+ contador + " para exluir o objeto abaixo:");
							formatado = "Marca: " + item.getMarca() + "\n Modelo " + item.getModelo() 
							+ "\n Ano: " + item.getAno() + "\n Cor: " + item.getCor();
							System.out.println(formatado);
							contador++;
						}
						System.out.println("Digite o valor do objeto que deseja excluir: ");
						opcao = in.nextInt();
						carros.remove(opcao - 1);
						System.out.println("Elemento exluido com sucesso!");
					}else if(opcao == 2) {
						System.out.println("------ Digite o objeto que deseja excluir ------");
						//Listando objetos motos criados:
						for (Moto item : motos) {
							System.out.println("Digite "+ contador + "para exluir: ");
							System.out.println("Digite " + contador + " para alterar esse objeto");
							formatado = "Marca: " + item.getMarca() + "\n Modelo " + item.getModelo() 
							+ "\n Ano: " + item.getAno() + "\n Cor: " + item.getCor();
							System.out.println(formatado);
							contador++;
						}
						System.out.println("Digite o valor do objeto que deseja excluir: ");
						opcao = in.nextInt();
						carros.remove(opcao - 1);
						System.out.println("Elemento exluido com sucesso!");
					}
					//Reiniciando a variável contador para o proximo while:
					contador = 1;
				} else if (opcao == 5) {
					System.out.println("Programa finalizado!");
					break;
				}else {
					System.out.println("Valor digitado está inválido");
				} 
			}
			
		}

	}


