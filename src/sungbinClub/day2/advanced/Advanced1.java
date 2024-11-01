package sungbinClub.day2.advanced;

public class Advanced1 {
    public static void main(String[] args) {
        addItemAndCheckTotalCount();

        addItemAndCheckTotalCount();

        addItemAndCheckTotalCount();
    }

    private static void addItemAndCheckTotalCount() {
        ItemCounter itemCounter = new ItemCounter();
        itemCounter.addItem();

        System.out.println("itemCounter.hashCode() = " + itemCounter.hashCode());
        System.out.println("ItemCounter.totalCount = " + ItemCounter.totalCount);
        System.out.println();
    }
}
