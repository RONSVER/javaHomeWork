package org.example.prof.lessonEleven.homeWorkEleven.taskOneSpider;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CardDeck {
    Random random = new Random();

    // Колода карт
    final private List<Card> deck = new ArrayList<>();

    // Стопка карт
    final private List<Card> pileCards = new ArrayList<>();

    // Лист мастей карт
    final private List<Suits> suitsList = Arrays.asList(Suits.values());

    // Лист ранков карт
    final private List<Rank> rankList = Arrays.asList(Rank.values());

    // Конструктор в котором происходят вызовы методов
    public CardDeck() {
        createDeck();
        displayResult();
    }
    // Метод наполняющий колоду картами со всеми ранками и мастями

    public void createDeck() {
        // Цикл ранков
        for (Rank rank : rankList) {
            // Цикл мастей
            for (Suits suits : suitsList) {
                // добавление Карт(Мастью, Ранком)
                deck.add(new Card(suits, rank));
            }
        }

        // Вызов callback для перетасовки карт. В качестве аргумента передаем уже сформулированную колоду
        shuffleDeck(deck);
    }

    // Метод отвечающий за перетасовку карт
    public void shuffleDeck(List<Card> deck) {
        // Цикл от длинны листа
        for (int i = 0; i < deck.size(); i++) {
            // Получаем рандомный индекс карты через random
            // Также используем - i да бы избежать ошибки IndexOutOfBoundsException
            int card = i + random.nextInt(deck.size() - i);
            // Присваиваем в временную переменную карту по индексу который мы нашли ранее
            Card temp = deck.get(card);
            // Теперь имитируем тасование
            // Присваеваем карты по очереди через индекс "deck.get(i)"
            // Мы присваеваем в то место где была карта по индексу что мы присвоили в temp "deck.set(-> card <-, deck.get(i));"
            deck.set(card, deck.get(i));
            // Тут же наоборот берем индекс карты по очереди deck.set(-> i <-, temp);
            // И берем присваеваем раннее установленую переменную temp (Card -> temp <- = deck.get(card);)
            deck.set(i, temp);
        }
        // Вызов callback для наполнения стопки
        initializePile();
    }

    // Метод отвечающий за наполнения стопки картами
    public void initializePile() {
        // бежим по колоде карт
        for (Card card : deck) {
            // тут пишем if-else с условием что если
            // Стопка не пуста и масть последней карты в стопке ровна с мастью текущей карты
            if (!pileCards.isEmpty() && pileCards.get(pileCards.size() - 1).getSuit() == card.getSuit()) {
                // Тогда мы удалаем последний элемент из стопки
                pileCards.remove(pileCards.size() - 1);
            } else {
                // В ином случае добавляем карту =)
                pileCards.add(card);
            }
        }
    }

    // Метод вывода в консоль
    public void displayResult() {
        System.out.println("Игра окончена! Результат:");
        System.out.println();
        // Бежим циклом и выводим
        for (Card card : pileCards) {
            System.out.println(card);
        }
    }
}

