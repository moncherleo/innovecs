package com.innovecs.carriers.qaa;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DictionaryTest {

    @Test
    public void noWordsInListNoOccurences() {
        Assert.assertEquals(0, new Dictionary().getOccurence("abbot"));
        ;
    }

    @Test
    public void oneWordsInListNoOccurences() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("people");
        Assert.assertEquals(0, dictionary.getOccurence("shit"));
    }

    @Test
    public void oneWordsInListOneOccurence() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("people");
        Assert.assertEquals(1, dictionary.getOccurence("people"));
    }

    @Test
    public void twoWordsInListNoOccurences() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("people");
        dictionary.store("fish");
        Assert.assertEquals(0, dictionary.getOccurence("foam"));
    }

    @Test
    public void twoWordsInListOneOccurence() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("people");
        dictionary.store("fish");
        Assert.assertEquals(1, dictionary.getOccurence("fish"));
    }

    @Test
    public void twoWordsInListOneOccurenceStartsFromCapitalNextAllPlainInputStartsFromPlainNextAllCapital() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("Monk");
        dictionary.store("Bubble");
        Assert.assertEquals(1, dictionary.getOccurence("bUBBLE"));
    }

    @Test
    public void twoWordsInListOneOccurenceStartsFromSmallNextAllCapitalInputStartsFromCapitalNextAllPlain() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("pING");
        dictionary.store("pOKE");
        Assert.assertEquals(1, dictionary.getOccurence("Ping"));
    }

    @Test
    public void twoWordsInListOneOccurenceAllSmallInputCapital() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("joke");
        dictionary.store("kind");
        Assert.assertEquals(1, dictionary.getOccurence("KIND"));
    }

    @Test
    public void twoWordsInListOneOccurenceAllCapitalInputAllPlain() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("RUNNING");
        dictionary.store("SHOES");
        Assert.assertEquals(1, dictionary.getOccurence("shoes"));
    }

    @Test
    public void twoWordsInListOneOccurenceAllMixedCase() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("jUmPiNg");
        dictionary.store("PrEtTY");
        Assert.assertEquals(1, dictionary.getOccurence("pReTtY"));
    }

    @Test
    public void fourWordsInListFourOccurencesDifferentCases() {
        Dictionary dictionary = new Dictionary();
        dictionary.store("SALAD");
        dictionary.store("salad");
        dictionary.store("Salad");
        dictionary.store("sALAD");
        Assert.assertEquals(4, dictionary.getOccurence("sALAd"));
    }

}
