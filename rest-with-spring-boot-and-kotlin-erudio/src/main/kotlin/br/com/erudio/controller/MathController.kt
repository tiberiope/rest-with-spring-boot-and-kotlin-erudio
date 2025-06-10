package br.com.erudio.controller

import br.com.erudio.converters.NumberConverter
import br.com.erudio.exceptions.UnsuportedMathOperationException
import br.com.erudio.math.SimpleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class MathController {
    
    val counter: AtomicLong = AtomicLong()
    private val math: SimpleMath = SimpleMath()

    @RequestMapping(value = ["/soma/{numberOne}/{numberTwo}"])
    fun soma(@PathVariable(value = "numberOne") numberOne: String?,
             @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.soma(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/subtracao/{numberOne}/{numberTwo}"])
    fun subtracao(@PathVariable(value = "numberOne") numberOne: String?,
                  @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.subtracao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/divisao/{numberOne}/{numberTwo}"])
    fun divisao(@PathVariable(value = "numberOne") numberOne: String?,
                @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.divisao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/multiplicacao/{numberOne}/{numberTwo}"])
    fun multiplicacao(@PathVariable(value = "numberOne") numberOne: String?,
                      @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.multiplicacao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/media/{numberOne}/{numberTwo}"])
    fun media(@PathVariable(value = "numberOne") numberOne: String?,
              @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/potenciacao/{numberOne}/{numberTwo}"])
    fun potenciacao(@PathVariable(value = "numberOne") numberOne: String?,
                    @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.potenciacao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = ["/raizQuadrada/{number}"])
    fun raizQuadrada(@PathVariable(value = "number") number: String?
    ): Double{
        if (!NumberConverter.isNumeric(number))
            throw UnsuportedMathOperationException("Please set a numeric value!")
        return math.raizQuadrada(NumberConverter.convertToDouble(number));
    }
}