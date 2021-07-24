package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {
        System.out.println("doing my constructor in classical music");
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("go through factory method");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my initialization");
    }
    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
