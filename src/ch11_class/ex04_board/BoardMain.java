package ch11_class.ex04_board;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();
        boolean run = true;
        int selectNo = 0;
        while (run) {
            System.out.println("========================================================");
            System.out.println("1.글작성 2.글목록 3.글조회 4.글수정 5.글삭제 6.검색 0.종료");
            System.out.println("========================================================");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                boardService.boardCreate();
            } else if (selectNo == 2) {
                boardService.boardIndex();
            } else if (selectNo == 3) {
//                boardService.boardIndex();
                boardService.boardInquire();
            } else if (selectNo == 4) {
                boardService.boardUpdate();
            } else if (selectNo == 5) {
                boardService.boardRemove();
            } else if (selectNo == 6) {
                boardService.boardSearch();
            } else if (selectNo == 0) {
                System.out.println("시스템을 종료합니다.");
                run = false;
            } else {
                System.out.println("지금 주문하신 번호는 없는 메뉴 번호입니다.");
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
