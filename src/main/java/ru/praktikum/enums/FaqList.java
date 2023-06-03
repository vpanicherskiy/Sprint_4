package ru.praktikum.enums;

public enum FaqList {
    price("0", "0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."),
    severalScooters("1", "1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."),
    rentalTime("2", "2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."),
    rentNow("3", "3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."),
    toExtend("4", "4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."),
    charge("5", "5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."),
    cancel("6", "6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."),
    delivery("7", "7", "Да, обязательно. Всем самокатов! И Москве, и Московской области.");

    FaqList(String buttonIndex, String elementIndex, String expected) {
        this.buttonIndex = buttonIndex;
        this.elementIndex = elementIndex;
        this.expected = expected;
    }

    public String getButtonIndex() {
        return buttonIndex;
    }

    public String getElementIndex() {
        return elementIndex;
    }

    public String getExpected() {
        return expected;
    }

    private final String buttonIndex;
    private final String elementIndex;
    private final String expected;
}

