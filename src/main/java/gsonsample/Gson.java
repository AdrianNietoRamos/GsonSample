package gsonsample;

import java.util.Scanner;


import com.google.gson.GsonBuilder;

public class Gson {

	public static void main(String[] args) {
		persona p=new persona();
		Scanner scanner = new Scanner(System.in);
		System.out.println("(Obligatorio) Introduce el nombre:");
		p.nombre = scanner.nextLine();
		 while (!p.nombre.matches("^[a-zA-Z]+$")) {
	            System.out.println("Introduzca otro nombre:");
	            p.nombre = scanner.nextLine();
	        }
		 System.out.println("(Obligatorio) Introduce los apellidos:");
		p.apellido = scanner.nextLine();
		while (!p.apellido.matches("^[a-zA-Z]+( [a-zA-Z]+)*$")) {
            System.out.println("Introduzca otros apellidos");
             p.apellido = scanner.nextLine();
        }
		System.out.println("(Obligatorio) Introduce la edad:");
		p.edad = scanner.nextInt();
		com.google.gson.Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		scanner.close();

	}

}
