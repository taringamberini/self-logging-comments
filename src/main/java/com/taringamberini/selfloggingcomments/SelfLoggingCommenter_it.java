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
 * Questa classe consente di scrivere un commento nel codice nello stile di
 * Behavior-Driven Development (BDD), prefissando il messaggio di log con le
 * parole: DATO, QUANDO, ALLORA, ecc ...</p>
 * <p>
 * I nomi dei metodi di questa classe sono in MAIUSCOLO. Ho scelto di non essere
 * conforme alle convenzioni java sui nomi, perché trovo che ciò renda la classe
 * di test più leggibile, specialmente se si istanzia questa classe assegnandola
 * ad una variabile di nome `__` (un doppio trattino basso).</p>
 *
 * @author Tarin Gamberini
 */
public class SelfLoggingCommenter_it {

    private final Logger LOGGER;

    /**
     * @param testClassLogger il logger della classe che istanzia questa classe.
     */
    public SelfLoggingCommenter_it(Logger testClassLogger) {
        this(testClassLogger, "");
    }

    /**
     * @param testClassLogger il logger della classe che istanzia questa classe.
     * @param testedMethodName il nome del metodo nel quale è istanziata questa
     * classe.
     */
    public SelfLoggingCommenter_it(Logger testClassLogger, String testedMethodName) {
        LOGGER = testClassLogger;
        LOGGER.info("--------- {}", testedMethodName);
    }

    /**
     * Logga la parola italiana {@code Scenario}, in inglese {@code Scenario},
     * seguita dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it SCENARIO(String logMessage) {
        LOGGER.debug("Scenario: {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code DATO}, in inglese {@code GIVEN}, seguita
     * dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it DATO(String logMessage) {
        LOGGER.debug("     DATO {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code DATA}, in inglese {@code GIVEN}, seguita
     * dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it DATA(String logMessage) {
        LOGGER.debug("     DATA {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code DATI}, in inglese {@code GIVEN}, seguita
     * dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it DATI(String logMessage) {
        LOGGER.debug("     DATI {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code DATE}, in inglese {@code GIVEN}, seguita
     * dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it DATE(String logMessage) {
        LOGGER.debug("     DATE {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code QUANDO}, in inglese {@code WHEN}, seguita
     * dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it QUANDO(String logMessage) {
        LOGGER.debug("   QUANDO {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code }, in inglese {@code THEN}, in italiano
     * {@code ALLORA}, seguita dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it ALLORA(String logMessage) {
        LOGGER.debug("   ALLORA {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code }, in inglese {@code AND}, in italiano
     * {@code E}, seguita dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it E(String logMessage) {
        LOGGER.debug("        E {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code }, in inglese {@code BUT}, in italiano
     * {@code MA}, seguita dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it MA(String logMessage) {
        LOGGER.debug("       MA {}", logMessage);
        return this;
    }

    /**
     * Logga la parola italiana {@code }, in inglese {@code OR}, in italiano
     * {@code O}, seguita dal logMessage.
     *
     * @param logMessage il messaggio da loggare.
     *
     * @return un riferimento a questo oggetto per consentire uno style di
     * programmazione "fluent interface".
     */
    public SelfLoggingCommenter_it O(String logMessage) {
        LOGGER.debug("        O {}", logMessage);
        return this;
    }

}
