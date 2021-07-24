package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class TranceMusic implements Music{
    @Override
    public String getSong() {
        return "State of Trance ASOT!!!!";
    }
}
