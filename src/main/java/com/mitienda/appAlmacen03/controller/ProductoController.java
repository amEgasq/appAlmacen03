package com.mitienda.appAlmacen03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mitienda.appAlmacen03.model.Producto;

@Controller
public class ProductoController {
	
	@GetMapping("/appProducto")
	public String mostrarFormulario(Model model) {
		model.addAttribute("objProducto", new Producto());
		return "formulario.html";
	}
	
	@PostMapping("/calcular")
	public String calcularProducto(@ModelAttribute("producto") Producto objProducto, Model model) {
		//Logica de negocios
		double subtotal = objProducto.getPrecio() * objProducto.getCantidad();
		double descuento = 0.0;
		
		if(subtotal > 100) {
			descuento = subtotal * 0.1; // 10% de descuento
		}
		
		objProducto.setDescuento(descuento);
		objProducto.setTotal(subtotal - descuento);
		
		model.addAttribute("resultado", objProducto);
		
		return "resultado.html";
	}
}
