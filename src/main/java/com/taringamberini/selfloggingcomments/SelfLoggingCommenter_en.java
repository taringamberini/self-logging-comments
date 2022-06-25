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

import org.slf4j.Logger;

/**
 * <p>
 * This class lets you log a code comment in the style of Behavior-Driven
 * Development (BDD), prepending the log message with the words: GIVEN, WHEN,
 * THEN, etc ...</p>
 * <p>
 * Method's name of this class are UPPERCASED. I've chosen to not being
 * compliant with the java naming convention, because I find it makes test class
 * more readable, expecially if you instantiate this class assigning it to a
 * variable named `__` (a double underscore).</p>
 *
 * @author Tarin Gamberini
 */
public class SelfLoggingCommenter_en {

    private final Logger LOGGER;

    /**
     * @param testClassLogger the test class' logger which this class is
     * instantiated in.
     */
    public SelfLoggingCommenter_en(Logger testClassLogger) {
        this(testClassLogger, "");
    }

    /**
     * @param testClassLogger the test class' logger which this class is
     * instantiated in.
     * @param testedMethodName the method's name which this class is
     * instantiated in.
     */
    public SelfLoggingCommenter_en(Logger testClassLogger, String testedMethodName) {
        LOGGER = testClassLogger;
        LOGGER.info("--------- {}", testedMethodName);
    }

    /**
     * Logs the english word {@code Scenario}, in english {@code Scenario},
     * followed by the logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en SCENARIO(String logMessage) {
        LOGGER.debug("Scenario: {}", logMessage);
        return this;
    }

    /**
     * Logs the english word {@code GIVEN}, in english {@code GIVEN}, followed
     * by the logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en GIVEN(String logMessage) {
        LOGGER.debug("    GIVEN {}", logMessage);
        return this;
    }

    /**
     * Logs the english word {@code WHEN}, in english {@code WHEN}, followed by
     * the logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en WHEN(String logMessage) {
        LOGGER.debug("     WHEN {}", logMessage);
        return this;
    }

    /**
     * Logs the english word {@code THEN}, in english {@code THEN}, followed by
     * the logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en THEN(String logMessage) {
        LOGGER.debug("     THEN {}", logMessage);
        return this;
    }

    /**
     * Logs the english word {@code AND}, in english {@code AND}, followed by
     * the logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en AND(String logMessage) {
        LOGGER.debug("      AND {}", logMessage);
        return this;
    }

    /**
     * Logs the english word {@code BUT}, in english {@code BUT}, followed by
     * the logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en BUT(String logMessage) {
        LOGGER.debug("      BUT {}", logMessage);
        return this;
    }

    /**
     * Logs the english word {@code OR}, in english {@code OR}, followed by the
     * logMessage.
     *
     * @param logMessage the message to log.
     *
     * @return a reference to this object in order to allow a "fluent interface"
     * programming style.
     */
    public SelfLoggingCommenter_en OR(String logMessage) {
        LOGGER.debug("       OR {}", logMessage);
        return this;
    }

}
