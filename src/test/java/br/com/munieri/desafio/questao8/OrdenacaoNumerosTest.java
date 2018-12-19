package br.com.munieri.desafio.questao8;

import org.junit.Assert;
import org.junit.Test;

public class OrdenacaoNumerosTest {

    @Test
    public void deve_retornar_menos_um_quando_numero_gerado_maior_que__um_milao() {

        Integer c = -1;
        Integer a = 10256;
        Integer b = 512;

        MergeNumeros merge = new MergeNumeros();

        Assert.assertEquals(c, merge.c(a, b));
    }

    @Test
    public void deve_retornar_numero_mergiado() {

        Integer c = 150122;
        Integer a = 102;
        Integer b = 512;

        MergeNumeros merge = new MergeNumeros();

        Assert.assertEquals(c, merge.c(a, b));

    }
}