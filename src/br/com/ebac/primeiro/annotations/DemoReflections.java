package br.com.ebac.primeiro.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class DemoReflections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ANNOTATIONS");
		
		DemoAnnotation dAnnotation = new DemoAnnotation();
		
		Annotation[] annotations = dAnnotation.getClass().getAnnotations();
		
		for (Annotation an : annotations) {
			System.out.println("Annotation type: " + an.annotationType());
		}
		
		for(Field field : dAnnotation.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(Tabela.class)) {
				Tabela tabela = field.getAnnotation(Tabela.class);
				System.out.println("Nome annotation: " + tabela.toString());
				System.out.println("Valor annotation: " + tabela.valor());
			}
		}
		if (dAnnotation.getClass().isAnnotationPresent(Tabela.class)) {
			Tabela tbl = dAnnotation.getClass().getAnnotation(Tabela.class);
			System.out.println("Name annotation: " + tbl.getClass().getName());
			System.out.println("Value annotation: " + tbl.valor());
		}
		
		

	}

}
