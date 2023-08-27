package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 200;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2Dollar() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen1Dot4Dollar() {
        float in = 200;
        float expected = 2.2f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.1f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}