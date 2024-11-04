package sungbinClub.day7.advanced;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        while (true) {

            printBreakLine();
            System.out.println("사용하실 메뉴를 선택해주세요.");
            System.out.println("1. 도서 등록 | 2. 도서 조회 | 3. 도서 삭제 | 4. 종료");

            int selecttMenu = getUserInputInt(SCANNER);

            if (selecttMenu == 1) {
                addBook(SCANNER, books);
                continue;
            }
            if (selecttMenu == 2) {
                readBooks(books, SCANNER);
                continue;

            }
            if (selecttMenu == 3) {
                deleteBook(books, SCANNER);
                continue;
            }
            if (selecttMenu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("잘못된 번호 입력입니다.");
            printBreakLine();
            System.out.println();
        }
    }

    private static void addBook(Scanner scanner, List<Book> books) {

        System.out.println("도서 제목을 입력하세요.");
        String title = scanner.nextLine();

        System.out.println("작가명을 입력하세요.");
        String author = scanner.nextLine();

        System.out.println("출판사를 입력하세요.");
        String publishing = scanner.nextLine();

        System.out.println("가격을 입력하세요.");
        int price = getUserInputInt(scanner);

        System.out.println("재고 수량을 입력하세요.");
        int stock = getUserInputInt(scanner);

        System.out.println("ISBN을 입력하세요.");
        String isbn = scanner.nextLine();

        Book book = new Book(title, author, publishing, price, stock, isbn);
        books.add(book);

        System.out.println("도서를 저장했습니다.");
    }

    private static void readBooks(List<Book> books, Scanner scanner) {
        if (isBooksEmpty(books)) {
            return;
        }

        printAllBooks(books);

        System.out.println("도서 검색을 이용하시겠습니까?");
        System.out.println("1. 예 | 2. 아니오(메인으로 돌아갑니다.)");
        int selectBookSearch = getUserInputInt(scanner);

        if (selectBookSearch == 1) {
            searchBook(scanner, books);
        } else if (selectBookSearch == 2) {
            System.out.println("메인으로 돌아갑니다.");
        } else {
            System.out.println("잘못된 번호 입력입니다.");
            System.out.println("메인으로 돌아갑니다.");
        }
    }

    private static void searchBook(Scanner scanner, List<Book> books) {
        System.out.println("찾고자 하는 도서명을 입력하세요.");
        String bookTitle = scanner.next();

        for (Book book : books) {
            if (book.getTitle().contains(bookTitle)) {
                printOneBook(book);
            } else {
                System.out.println("해당하는 키워드와 맞는 도서가 없습니다.");
            }
        }
    }

    private static void deleteBook(List<Book> books, Scanner scanner) {
        if (isBooksEmpty(books)) {
            return;
        }

        printAllBooks(books);

        System.out.println("삭제하실 도서의 id를 입력하세요.");
        int deleteId = scanner.nextInt();

        if (deleteId > books.size() || deleteId <= 0) {
            System.out.println("존재하지 않는 도서입니다.");
            return;
        }

        Book book = books.get(deleteId - 1);
        books.remove(book);
        System.out.println("도서를 삭제했습니다.");
    }

    private static boolean isBooksEmpty(List<Book> books) {
        if(books.isEmpty()){
            System.out.println("도서가 존재하지 않습니다.");
            return true;
        }
        return false;
    }

    private static int getUserInputInt(Scanner scanner) {
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static void printBreakLine() {
        System.out.println("==========================================================================");
    }

    private static void printOneBook(Book book) {
        System.out.printf("%-3d | %-18.18s | %-8.8s | %-8.8s | %-5d | %-3d | %-16.16s", book.getId(), book.getTitle(), book.getAuthor(), book.getPublishing(), book.getPrice(), book.getStock(), book.getIsbn());
        System.out.println();
    }

    private static void printAllBooks(List<Book> books) {
        printBreakLine();
        for (Book book : books) {
            printOneBook(book);
        }
        printBreakLine();
    }
}
