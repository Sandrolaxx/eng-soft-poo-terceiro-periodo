package com.aktie;

import javax.swing.JOptionPane;

public class CalcCaso {
    public static void main(String[] args) {
        String operation = "0";

        while (!operation.equals("5")) {
            String firstNumber = JOptionPane.showInputDialog(null, "Informe primeiro número:", "Calculadora Maluca",
                    JOptionPane.DEFAULT_OPTION);
            String segundoNumero = JOptionPane.showInputDialog(null, "Informe o segundo número:", "Calculadora Maluca",
                    JOptionPane.DEFAULT_OPTION);
            operation = JOptionPane.showInputDialog(null,
                    "Escolha o operador \n[1] - Soma \n[2] - Sub \n[3] - Mult \n[4] - Div \n[5] - Sair: ", "Operador ",
                    JOptionPane.DEFAULT_OPTION);
            try {
                double num1 = Double.parseDouble(firstNumber);
                double num2 = Double.parseDouble(segundoNumero);
                double resultado = 0;
                String descricaoOperacao = "";

                switch (operation) {
                    case "1":
                        descricaoOperacao = "Soma";
                        resultado = num1 + num2;
                        break;
                    case "2":
                        descricaoOperacao = "Sub";
                        resultado = num1 - num2;
                        break;
                    case "3":
                        descricaoOperacao = "Mult";
                        resultado = num1 * num2;
                        break;
                    case "4":
                        descricaoOperacao = "Div";
                        resultado = num1 / num2;
                        break;
                    case "5":
                        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossa aplicação!", "Obrigado!",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Operação informada inválida", "Erro",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                }

                JOptionPane.showMessageDialog(null, num1 + descricaoOperacao + num2 + "=" + resultado,
                        "Os valores e a Operacao", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor informado inválido - " + e.getMessage(), "Erro",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }
}
