package br.com.erudio.math

import org.springframework.web.bind.annotation.PathVariable


class SimpleMath {

    fun soma(numberOne: Double, numberTwo: Double) = numberOne + numberTwo;

    fun subtracao(numberOne: Double, numberTwo: Double) = numberOne - numberTwo;

    fun multiplicacao(numberOne: Double, numberTwo: Double) = numberOne * numberTwo;

    fun divisao(numberOne: Double, numberTwo: Double) = numberOne / numberTwo;

    fun media(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo)/2;

    fun raizQuadrada(number: Double) = Math.sqrt(number);

    fun potenciacao(numberOne: Double, numberTwo: Double) = Math.pow(numberOne, numberTwo);
}