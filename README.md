# Self-Logging Comments

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![semver](https://img.shields.io/badge/semver-2.0.0-blue)](https://semver.org/)

A simple class which lets you log a code comment in the style of Behavior-Driven Development (BDD).

The idea is to replace comments with a self-logging comments. In other words, instead of writing:

```
// GIVEN a string
String aString = new String("aString");
```

you may write:

```
__.GIVEN("a string");
String aString = new String("aString");
```

that seems to me more readable then a logging instruction like:

```
LOGGER.debug("GIVEN a string");
String aString = new String("aString");
```


## Getting started

I find handy instantiating a self-logging commenter giving it a name which make easier reading the test. Usually I choose the name `__` (a double underscore):

```
SelfLoggingCommenter_en __ = new SelfLoggingCommenter_en(LOGGER);

__.GIVEN("a string");
String aString = new String("aString");

__.WHEN("you convert it to uppercase");
String theUppercasedString = aString.toUpperCase();

__.THEN("it must be uppercased");
assertThat(theUppercasedString).isEqualTo("ASTRING");
```

which produces a log like:

```
11:29:01 [main] INFO  com.taringamberini...Test - ---------
11:29:01 [main] DEBUG com.taringamberini...Test -     GIVEN a string
11:29:01 [main] DEBUG com.taringamberini...Test -      WHEN you convert it to uppercase
11:29:01 [main] DEBUG com.taringamberini...Test -      THEN it must be uppercased
```

If you like you can add a scenario too:

```
SelfLoggingCommenter_en __ = new SelfLoggingCommenter_en(LOGGER).
        SCENARIO("Converting a string to uppercase");

__.GIVEN("a string");
String aString = new String("aString");

__.WHEN("you convert it to uppercase");
String theUppercasedString = aString.toUpperCase();

__.THEN("it must be uppercased");
assertThat(theUppercasedString).isEqualTo("ASTRING");
```

which produces a log like:

```
11:29:01 [main] INFO  com.taringamberini...Test - ---------
11:29:01 [main] DEBUG com.taringamberini...Test - Scenario: Converting a string to uppercase
11:29:01 [main] DEBUG com.taringamberini...Test -     GIVEN a string
11:29:01 [main] DEBUG com.taringamberini...Test -      WHEN you convert it to uppercase
11:29:01 [main] DEBUG com.taringamberini...Test -      THEN it must be uppercased
```

If you like you can add the method name too:

```
SelfLoggingCommenter_en __ = new SelfLoggingCommenter_en(LOGGER, testInfo.getDisplayName()).
        SCENARIO("Converting a string to uppercase");

__.GIVEN("a string");
String aString = new String("aString");

__.WHEN("you convert it to uppercase");
String theUppercasedString = aString.toUpperCase();

__.THEN("it must be uppercased");
assertThat(theUppercasedString).isEqualTo("ASTRING");
```

which produces a log like:

```
11:29:01 [main] INFO  com.taringamberini...Test - --------- test_en_AnUseCase(TestInfo)
11:29:01 [main] DEBUG com.taringamberini...Test - Scenario: Converting a string to uppercase
11:29:01 [main] DEBUG com.taringamberini...Test -     GIVEN a string
11:29:01 [main] DEBUG com.taringamberini...Test -      WHEN you convert it to uppercase
11:29:01 [main] DEBUG com.taringamberini...Test -      THEN it must be uppercased
```



## Localization

You can localize in your language the words `GIVEN`, `WHEN`, `THEN`, etc ... , implementing a self-logging commenter for your language. At the moment, you can find:

* `SelfLoggingCommenter_en` in english
* `SelfLoggingCommenter_it` in italiano
