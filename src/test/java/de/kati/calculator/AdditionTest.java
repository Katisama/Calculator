package de.kati.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTest {

    /* cut = Class Under Test */
    Addition cut;

    @BeforeEach
    void initialiseMyStuff() {
        cut = new Addition();
    }

    @Test
    @DisplayName("GIVEN 2 values, WHEN call calculate, THAN result should be 3")
    void calculate2floats() {

        // GIVEN
        float value1 = 1;
        float value2 = 2;

        //WHEN
        double result = cut.calculate(value1, value2);


        /* dont use this couse of bad readablillity */
//        assertEquals(3,result);

        /* better use AssertJ for its flued expressions */
        /* https://assertj.github.io/doc/ */

        // THAN
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("GIVEN list of values, WHEN call calculate, THAN result should be 9")
    void testCalculate() {

        /* GIVEN */
        float[] givenValues = {2, 3, 4};

        /* WHEN */
        double result = cut.calculate(givenValues);

        /* THAN */
        assertThat(result).isEqualTo(9);

    }

    @Test
    @DisplayName("given 2 and 0 when calculate than result have to be 2")
    void addValueWithZero(){

        /*Given*/
        float value1 = 2;
        float zero = Float.MIN_VALUE;

        /*When*/
        double result = cut.calculate(value1, zero);

        /*Than*/
        assertThat(result).isEqualTo(2);
    }

    @Test
    @Disabled("couse not impleented")
    @DisplayName("nix testet irgend was")
    void nix() {
        assertThat(true).isTrue();


    }

    @Test
    void testWithNegativeValues(){
        /* GIVEN */
        float value1 = -2;
        float value2 = -3;

        /* WHEN */
        double result = cut.calculate(value1, value2);

        /* THAN */
        assertThat(result).isEqualTo(-5);
    }

    @Test
    void testWithNegativeValuesAndPositiveValues(){
        /* GIVEN */
        float value1 = -2;
        float value2 = 3;

        /* WHEN */
        double result = cut.calculate(value1, value2);

        /* THAN */
        assertThat(result).isEqualTo(1);

    }
}