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

public class SelfLoggingCommenter_enTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SelfLoggingCommenter_enTest.class);

    @Test // it's not at all a test, it's only an handy way to print all words
    public void test_en_PrintAllWords(TestInfo testInfo) {
        SelfLoggingCommenter_en __ = new SelfLoggingCommenter_en(LOGGER, testInfo.getDisplayName()).
                SCENARIO("scenario").
                GIVEN("given").
                WHEN("when").
                THEN("then").
                AND("and").
                BUT("but").
                OR("or");

        assertThat(__).isNotNull();
    }

    @Test // it's not at all a test, it's only an handy way to show an use case
    public void test_en_AnUseCase(TestInfo testInfo) {
        SelfLoggingCommenter_en __ = new SelfLoggingCommenter_en(LOGGER, testInfo.getDisplayName()).
                SCENARIO("Converting a string to uppercase");

        // GIVEN a string
        __.GIVEN("a string");
        String aString = new String("aString");

        // WHEN you convert it to uppercase
        __.WHEN("you convert it to uppercase");
        String theUppercasedString = aString.toUpperCase();

        // THEN it must be uppercased
        __.THEN("it must be uppercased");
        assertThat(theUppercasedString).isEqualTo("ASTRING");
    }

}
