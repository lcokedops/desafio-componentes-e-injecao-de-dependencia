package com.desafioComp.desafio;

import com.desafioComp.desafio.entities.Order;
import com.desafioComp.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@ComponentScan({"com.desafioComp.desafio"})
@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Código do pedido: ");
		int code = sc.nextInt();

		System.out.print("Valor do pedido: ");
		double basic = sc.nextDouble();

		System.out.print("Desconto: ");
		double discount = sc.nextDouble();
/*
		System.out.print("Desconto: ");
		double discount = sc.nextDouble();
*/
		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
	}
}
