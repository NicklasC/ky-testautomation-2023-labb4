package com.example.kyAUTapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidatorTests {

    @DisplayName("Phone number that starts with 0 is OK")
    @Test
    void phoneNumberStartsWith0IsOK() {
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("040444555"));
    }

    @DisplayName("Phone number that starts with 1 is not OK")
    @Test
    void phoneNumberStartsWith1IsNotOK() {
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("140444555"));
    }

    @DisplayName("Phone number with less then 6 digits is not OK")
    @Test
    void phoneNumberLengthLessThenSixIsNotOk() {
        //Start phonenumber with 0 as any phonenumber, no matter the length, is invalid if it does not start with 0.
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("03355"));
    }

    @DisplayName("Phone number with 6 digits is OK")
    @Test
    void phoneNumberLengthSixIsOK() {
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("0333555"));
    }

    @DisplayName("Phone number with 10 digits is OK")
    @Test
    void phoneNumberLength10IsOK() {
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("0333555777"));
    }

    @DisplayName("Phone number with 11 digits is not OK")
    @Test
    void phoneNumberLength11IsNotOK() {
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("03335557778"));
    }

    @DisplayName("Phone number with only digits is OK")
    @Test
    void phoneNumberWithDigitsIsOK() {
        // This test is for completeness and is really tested elsewhere. true / false test together with phoneNumberWithNonDigitsIsNotOK
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("0333555777"));
    }

    @DisplayName("Phone number with any non-digit is not OK")
    @Test
    void phoneNumberWithNonDigitsIsNotOK() {
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("033355F777"));
    }
}
