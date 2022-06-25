package com.taringamberini.selfloggingcomments;

/*-
 * #%L
 * self-logging-comments
 * %%
 * Copyright (C) 2018 - 2022 Tarin Gamberini
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelfLoggingCommenter_itTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SelfLoggingCommenter_itTest.class);

    @Test // non è per niente un test, è solo un modo pratico per stampare tutte le parole
    public void test_it_PrintAllWords(TestInfo testInfo) {
        SelfLoggingCommenter_it __ = new SelfLoggingCommenter_it(LOGGER, testInfo.getDisplayName()).
                SCENARIO("scenario").
                DATO("dato").
                DATA("data").
                DATI("dati").
                DATE("date").
                QUANDO("quando").
                ALLORA("allora").
                E("e").
                MA("ma").
                O("o");

        assertThat(__).isNotNull();
    }

    @Test // non è per niente un test, è solo un modo pratico per mostrare un caso d'uso
    public void test_it_AnUseCase(TestInfo testInfo) {
        SelfLoggingCommenter_it __ = new SelfLoggingCommenter_it(LOGGER, testInfo.getDisplayName()).
                SCENARIO("Conversione di una stringa in maiuscolo");

        // DATA una stringa
        __.DATA("una stringa");
        String unaStringa = new String("unaStringa");

        // QUANDO la converti in maiuscolo
        __.QUANDO("la converti in maiuscolo");
        String laStringaMaiuscola = unaStringa.toUpperCase();

        // ALLORA deve essere in maiuscolo
        __.ALLORA("deve essere in maiuscolo");
        assertThat(laStringaMaiuscola).isEqualTo("UNASTRINGA");
    }
}
