package devacademy;

import java.util.*;
import javax.swing.*;

public class ArraysList {
    public static void main(String[] args) {

        // ArrayList<tipo> nome = new ArrayList<tipo>();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Adiciona algo");// adiciona algo no array
        lista.size();// msm q o length do array comum
        lista.get(0);// pega um elemento msm q array[0]
        for (int i = 0; i < lista.size(); i++) {
            String alg = JOptionPane.showInputDialog("insira um valor");
            lista.add(alg);
            if (alg.equals("sair")) {
                break;
            }
        }
        
        for (String string : lista) {
            System.out.println(string);
        }
        
        lista.clear();// limpa tds os elementos
    }
}