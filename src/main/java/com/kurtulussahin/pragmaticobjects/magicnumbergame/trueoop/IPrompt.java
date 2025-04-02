package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

interface IPrompt {
    int prompt();

    void tooBig();

    void tooSmall();

    void match();
}