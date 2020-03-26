package ru.geekbrains.java_1.lesson7;

import javax.swing.*;
import java.awt.*;

public class FieldPanel extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;
    FieldPanel() {
        setBackground(Color.pink);
    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("game mode: %d \nfield size %d \nwin length: %d\n", gameMode, fieldSizeX, winLength);
    }

   /*  1. Почему создавая новый объект мы иногда пишем фразу типа Object object = new Object(), а иногда просто new Object,
    а иногда Родитель object = new Object()?
    Почему так? JPanel fieldPanel = new FieldPanel(); Почему здесь нужно указывать тип JPanel, а не FieldPanel?

    2. Конструктор окна. Без разницы же в каком порядке туда записывать свойства окна?
    Сет визибл может быть и в начале конструктора? Вообще какой принцип размещения всяких кнопок, add, set,
    лейблов, слайдеров и пр.

    3. Почему add(BtnStart) добавляет кнопку в JFrame, а не в GameWindow? и зачем ее вообще
    еще добавлять, если мы уже создали объект btnStart? (Зачем нужен этот АД?  )))

    4. Можно ли получить "семейное древо" классов со списком методов? без описаний, кратко. чтобы понять что от чего и к чему
    а то со всеми панельками, компонентами, кнопками очень уж все запутанно... и про другугие классы тоже хотелось бы
    такое посмотреть. Во встроенной документации все расписано, но очень ёмко, и из-за этого ненаглядно.

    5. Почему все действия "крестонольного характера" (void StartNewGame) происходят в FieldPanel, а не в GameWindow
    или не в отдельном классе вообще?
    Я так понимаю, что FieldPanel - это чисто описание фона...

    6.зачем в классе GameWindow мы создали поле объекта private FieldPanel fieldPanel? Если это для создания объекта
    в дальнейшем,то зачем отдельно выносить это, почему нельзя потом написать при создании объекта?

    7. Почему была описка c JPanel? Она ж не просто так была, значит, в каких-то случаях такое сочетание используется...

    8. При наложении центров окон GameWindow и SettengsWindow у нас фигурируют переменные posX и posY, которые мы передаем
    в SetLocation. Получается, SetLocation располагает центр окна в передаваемые ему координаты?

    9. В голове получилась каша из методов StartNewGame, присутствующих в каждом классе. Поясните, пожалуйста,
    логику структуры: что куда откуда почему зачем и как*/
}
