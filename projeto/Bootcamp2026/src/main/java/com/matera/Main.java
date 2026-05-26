package com.matera;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", "Notebook Dell Inspiron 15",4499.00),
                new Produto("Smartphone", "Samsung S10 Lite",1500.0),
                new Produto("Fone de ouvido", "GM2 pro ",72.0)
        );

        List<Produto> produtosCaros = produtos
                .stream()
                .filter(produto -> produto.getPreco() > 1000.00)
                .toList();


        double valorTotal =  produtos
                .stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("Valor total :"+ valorTotal);
        System.out.println("Produtos acima de  1k:"+produtosCaros);
    }
}