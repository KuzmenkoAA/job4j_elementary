package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rls = "��� ������ ���� � �����. ������� ������ ������.";
        if ("������, ���.".equals(question)) {
            rls = "������, �����.";
        } else if ("����.".equals(question)) {
            rls = "�� ������ �������.";
        }
        return rls;
    }

    public static void main(String[] args) {
        String rls = DummyBot.answer("������, ���.");
        System.out.println(rls);
        rls = DummyBot.answer("����.");
        System.out.println(rls);
    }

}

